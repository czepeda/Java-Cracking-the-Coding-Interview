
import java.util.Stack;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks
 * of different sizes which can slide onto any tower. The puzzle starts with
 * disks sorted disks sorted in ascending order of size from top to bottom
 * (i.e., each disk sits on top of an even larger one). You have the following
 * constraints: (1) Only one disk can be moved at a time. (2) A disk is slid off
 * the top of one tower onto the next tower. (3) A disk can only be placed on
 * top of a larger disk. Write a program to move the disks from the first tower
 * to the last using stacks.
 */
public class HanoiTowers {

    static class Tower {

        int id;
        Stack<Integer> disks;

        public Tower(int id) {
            this.id = id;
            this.disks = new Stack<Integer>();
        }

        public void printTower() {
            for (int disk : disks) {
                System.out.print(disk + " ");
            }
            System.out.println("[TOP]");
        }
    }

    public static void moveTop(Tower from, Tower to) {
        if (to.disks.isEmpty() || from.disks.peek() < to.disks.peek()) {
            System.out.printf("Move disk %d from %d tower to %d tower ", from.disks.peek(), from.id, to.id);

            to.disks.push(from.disks.pop());
        } else {
            System.out.printf("Unable to move disk %d on top of smaller disk %d from %d tower to %d tower ", from.disks.peek(), to.disks.peek(), from.id, to.id);
        }

    }

    public static void moveDisks(int n, Tower from, Tower to, Tower buffer) {
        if (n <= 0) {
            return;
        }

        moveDisks(n - 1, from, buffer, to);
        moveTop(from, to);
        moveDisks(n - 1, buffer, to, from);

    }

    public static void printTowers(Tower[] towers) {
        for (Tower t : towers) {
            System.out.print("Tower " + t.id + ": ");
            t.printTower();
        }
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        Tower[] towers = new Tower[3];
        int DISKS_SIZE = 5;

        for (int i = 0; i < towers.length; i++) {
            towers[i] = new Tower(i + 1);
        }

        for (int i = DISKS_SIZE; i > 0; i--) {
            towers[0].disks.push(i);

        }

        System.out.println("BEFORE ---------------------");
        printTowers(towers);

        System.out.println("\nMOVING ---------------------");
        moveDisks(DISKS_SIZE, towers[0], towers[2], towers[1]);

        System.out.println();
        System.out.println("\nAFTER ----------------------");
        printTowers(towers);

    }
}
