package com.company.core.strings;

import java.util.Locale;

@SuppressWarnings("StringConcatenationInLoop")
public class StringHelpers {


    /**
     * Abbreviates a String using ellipses. This method checks the length of the
     * source string and truncates it if it exceeds the specified maximum length.
     * <p>
     * If the {@code source} string is empty, an empty string is returned.
     * If the {@code source} string's length is less than {@code maxLength},
     * the original string is returned without modification.
     * <p>
     * If truncation occurs, the returned string will consist of the first
     * {@code maxLength} characters of the source string, followed by "...",
     * resulting in a total length of {@code maxLength + 3}.
     *
     * @param source    the String to be abbreviated
     * @param maxLength the maximum number of characters to keep from the original string
     *                  before appending the ellipses
     * @return the abbreviated String, or the original String if it is shorter
     * than {@code maxLength}
     * @throws NullPointerException if {@code source} is {@code null}
     * @author Iliyan Urumov
     */

    public static String abbreviate(String source, int maxLength) {

        if (source.isEmpty()) {
            return "";
        }

        if (source.length() < maxLength) {
            return source;
        }


        String abbreviatedString = "";


        for (int i = 0; i < maxLength; i++) {

            char currentChar = source.charAt(i);

            abbreviatedString += currentChar;


        }


        abbreviatedString += "...";


        return abbreviatedString;
    }

    public static String capitalize(String source) {

        if (source.isEmpty()){
            return "";
        };

        String subString = source.substring(1, source.length());
        String firstLetter = String.valueOf(source.toCharArray()[0]).toUpperCase();
        String result = firstLetter + subString;




        return result;
    }

    public static String concat(String string1, String string2) {


        return null;
    }

    public static boolean contains(String source, char symbol) {
        char[] sourceToCharArray = source.toCharArray();
        for (int i = 0; i < sourceToCharArray.length; i++) {
            char currentSymbol = sourceToCharArray[i];
            if (symbol == currentSymbol){
                return true;
            }

        }
        return false;
    }

    public static boolean endsWith(String source, char target) {
        return false;
    }

    public static int firstIndexOf(String source, char target) {
        return 0;
    }

    public static int lastIndexOf(String source, char symbol) {
        return 0;
    }

    /**
     Adds - sign in the both sides of the string if the given length is larger than the given string length
     *
     * @param source the given string
     *
     * @param length the length we should compare with our string length
     *
     * @return returns new string with added - signs in both sides or the given string input if the string length is larger than the given length
     *
     * @author Aleksandar Yordanov
     */
    public static String pad(String source, int length, char paddingSymbol) {
        String result = "";
        if(length > source.length()){
            int symbolCount = length - source.length();

            for (int i = 0; i < symbolCount / 2; i++) {
                result += paddingSymbol;
            }

            result += source;

            for (int i = 0; i < symbolCount / 2; i++) {
                result += paddingSymbol;
            }
        }

        if(source.length() > length){
            return source;
        }

        return result;
    }

    /**
     Adds - sign in the end of the string if the given length is larger than the given string length
     *
     * @param source the given string
     *
     * @param length the length we should compare with our string length
     *
     * @return returns new string with added - signs in the end or the given string input if the string length is larger than the given length
     *
     * @author Aleksandar Yordanov
     */

    public static String padEnd(String source, int length, char paddingSymbol) {

        if(length > source.length()){
            int symbolCount = length - source.length();

            for (int i = 0; i < symbolCount; i++) {
                source += paddingSymbol;
            }
        }

        if(source.length() > length){
            return source;
        }

        return source;
    }

    /**
     Adds - sign in at the beginning of the string if the given length is larger than the given string length
     *
     * @param source the given string
     *
     * @param length the length we should compare with our string length
     *
     * @return returns new string with added - signs in the beginning or the given string input if the string length is larger than the given length
     *
     * @author Aleksandar Yordanov
     */


    public static String padStart(String source, int length, char paddingSymbol) {

        String result = "";
        if(length > source.length()){
            int symbolCount = length - source.length();

            for (int i = 0; i < symbolCount; i++) {
                result += paddingSymbol;
            }


            result += source;
        }

        if(source.length() > length){
            return source;
        }

        return result;
    }

    public static String repeat(String source, int times) {
        return null;
    }

    /**
     * Returns a new string that is the reverse of the specified source string.
     * <p>
     * This method iterates through the characters of the source string in reverse
     * order (from the last character to the first) and concatenates them to
     * form a new string.
     * <p>
     * For example:
     * <pre>
     * reverse("Hello") returns "olleH"
     * reverse("12345") returns "54321"
     * </pre>
     *
     * @param source the String to be reversed
     * @return a string containing the characters of the {@code source} string
     * in reverse order, or an empty string if {@code source} is empty
     * @throws NullPointerException if {@code source} is {@code null}
     * @author Iliyan Urumov
     */

    public static String reverse(String source) {

        String result = "";

        for (int i = source.length() - 1; i >= 0; i--) {

            result += source.charAt(i);
        }


        return result;
    }



    /**
     * Extracts a substring from the specified source string, beginning at the
     * specified {@code start} index and extending to the {@code end} index
     * (inclusive).
     * <p>
     * This method iterates through the source string and collects characters
     * starting from position {@code start} up to and including position {@code end}.
     * <p>
     * Examples:
     * <pre>
     * section("Hello World", 0, 4) returns "Hello"
     * section("012345", 2, 4)      returns "234"
     * </pre>
     *
     * @param source the string containing the section to be extracted
     * @param start  the beginning index, inclusive
     * @param end    the ending index, inclusive
     * @return the specified substring
     * @throws NullPointerException      if {@code source} is {@code null}
     * @throws IndexOutOfBoundsException if the {@code start} or {@code end}
     * indices are negative or larger than the length
     * of the {@code source} string
     *
     * @author Iliyan Urumov
     */

    public static String section(String source, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {

            result += source.charAt(i);

        }


        return result;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
