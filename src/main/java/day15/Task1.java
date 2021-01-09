package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileInput = new File("src/main/resources/shoes.csv");
        File fileOutput = new File("src/main/resources/missing_shoes");

        try {
            Scanner scanner = new Scanner(fileInput);
            PrintWriter pw = new PrintWriter(fileOutput);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] mas = line.split(";");
                if (Integer.parseInt(mas[2]) == 0) {
                    pw.println(mas[0] + ", " + mas[1] + ", " + mas[2]);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл для обработки данных не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл: одно из полей не заполнено");
        }
    }
}