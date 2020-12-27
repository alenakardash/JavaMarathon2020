package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10000);
        }

        int max = mas[0];
        int min = mas[0];
        int counter = 0;
        int sum = 0;

        for (int x : mas) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                counter++;
                sum += x;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}
