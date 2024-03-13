package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        String reversedString = inverterString(input);

        System.out.println("Palavra invertida: " + reversedString);
    }

    public static String inverterString(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        ArrayList<Character> newChar = new ArrayList<>(length);

        for (int i = length - 1; i >= 0; i--) {
            newChar.add(charArray[i]);
        }

        StringBuilder invertedString = new StringBuilder();
        for (char c : newChar) {
            invertedString.append(c);
        }

        return invertedString.toString();
    }
}