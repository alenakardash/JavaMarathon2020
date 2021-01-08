package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] mas = line.split(" ");

                String name = mas[0];
                int age = Integer.parseInt(mas[1]);
                if (age < 0) {
                    list = new ArrayList<>();
                    throw new IncorrectInput();
                } else {
                    list.add(new Person(name, age));
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