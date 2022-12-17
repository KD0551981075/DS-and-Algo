package StringDS;

import java.util.*;

public class StringInterviewQuestions {
    /*
        How can a given string be reversed using recursion? (solution)
        How do you check if a string contains only digits? (solution)
        How do you find duplicate characters in a given string? (solution)
        How do you count a number of vowels and consonants in a given string? (solution)
        How do you count the occurrence of a given character in a string? (solution)
        How do you print the first non-repeated character from a string? (solution)
        How do you convert a given String into int like the atoi()? (solution)
        How do you reverse words in a given sentence without using any library method? (solution)
        How do you check if two strings are a rotation of each other? (solution)
        How do you check if a given string is a palindrome? (solution)
        How do you find the length of the longest substring without repeating characters? (solution)
        Given string str, How do you find the longest palindromic substring in str? (solution)
        How to convert a byte array to String? (solution)
        how to remove the duplicate character from String? (solution)
        How to find the maximum occurring character in given String? (solution)
        How do you remove a given character from String? (solution)
        Given an array of strings, find the most frequent word in a given array, I mean, the string that appears the most in the array. In the case of a tie, ​the string that is the smallest (lexicographically) ​is printed. (solution)
         */
    public static void main(String args[]) {

        String givenString = "cat";
        String givenString2 = "tac";

        //System.out.println(reverseString(givenString));

        /* printDuplicateMethod1(givenString);
        printDuplicateMethod2(givenString);*/

        //System.out.println(isAnagrams(givenString,givenString2));

        //permutation("datta", "");

    }

    //1> How do you reverse a given string in place? (solution)
    static String reverseString(String inputString) {

        char[] charArray = inputString.toCharArray();

        int i = 0, j = inputString.length() - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(charArray);
    }

    /*
     *2>How do you print duplicate characters from a string? (solution)
     *Using map framework to store duplicate value counts
     */
    public static void printDuplicateMethod1(String string) {

        Map<Character, Integer> duplicate = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (!duplicate.containsKey(string.charAt(i))) {
                duplicate.put(string.charAt(i), 1);
            } else {
                Integer values = duplicate.get(string.charAt(i));
                duplicate.put(string.charAt(i), values + 1);
            }
        }

        duplicate.entrySet().stream().filter(each -> each.getValue() > 1).map(each -> each.getKey()).forEach(System.out::print);
    }

    /*using set functionality
    *  2>How do you print duplicate characters from a string? (solution)
    */
    public static void printDuplicateMethod2(String string) {
        char[] charArray = string.toCharArray();
        Set<Character> uniqValues = new HashSet<>();
        Set<Character> duplicateValues = new HashSet<>();

        for (int i = 0; i < charArray.length; i++) {
            if (!uniqValues.contains(charArray[i]))
                uniqValues.add(charArray[i]);
            else
                duplicateValues.add(charArray[i]);
        }

        duplicateValues.stream()
                .forEach(System.out::print);
    }

    //3> How do you check if two strings are anagrams of each other? (solution)
    public static boolean isAnagrams(String inputString1, String inputString2) {

        char[] charArray1 = inputString1.toCharArray();
        char[] charArray2 = inputString2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return charArray2.equals(charArray1);
    }

    //4> How do you find all the permutations of a string? (solution)
    private static void permutation(String givenString, String output) {
        //break condition
        if (givenString.length() == 0) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < givenString.length(); i++) {
            char currentChar = givenString.charAt(i);
            String left = givenString.substring(0, i);
            String right = givenString.substring(i + 1);
            permutation(left + right, output + currentChar);
        }}
}
