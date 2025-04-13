
public class TestBiblioteki {
    public static void main(String[] args) {
        // Tworzenie obiektów różnych typów
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", 1990, "Andrzej Sapkowski", 320);
        Film film1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);
        Film film2 = new Film("Titanic",1997,"James Cameron",194);
        Ksiazka ksiazka2 = new Ksiazka("The Snowman", 2007, "Jo Nesbo", 500);

        // Demonstracja polimorfizmu - przechowywanie różnych typów wtablicy typu nadrzędnego
        MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[4];
        mediaArray[0] = ksiazka1;
        mediaArray[1] = ksiazka2;
        mediaArray[2] = film1;
        mediaArray[3] = film2;

        // Demonstracja polimorfizmu - wywołanie metod na obiektach różnych typów
        System.out.println("===== INFORMACJE O WSZYSTKICH MEDIACH =====");
        for (MediaBiblioteczne media : mediaArray) {
            media.wyswietlInformacje();
            System.out.println("--------------------");
        }

        // Demonstracja operacji wypożyczania i zwracania
        System.out.println("\n===== OPERACJE WYPOŻYCZANIA I ZWRACANIA =====");
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();

        // Wywołanie metod specyficznych dla poszczególnych typów
        System.out.println("\n===== METODY SPECYFICZNE DLA TYPÓW =====");
        ksiazka2.sprawdzLiczbeStron();
        film2.sprawdzCzasTrwania();

        // Demonstracja rzutowania do wywołania metod specyficznych poprzez referencję typu bazowego
        System.out.println("\n===== RZUTOWANIE TYPÓW =====");
        for (MediaBiblioteczne media : mediaArray) {
            if (media instanceof Ksiazka) {
                // Rzutowanie i wywołanie metody specyficznej dla Ksiazka
                Ksiazka k = (Ksiazka) media;
                k.sprawdzLiczbeStron();

            } else if (media instanceof Film) {
                Film f = (Film) media;
                f.sprawdzCzasTrwania();
            }
        }

    }
}