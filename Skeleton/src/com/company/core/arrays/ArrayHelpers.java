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


    /**
     * Copies a range of values from a source array to a specific position in a
     * destination array.
     * <p>
     * This method iterates starting from the {@code destStartIndex} up to and
     * including the index specified by {@code count}. For each iteration, it assigns
     * the value from the {@code sourceArray} (incrementing from {@code sourceStartIndex})
     * to the {@code destinationArray}.
     * <p>
     * <b>Note:</b> The {@code count} parameter acts as the inclusive upper bound
     * index for the destination array, not the number of elements to copy.
     * The total number of elements copied will be {@code (count - destStartIndex + 1)}.
     * <p>
     * Example:
     * <pre>
     * int[] src = {10, 20, 30, 40, 50};
     * int[] dest = {0, 0, 0, 0, 0};
     * * // Copies src[0] to dest[1], src[1] to dest[2], src[2] to dest[3]
     * copyFrom(src, 0, dest, 1, 3);
     * * // dest is now {0, 10, 20, 30, 0}
     * </pre>
     *
     * @param sourceArray      the array to copy from
     * @param sourceStartIndex the starting index in the source array
     * @param destinationArray the array to copy to
     * @param destStartIndex   the starting index in the destination array
     * @param count            the final index in the destination array (inclusive)
     *                         to which data will be copied
     * @throws NullPointerException      if either array is {@code null}
     * @throws IndexOutOfBoundsException if copying would cause access of data
     *                                   outside array bounds
     * @author Iliyan Urumov
     */

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

        for (int i = destStartIndex; i <= count; i++) {

            destinationArray[i] = sourceArray[sourceStartIndex++];

        }

    }

    public static void fill(int[] source, int element) {

    }

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }

    public static int[] insert(int[] source, int index, int element) {
        int[] result = new int[source.length + 1];


        return result;
    }

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }

    /**
     * Returns the index of the last occurrence of the specified element within the
     * provided array.
     * <p>
     * This method iterates through the entire source array to find the target integer.
     * If the target appears multiple times, the index of the final occurrence is returned.
     * If the target is not found, the method returns -1.
     * <p>
     * Examples:
     * <pre>
     * int[] nums = {10, 20, 30, 20, 40};
     * lastIndexOf(nums, 20) returns 3
     * lastIndexOf(nums, 99) returns -1
     * </pre>
     *
     * @param source the array of integers to be searched
     * @param target the integer value to search for
     * @return the index of the last occurrence of the {@code target} in the
     * {@code source} array, or -1 if the target is not found
     * @throws NullPointerException if {@code source} is {@code null}
     * @author Iliyan Urumov
     */

    public static int lastIndexOf(int[] source, int target) {

        int index = -1;

        for (int i = 0; i < source.length; i++) {

            if (target == source[i]) {
                index = i;
            }

        }

        return index;
    }

    /**
     * Removes all occurrences of a given element in array
     *
     * @param source  the array to check for element to remove
     * @param element the element we should search for in the array and remove all of it occurrences
     * @return returns new int array without the given element
     * @author Aleksandar Yordanov
     */

    public static int[] removeAllOccurrences(int[] source, int element) {
        int[] result;
        int elementCount = 0;
        int resultIndex = 0;

        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                elementCount++;
            }
        }

        result = new int[source.length - elementCount];

        for (int i = 0; i < source.length; i++) {
            if (source[i] != element) {
                result[resultIndex] = source[i];
                resultIndex++;
            }
        }

        return result;
    }

    /**
     * Reverse the array
     *
     * @param arrayToReverse the given array to reverse
     * @return returns the reversed array
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


    /**
     * Retrieves a section of elements from the provided integer array <code>source</code>.
     *
     * @param source The source array from which the section will be retrieved
     * @param startIndex The starting index of the section (inclusive)
     * @param endIndex The ending index of the section (inclusive)
     * @return An integer array containing the section of elements from <code>source</code>
     * @author Iliyan Urumov
     */

    public static int[] section(int[] source, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex >= source.length - 1 || startIndex > endIndex) {
            return source;
        }

        endIndex = Math.min(endIndex,source.length - 1);

        int length = endIndex - startIndex + 1;

        int[] result = new int[length];


        for (int i = 0; i < result.length; i++) {

            result[i] = source[startIndex++];
        }

        return result;
    }

}
