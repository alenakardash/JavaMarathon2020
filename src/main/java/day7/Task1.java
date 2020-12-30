package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015, 70, 265000);
        Airplane airplane2 = new Airplane("Airbus", 1999, 60, 255000);
        Airplane airplane3 = new Airplane("Wizzair", 1991, 60, 224000);
        Airplane airplane4 = new Airplane("EasyJet", 2004, 55, 200000);

        Airplane.compareAirplanes(airplane1, airplane2);
        Airplane.compareAirplanes(airplane2, airplane3);
        Airplane.compareAirplanes(airplane4, airplane1);

    }
}