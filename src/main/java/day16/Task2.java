package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw1 = new PrintWriter("file1.txt");
            PrintWriter pw2 = new PrintWriter("file2.txt");

            Random random = new Random();

            int numberOfDigits = 1000;

            for (int i = 0; i < numberOfDigits; i++) {
                pw1.print(random.nextInt(100) + " ");
                pw1.flush();

            }
            pw1.close();

            File file1 = new File("file1.txt");
            try {
                Scanner scanner = new Scanner(file1);

                int step = 20;
                for (int i = 0; i < numberOfDigits / step; i++) {
                    int sum = 0;
                    for (int j = 0; j < step; j++) {
                        sum += scanner.nextInt();
                    }
                    double average = (double) sum / step;
                    pw2.print(average + " ");
                    pw2.flush();
                }
                pw2.close();
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл со списоком целых чисел не найден");
            }

            File file2 = new File("file2.txt");
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при создании файла для записи чисел.");
        }

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            double sum = 0;
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            }
            System.out.println((int) sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл со средними арифметическими значениями не найден");
        }
    }
}
