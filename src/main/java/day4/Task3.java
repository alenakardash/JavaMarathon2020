package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mas = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int sum;
        int index = 0;

        for (int i = 0; i < mas.length; i++) {
            sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }

        }
        System.out.println(index);

    }
}
