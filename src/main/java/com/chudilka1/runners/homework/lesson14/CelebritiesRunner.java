package com.chudilka1.runners.homework.lesson14;

import com.chudilka1.app.homework.lesson14.Celebrities;
import com.chudilka1.app.homework.lesson14.CelebrititesRandomPicker;
import com.chudilka1.app.homework.lesson14.CelebrityGuessResult;

import java.util.Random;
import java.util.Scanner;

public class CelebritiesRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CelebrityGuessResult result = new CelebrityGuessResult();
        Celebrities randomCelebrity = CelebrititesRandomPicker.getRandomCelebrityEnum();
        String randomCelebrityName = randomCelebrity.getName();
        System.out.println(randomCelebrityName +
                "\nGuess age of " + randomCelebrityName + ": ");
        int tries = 3; //allowed number of successful tries
        int counter = 0;

        //if age is int, and there were less than 3 successful guesses, continue running
        while (scanner.hasNextInt() && counter < tries) {
            int age = scanner.nextInt();

            //if age not guessed pick randomly the other celebrity
            if (CelebrityGuessResult.isAgeGuessed(randomCelebrity, age)) {
                System.out.println(randomCelebrityName +
                        "\nGuess whether " + randomCelebrityName + " is still alive: ");
                String alive = scanner.next();

                //if answer 'yes'/'no' and it's right, add 1 to successful tries
                while (!alive.equalsIgnoreCase("no") || !alive.equalsIgnoreCase("yes")) {
                    if (result.isYesNoInput(randomCelebrity, alive)) {
                        if (result.isAliveGuessed(randomCelebrity)) {
                            System.out.println("GOOD!!!\n");
                            counter += 1;
                        } else {
                            System.out.println("Try with the other celebrity\n");
                        }
                        break;
                    } else {
                        alive = scanner.next();
                    }
                }

                //if there were 3 successful tries, do not run again
                if (counter < 3) {
                    randomCelebrity = CelebrititesRandomPicker.getRandomCelebrityEnum();
                    randomCelebrityName = randomCelebrity.getName();
                    System.out.println(randomCelebrityName +
                            "\nGuess age of " + randomCelebrityName + ": ");
                } else {
                    break;
                }
            } else {
                System.out.println("Try with the other celebrity\n");
                randomCelebrity = CelebrititesRandomPicker.getRandomCelebrityEnum();
                randomCelebrityName = randomCelebrity.getName();
                System.out.println(randomCelebrityName +
                        "\nGuess age of " + randomCelebrityName + ": ");
            }
        }

        System.out.println("At least you've done that");
    }
}
