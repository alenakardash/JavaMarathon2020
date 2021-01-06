package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = MusicBand.createBandList();
        MusicBand.shuffleBandList(musicBands);

        List<MusicBand> after2000Bands = groupsAfter2000(musicBands);

        System.out.println(after2000Bands);
        System.out.println(musicBands);


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
