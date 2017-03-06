package com.chudilka1.app.classwork.lesson12;

public class Line extends Pixel {
    Pixel[] pixelArray = new Pixel[3];
    int i = 0;

    public Line(int x, int y) {
        super(x, y);
    }

    public void addPixel(Pixel pixel) {
        pixelArray[i] = pixel;
        i++;
    }

    @Override
    public int[] getCoordinates() {
        int[] allCoordinatesForPolyline = new int[pixelArray.length * 2];
        int count = 0;
        for (Pixel pixel : pixelArray) {
            for (int coordinate : pixel.getCoordinates()) {
                allCoordinatesForPolyline[count] = coordinate;
                ++count;
            }
        }
        return allCoordinatesForPolyline;
    }
}
