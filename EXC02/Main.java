package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence a sequência de Fibonacci: ");
        int number = scanner.nextInt();
        if (isFibonacci(number)) {
            System.out.println(number + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(number + " não faz parte da sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int number) {
        int first = 0;
        int second = 1;

        while (second <= number) {
            if (number == second) {
                return true;
            }
            int next = first + second;
            first = second;
            second = next;
        }

        return false;
    }
}