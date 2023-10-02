package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 14, 8};
        while (numbers[0] > 0 || numbers[1] > 0 || numbers[2] > 0) {
            int maxIndex = 0;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > numbers[maxIndex]) {
                    maxIndex = i;
                }
            }
            numbers[maxIndex] -= 5;
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
