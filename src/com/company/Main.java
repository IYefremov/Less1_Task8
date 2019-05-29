package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        String hello = "Hello World";

        char[] helloArray = hello.toCharArray();
        int[] helloIntArray = new int[hello.length()];

        // инициализация массива значениями ascii
        for (int i = 0; i < helloArray.length; i++) {
          helloIntArray[i] = (int) helloArray[i];       // добавляем в массив значение ascii для символа
        }

        ArrayList<Character> arrOfChars = transformIntToChar(helloIntArray);
        printList(arrOfChars);

    }


    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }


    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}