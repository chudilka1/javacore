package com.chudilka1.app.homework.lesson7;

import java.util.Scanner;

public class Palindrome {

    //checks whether the entered word or sentence is a palindrome
    public boolean isInputPalindrome (String input) {
        boolean isPalindrome = true;
        input = input.toLowerCase().replaceAll("\\s+","");
        for (int i = 0; i < input.length() / 2; i++) {
            isPalindrome = isPalindrome && (input.charAt(i) == input.charAt(input.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println("Your input is Palindrome");
            return true;
        }
        System.out.println("Your input is NOT Palindrome");
        return false;
    }

    //checks whether the entered sentence is a palindrome (with striping whitespaces) with StringBuilder class
    public boolean isSentencePalindrome (String input) {
        input = input.replaceAll("\\s+","");
        String revertedInput = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(revertedInput)) {
            System.out.println("Your input is Palindrome. The sentence can be read backwards.");
            return true;
        }
        System.out.println("Your input is NOT Palindrome. The sentence CANNOT be read backwards.");
        return false;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String input = scanner.nextLine();
        p.isInputPalindrome(input);

        System.out.println("Second option:");
        p.isSentencePalindrome(input);
    }
}
