package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1985);

        car.info();
        System.out.println(car.yearDifference(2020));
        System.out.println(car.yearDifference(1900));
        System.out.println(car.yearDifference(0));

        Motorbike motorbike = new Motorbike("White", 2019, "Mercedes");

        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));
        System.out.println(motorbike.yearDifference(1695));
        System.out.println(motorbike.yearDifference(-1000));

    }
}
