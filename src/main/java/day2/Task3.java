package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }

        int value = a + 1;
        while (value < b) {
            if (value % 5 == 0 && value % 10 != 0) {
                System.out.print(value + " ");
            }
            value++;
        }
    }

}
