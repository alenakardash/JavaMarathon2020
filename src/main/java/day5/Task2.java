package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Red", 2020, "Harley Davidson Sportster");

        System.out.println("Motorbike model: " + motorbike.getModel());
        System.out.println("Motorbike year: " + motorbike.getYear());
        System.out.println("Motorbike color: " + motorbike.getColor());

    }
}
