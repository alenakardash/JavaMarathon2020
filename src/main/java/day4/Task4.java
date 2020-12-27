package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10000);
        }

        int sum;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < mas.length - 2; i++) {
            sum = 0;
            sum = mas[i] + mas[i + 1] + mas[i + 2];

            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
