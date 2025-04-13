public class Ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Autor: " + autor + "\nLiczba Stron: " + liczbaStron);
    }

    public void sprawdzLiczbeStron() {
        if (liczbaStron > 500) {
            System.out.println("Książka jest długa. Liczba Stron: " + liczbaStron);
        }else{
            System.out.println("Książka jest krótka. Liczba Stron: " + liczbaStron);
        }
    }
}
