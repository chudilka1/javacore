package com.chudilka1.runners.homework.lesson2;
import com.chudilka1.app.homework.lesson2.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.float1 = 78.098f;
        convertor.int1 = 88;
        convertor.char1 = 'x';
        convertor.floatToChar(convertor.float1);
        convertor.intToChar(convertor.int1);
        convertor.charToInt(convertor.char1);
    }
}
