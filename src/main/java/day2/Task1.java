package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      System.out.println("Укажите количество этажей в здании");

        int floorNumber = sc.nextInt();

        if (floorNumber >= 1 && floorNumber <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorNumber >= 5 && floorNumber <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorNumber >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
