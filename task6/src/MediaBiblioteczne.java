public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }
    public void wypozycz(){
        if(dostepny){
            this.dostepny = false;
            System.out.println("Udało się wypożyczyć");
        }else {
            System.out.println("Jest juz wypożyczone");
        }
    }
    public void zwroc(){
        if(dostepny==false){
            this.dostepny = true;
            System.out.println("Było już wypożyczone");
        }else {
            System.out.println("Nie było wypożyczone");
        }
    }
    public void wyswietlInformacje(){
        System.out.println("Tytul: " + this.tytul + ", rok wydania: " + this.rokWydania);
        System.out.println(dostepny ? "Dostępne" : "Wypożyczone");
    }
}
