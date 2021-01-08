package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            scanner.close();

            if (list.size() != 10) {
                throw new IncorrectInput();

            } else {
                for (Integer value : list) {
                    sum += value;
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IncorrectInput e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

