package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> hurtsMembers = new ArrayList<>();
        hurtsMembers.add("Theo Hutchcraft");
        hurtsMembers.add("Adam Anderson");

        List<String> hapinessMembers = new ArrayList<>();
        hapinessMembers.add("Ivan Ivanov");

        MusicBand musicBand1 = new MusicBand("Hurts", 2009, hurtsMembers);
        MusicBand musicBand2 = new MusicBand("Happiness", 2010);

        musicBand2.setBandMembers(hapinessMembers);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
