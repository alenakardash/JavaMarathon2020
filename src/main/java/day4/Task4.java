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
        int step = 3;

        for (int i = 0; i < mas.length - (step - 1); i++) {
            sum = 0;
            for (int j = 0; j < step; j++) {
                sum += mas[i + j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
