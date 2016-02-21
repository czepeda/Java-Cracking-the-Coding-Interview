/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg8.draw.monochrome.screen;

/**
 *
 * @author czepeda
 */
/**
 * A monochrome screen is stored as a single array of bytes, allowing eight
 * consecutive pixels to be stored in one byte.The screen has width w, where w
 * is divisible by 8 (that is, no byte will be split across rows). The height of
 * the screen, of course, can be derived from the length of the array and the
 * width. Implement a function drawHorizontalLine(byte[] screen, int width, int
 * x1, int x2, int y) which draws a horizontal line from (x1, y) to (x2, y).
 */
public class DrawMonochromeScreen {

    public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int startOffset = x1 % 8;
        int firstByte = startOffset == 0 ? x1 / 8 : x1 / 8 + 1;
        int endOffset = x2 % 8;
        int lastByte = endOffset == 7 ? x2 / 8 : x2 / 8 - 1;

        for (int i = firstByte; i <= lastByte; i++) {
            screen[i + width / 8 * y] = (byte) 0xFF;
        }

        byte startMask = (byte) (0xFF >> startOffset);
        byte endMask = (byte) ~(0xFF >> (endOffset + 1));

        if (x1 / 8 == x2 / 8) {
            byte mask = (byte) (startMask & endMask);
            screen[x1 / 8 + width / 8 * y] |= mask;
        } else {

            if (startOffset != 0) {
                screen[firstByte - 1 + width / 8 * y] |= startMask;
            }

            if (endOffset != 0) {
                screen[lastByte + 1 + width / 8 * y] |= endMask;
            }

        }

    }

    public static void main(String[] args) {
        byte[] screen = new byte[16];
        int width = 32;

        printScreen(screen, width);
        //drawLine(screen, width, 0, 6, 3);
        //printScreen(screen, width);
        //drawLine(screen, width, 1,40, 1);
        drawLine(screen, width, 2, 60, 0);
        //drawLine(screen, width, 0, 6, 0);
        printScreen(screen, width);
    }

    private static void printScreen(byte[] screen, int width) {
        int num = 1, widthNum = width / 8;
        for (byte b : screen) {
            for (int i = 7; i >= 0; --i) {
                System.out.print((b >> i) & 1);
            }
            if (num % widthNum == 0) {
                System.out.println();
            }
            ++num;
        }
        System.out.println();
    }
}
