package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bandMembers;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.bandMembers = new ArrayList<>();
    }

    public MusicBand(String name, int year, List<MusicArtist> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<MusicArtist> bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<MusicArtist> joinedBand = new ArrayList<>();

        joinedBand.addAll(musicBand1.getBandMembers());
        joinedBand.addAll(musicBand2.getBandMembers());

        musicBand2.setBandMembers(joinedBand);
        musicBand1.setBandMembers(new ArrayList<>());
    }

    public void printMembers() {
        System.out.println(bandMembers);
    }

    public List<MusicArtist> getMembers() {
        return bandMembers;
    }

}
