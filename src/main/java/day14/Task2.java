package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] mas = line.split(" ");
                int x = Integer.parseInt(mas[1]);
                if (x < 0) {
                    list = new ArrayList<>();
                    scanner.close();
                    throw new IncorrectInput();
                } else {
                    list.add(line);
                }
            }
            scanner.close();

            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return null;
        } catch (IncorrectInput e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
    }

}

