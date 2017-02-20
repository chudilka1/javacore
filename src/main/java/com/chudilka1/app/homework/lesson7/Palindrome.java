package com.chudilka1.app.homework.lesson7;

import java.util.Scanner;

public class Palindrome {
    private String pal = "Your input is Palindrome. The word/sentence can be read backwards.";
    private String notpal = "Your input is NOT Palindrome. The word/sentence CANNOT be read backwards.";

    //1. checks whether the entered word or sentence is a palindrome
    public boolean isPalindromeForLoop(String input) {
        boolean isPalindrome = true;
        input = input.toLowerCase().replaceAll("\\s+","");
        for (int i = 0; i < input.length() / 2; i++) {
            isPalindrome = isPalindrome && (input.charAt(i) == input.charAt(input.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println(pal);
            return true;
        }
        System.out.println(notpal);
        return false;
    }

    //2. checks whether the entered sentence is a palindrome (with striping whitespaces) with StringBuilder class
    public boolean isPalindromeStringBuilder(String input) {
        input = input.replaceAll("\\s+","");
        String revertedInput = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(revertedInput)) {
            System.out.println(pal);
            return true;
        }
        System.out.println(notpal);
        return false;
    }

    public static void main(String[] args) {
        //1. launch isPalindromeForLoop
        Palindrome p = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String input = scanner.nextLine();
        p.isPalindromeForLoop(input);

        //2. launch isPalindromeStringBuilder
        System.out.println("Second option:");
        p.isPalindromeStringBuilder(input);
    }
}
