package com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    public static int[] add(int[] source, int element) {
        return new int[1];
    }

    public static int[] addFirst(int[] source, int element) {
        return new int[1];
    }

    public static int[] addAll(int[] source, int... elements) {
        return new int[1];
    }

    public static boolean contains(int[] source, int element) {
        return false;
    }

    public static void copy(int[] sourceArray, int[] destinationArray, int count) {

    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    /**
     Reverse the array
     *
     * @param arrayToReverse the given array to reverse
     *
     *
     * @return returns the reversed array
     *
     * @author Aleksandar Yordanov
     */
    public static void reverse(int[] arrayToReverse) {
        int[] result = new int[arrayToReverse.length];
        int resultIndex = 0;
        for (int i = arrayToReverse.length - 1; i >= 0; i--) {
            result[resultIndex] = arrayToReverse[i];
            resultIndex++;
        }

        for (int i = 0; i < arrayToReverse.length; i++) {
            arrayToReverse[i] = result[i];
        }
    }

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }

}
