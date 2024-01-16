public class Primzahlgenerator {
    private int startwert;

    public Primzahlgenerator(int startwert) {
        this.startwert = startwert;
    }

    public int erzeugePrimzahl() {
        do {
            startwert++;
        } while ( ! istPrimzahl(startwert) );
        return startwert;
    }

    private boolean istPrimzahl(int zahl) {
        for (int teiler = 2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0) return false;
        }
        return true;
    }
}
