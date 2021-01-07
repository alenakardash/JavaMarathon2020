package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = createBandList();
        shuffleBandList(musicBands);

        List<MusicBand> after2000Bands = groupsAfter2000(musicBands);

        System.out.println(after2000Bands);
        System.out.println(musicBands);


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


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000Bands = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                after2000Bands.add(band);
            }
        }
        return after2000Bands;
    }
}
