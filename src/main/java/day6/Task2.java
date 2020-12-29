package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2001, 64, 250000);

        airplane.setYear(2005);
        airplane.setLength(70);
        airplane.fillUp(200);
        airplane.fillUp(1);
        airplane.info();

    }
}
