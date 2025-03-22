package org.betterbox;

public class Pracownik {
    private int id_pracownika;
    private String imie;
    private String nazwisko;
    private String stanowisko;
    public Pracownik() {}
    public Pracownik(int id_pracownika, String imie, String nazwisko, String stanowisko) {
        this.setID(id_pracownika);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setStanowisko(stanowisko);

    }
    public int getID() {
        return this.id_pracownika;
    }
    public void setID(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }
    public String getImie() {
        return this.imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return this.nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getStanowisko() {
        return this.stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public String toString() {
        return "Pracownik {id_pracownika=" + this.id_pracownika + ", imie=" + this.imie + ", nazwisko=" + this.nazwisko + ", stanowisko=" + this.stanowisko + "}";
    }
}
