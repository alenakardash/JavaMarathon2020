package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dividend = scanner.nextDouble();
        double divider = scanner.nextDouble();

        while (divider != 0) {
            System.out.println(dividend / divider);
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();
        }
        scanner.close();
    }
}
