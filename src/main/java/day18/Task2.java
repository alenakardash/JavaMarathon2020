package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(12727767));

    }

    public static int count7(int number) {
        if (Math.abs(number) < 1) {
            return 0;
        } else {
            int temp = number % 10;
            if (temp == 7) {
                return 1 + count7(number / 10);
            } else {
                return count7(number / 10);
            }
        }
    }
}
