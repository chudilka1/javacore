package com.chudilka1.app.homework.lesson14;


public class CelebrityGuessResult {
    private boolean isAlive;

    public static boolean isAgeGuessed(Celebrities celebrities, int age) {
        boolean flag = false;
        if (celebrities.getAge() == age) {
            System.out.println("You GUESSED the age of " + celebrities.getName() + "\n");
            flag = true;
        } else {
            System.out.println("You DID NOT geuss the age of " + celebrities.getName());
            flag = false;
        }
        return flag;
    }

    public boolean isYesNoInput(Celebrities celebrities, String input) {
        //assign boolean to alive depending on answer
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
            if (input.equalsIgnoreCase("yes")) {
                this.isAlive = true;
            } else {
                this.isAlive = false;
            }
            return true;
        } else {
            System.out.println("You should enter only \'yes\' or \'no\': ");
        }
        return false;
    }

    public boolean isAliveGuessed(Celebrities celebrities) {
        if (celebrities.isAlive() == this.isAlive) {
            if (this.isAlive) {
                System.out.println("You guessed that " + celebrities.getName() + " is still alive");
            } else {
                System.out.println("You guessed. RIP " + celebrities.getName());}
            return true;
        } else {
            System.out.println(celebrities.getName() + " could be offended. " + celebrities.getName() + " IS alive!");
        }
        return false;
    }
}
