package pkg1.pkg4.replaces.spaces.with.string;

public class Main {

    public static void main(String[] args) {
        String str = "cesar zepeda      ";
        char[] str_array = str.toCharArray();
		// System.out.println(replaceSpace_NotInPlace(str));

        // 13 is the true length
        replaceSpaces(str_array, 12);
        System.out.println(new String(str_array));

    }

    private static void replaceSpaces(char[] str_array, int length) {
        int spaceCount = 0, newLength, i;

        //Get Space Count
        for (i = 0; i < length; i++) {

            if (str_array[i] == ' ') {
                spaceCount++;

            }

        }

        //Get new length of String Array
        newLength = length + spaceCount * 2;

        str_array[newLength] = '\0';

        //Start for loop by reading the actual length of the String - 1 for last position (12 - 1)
        for (i = length - 1; i >= 0; i--) {
            //If String character is blank append the newLength String wth characters
            if (str_array[i] == ' ') {
                str_array[newLength - 1] = '0';
                str_array[newLength - 2] = '2';
                str_array[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                //First time in loop str[14 - 1] = str[12 - 1]  
                str_array[newLength - 1] = str_array[i];
                newLength = newLength - 1;
            }

        }

    }

}
