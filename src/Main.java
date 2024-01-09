public class Main {
    public static void main(String[] args) {
        Primzahlgenerator primzahlgenerator = new Primzahlgenerator(100);
        System.out.println( primzahlgenerator.erzeugePrimzahl() );
        System.out.println( primzahlgenerator.erzeugePrimzahl() );
        System.out.println( primzahlgenerator.erzeugePrimzahl() );

        /*
         * Man könnte jetzt noch das Programm erweitern:
         * - Startwert vom Anwender erfragen
         * - Anazhl der zu erzeugenden Primzahlen abfragen
         */
    }
}
