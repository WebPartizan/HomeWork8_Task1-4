package main;

import sputnik.Sputnik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Sputnik> sputniki = new ArrayList<>();
        sputniki.add(new Sputnik("SL-6 R/B(2)", "1985-084D",
                    32814,6969, 70.42, 12847.98, 5.12, 705.92));
        sputniki.add(new Sputnik("TITAN 3A TRANSTAGE R/B", "1965-034A",
                3744,2801, 32.12, 2800.65, 6.75, 157.08));
        sputniki.add(new Sputnik("IUS R/B(1)", "1989-090C",
                26137,271, 27.76, 5150.76, 7.00, 454.28));
        sputniki.add(new Sputnik("SL-12 R/B(2)", "1991-025E",
                19164,19099, 64.97, 19123.28, 3.95, 675.51));
        sputniki.add(new Sputnik("CELESTIS 03/TAURUS R/B", "1999-070C",
                552,534, 98.25, 551.30, 7.59, 95.36));
        sputniki.add(new Sputnik("M-4S R/B", "1971-011B",
                998,980, 29.68, 984.32, 7.36, 104.73 ));
        sputniki.add(new Sputnik("SL-8 R/B", "1979-084J",
                1688,1487, 74.02, 1486.85, 7.17, 117.77));
        sputniki.add(new Sputnik("SL-12 R/B(AUX MOTOR)", "1994-076H",
                18575,781, 65.52, 12433.34, 4.20, 337.24));
        sputniki.add(new Sputnik("SL-6 R/B(2)", "1980-050B",
                39734,817, 64.78, 14450.05, 4.82, 721.47));
        sputniki.add(new Sputnik("CZ-3B R/B", "2018-067C",
                11474,94, 54.97, 10965.20, 3.63, 222.27));


        for (Sputnik i: sputniki) {
            System.out.println("Спутник - " + i.getName() + ", орбита  - " + i.getAltitude() + " км");
        }

    }
}
