package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("Black");
        car.setYear(2020);
        car.setModel("BMW");

        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car year: " + car.getYear());

    }
}
