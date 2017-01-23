package net.academy;

public class LeadingZeros {

    protected static void swap(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[j];
                array[j++] = 0;
            }
        }
    }

    protected static void swapFromBackwards(int[] array) {
        int i = array.length - 1;
        int j = array.length - 1;
        while (i >= 0) {
            if (array[i] != 0) {
                array[j--] = array[i];
            }
            i--;
        }
        while (j >= 0) array[j--] = 0;
    }
}
