package org.example;

class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        return cleanedWord.equals(new StringBuilder(cleanedWord).reverse().toString());
    }

    public static void main(String[] args) {
        String testWord = "level";
        if (isPalindrome(testWord)) {
            System.out.println(testWord + " є паліндромом.");
        } else {
            System.out.println(testWord + " не є паліндромом.");
        }
    }
}
