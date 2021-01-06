package day12.task5;

import java.util.ArrayList;
import java.util.Collections;
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

    public static List<MusicBand> createBandList() {
        List<MusicBand> list = new ArrayList<>();

        MusicBand musicBand1 = new MusicBand("The Incredible Penguins", 1985);
        MusicBand musicBand2 = new MusicBand("10 Years", 1999);
        MusicBand musicBand3 = new MusicBand("The Accidents", 2002);
        MusicBand musicBand4 = new MusicBand("Kaachi", 2020);
        MusicBand musicBand5 = new MusicBand("5ive", 2000);
        MusicBand musicBand6 = new MusicBand("Led Zeppelin", 1970);
        MusicBand musicBand7 = new MusicBand("Green Day", 1990);
        MusicBand musicBand8 = new MusicBand("Hurts", 2009);
        MusicBand musicBand9 = new MusicBand("Bree Runway", 2021);
        MusicBand musicBand10 = new MusicBand("Aurora", 2015);

        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        list.add(musicBand10);

        return list;
    }

    public static List<MusicBand> shuffleBandList(List<MusicBand> list) {
        Collections.shuffle(list);
        return list;
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
