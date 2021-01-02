package day8;

public class Task1 {
    public static void main(String[] args) {
        // решение методом конкатенации обычных строк
        long start1 = System.currentTimeMillis();

        String resultWithConcat = "";

        for (int i = 0; i < 20001; i++) {
            resultWithConcat = resultWithConcat + i + " ";
        }

        System.out.println(resultWithConcat);

        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;

        System.out.println("Время работы программы с использованием конкатенации: " + timeConsumedMillis1);

        // решение с помощью объекта StringBuilder
        long start2 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 20001; i++) {
            stringBuilder = stringBuilder.append(i).append(" ");
        }

        System.out.println(stringBuilder.toString());

        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        System.out.println("Время работы программы с использованием StringBuilder: : " + timeConsumedMillis2);

        System.out.println("StringBuilder работает в " + timeConsumedMillis1 / timeConsumedMillis2 + " раз быстрее");

    }
}