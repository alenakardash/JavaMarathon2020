package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> hurtsMembers = new ArrayList<>();
        hurtsMembers.add(new MusicArtist("Theo Hutchcraft", 1985));
        hurtsMembers.add(new MusicArtist("Adam Anderson", 1986));

        List<MusicArtist> hapinessMembers = new ArrayList<>();
        hapinessMembers.add(new MusicArtist("Ivan Ivavov", 1999));

        MusicBand musicBand1 = new MusicBand("Hurts", 2009, hurtsMembers);
        MusicBand musicBand2 = new MusicBand("Happiness", 2010, hapinessMembers);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
