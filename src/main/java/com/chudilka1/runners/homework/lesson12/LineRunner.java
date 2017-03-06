package com.chudilka1.runners.homework.lesson12;

import com.chudilka1.app.classwork.lesson12.Line;
import com.chudilka1.app.classwork.lesson12.Pixel;
import java.util.Arrays;

public class LineRunner {
    public static void main(String[] args) {
        Pixel pixel1 =  new Pixel(10, 14);
        Pixel pixel2 =  new Pixel(14, 18);
        Pixel pixel3 =  new Pixel(18, 20);
        Line line = new Line(10, 20);
        line.addPixel(pixel1);
        line.addPixel(pixel2);
        line.addPixel(pixel3);
        System.out.println(Arrays.toString(line.getCoordinates()));
    }
}
