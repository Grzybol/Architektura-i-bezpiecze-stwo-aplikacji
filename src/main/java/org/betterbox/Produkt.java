package org.betterbox;

public class Produkt {
    private int id_produktu;
    private String nazwa_produktu;
    private double cena;
    public Produkt() {}
    public Produkt(int id_produktu, String nazwa_produktu, double cena) {
        this.setID(id_produktu);
        this.setNazwa(nazwa_produktu);
        this.setCena(cena);
    }
    public int getID() {
        return this.id_produktu;
    }
    public void setID(int id_produktu) {
        this.id_produktu = id_produktu;
    }
    public String getNazwa() {
        return this.nazwa_produktu;
    }
    public void setNazwa(String nazwa_produktu) {
        this.nazwa_produktu = nazwa_produktu;
    }
    public double getCena() {
        return this.cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public String toString() {
        return "Produkt {id_produktu=" + this.id_produktu + ", nazwa_produktu=" + this.nazwa_produktu + ", cena=" + this.cena + "}";
    }
}
