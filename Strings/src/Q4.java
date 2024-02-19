package Strings.src;

import java.util.Arrays;

public class Q4 {
    public static boolean areAnagrams(String str1, String str2) {
        // If the length of the strings is different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println("Are " + str1 + " and " + str2 + " anagrams? " + areAnagrams);
    }
}
