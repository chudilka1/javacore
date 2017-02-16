package com.chudilka1.app.classwork.lesson7;

public class SimplePalindrome {
    public String palindrome(String input) {
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            isPalindrome = isPalindrome && (input.charAt(i) == input.charAt(input.length() - i - 1));
        }
        if (isPalindrome)
            System.out.println("SimplePalindrome");
        else
            System.out.println("Not palindrome");
        return input;
    }

    public static void main(String[] args) {
        SimplePalindrome p = new SimplePalindrome();
        p.palindrome("moMmom");
    }
}
