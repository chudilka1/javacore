package com.chudilka1.app.homework.lesson14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CelebrititesRandomPicker {

    public static Celebrities getRandomCelebrityEnum () {
        ArrayList<Celebrities> celebrities = new ArrayList<>(Arrays.asList(Celebrities.values()));
        Random random = new Random();
        return celebrities.get(random.nextInt(celebrities.size()));
    }
}
