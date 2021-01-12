package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] num = {1, 1, 1, 1, 5};

        System.out.println(recursionSum(num, 0));
    }

    public static int recursionSum(int[] mas, int n) {
        if (n == mas.length - 1) {
            return mas[mas.length - 1];
        } else {
            return mas[n] + recursionSum(mas, n + 1);
        }

    }
}
