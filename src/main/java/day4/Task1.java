package day4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число, определяющее длину массива");

        int masLength = scanner.nextInt();

        scanner.close();

        int[] mas = new int[masLength];

        Random random = new Random();

        for (int i = 0; i < masLength; i++) {
            mas[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mas));
        System.out.println("Длина массива: " + mas.length);

        int moreThanEight = 0;

        for (int number : mas) {
            if (number > 8) {
                moreThanEight++;
            }
        }
        System.out.println("Количество чисел больше 8: " + moreThanEight);

        int equalToOne = 0;

        for (int number : mas) {
            if (number == 1) {
                equalToOne++;
            }
        }
        System.out.println("Количество чисел равных 1: " + equalToOne);

        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int number : mas) {
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);

        int sum = 0;
        for (int number : mas) {
            sum += number;
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);

    }
}
