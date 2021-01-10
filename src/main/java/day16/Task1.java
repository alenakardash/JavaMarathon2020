package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            int counter = 0;
            int sum = 0;
            while (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                sum += temp;
                counter++;
            }
            scanner.close();

            double average = (double) sum / counter;

            System.out.printf(Locale.FRANCE, average + " --> " + "%.3f", average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

