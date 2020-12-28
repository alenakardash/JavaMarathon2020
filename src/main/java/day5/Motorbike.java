package day5;

public class Motorbike {
    private String color;
    private int year;
    private String model;

    public Motorbike() {
        this.color = "Unknown";
        this.year = 0;
        this.model = "Unknown";
    }

    public Motorbike(String color) {
        this.color = color;
        this.year = 0;
        this.model = "Unknown";
    }

    public Motorbike(String color, int year) {
        this.color = color;
        this.year = year;
        this.model = "Unknown";
    }

    public Motorbike(String color, int year, String model) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

}
