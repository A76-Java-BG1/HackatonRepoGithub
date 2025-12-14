package com.company.core.strings;

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
     * before appending the ellipses
     * @return the abbreviated String, or the original String if it is shorter
     * than {@code maxLength}
     * @throws NullPointerException if {@code source} is {@code null}
     * @author Iliyan Urumov
     */

    public static String abbreviate(String source, int maxLength) {

        if(source.isEmpty()){
            return "";
        }

        if(source.length() < maxLength){
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
        return null;
    }

    public static String concat(String string1, String string2) {



        return null;
    }

    public static boolean contains(String source, char symbol) {
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

    public static String pad(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String padEnd(String source, int length, char paddingSymbol) {
        return null;
    }

    public static String padStart(String source, int length, char paddingSymbol) {
        return null;

    }

    public static String repeat(String source, int times) {
        return null;
    }

    public static String reverse(String source) {
        return null;
    }

    public static String section(String source, int start, int end) {



        return null;
    }

    public static boolean startsWith(String source, char target) {
        return false;
    }

}
