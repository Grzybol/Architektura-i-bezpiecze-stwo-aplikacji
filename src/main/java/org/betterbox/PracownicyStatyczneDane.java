package org.betterbox;

import java.util.ArrayList;
import java.util.List;

public class PracownicyStatyczneDane {
    private List<Pracownik> pracownicy;
    private static PracownicyStatyczneDane instance = null;
    public static PracownicyStatyczneDane getInstance() {
        if (instance == null) {
            instance = new PracownicyStatyczneDane();
        }
        return instance;
    }
    public PracownicyStatyczneDane(){
        pracownicy = new ArrayList<Pracownik>();
        pracownicy.add(new Pracownik(1, "Jan", "Kowalski", "Kierownik"));
        pracownicy.add(new Pracownik(2, "Anna", "Nowak", "Księgowa"));
        pracownicy.add(new Pracownik(3, "Piotr", "Wiśniewski", "Programista"));
        pracownicy.add(new Pracownik(4, "Katarzyna", "Dąbrowska", "Sprzątaczka"));
        pracownicy.add(new Pracownik(5, "Marek", "Lewandowski", "Kierowca"));
    }
    public List<Pracownik> pobierzPracownikow() {
        return pracownicy;
    }
    public String pobierzPracownikowHTML() {
        String tabela = "<style> td, th {border: 1px solid black;} </style>" +
                "<table>"+
                "<thead>"+
                "<tr><th>Identyfikator</th><th>Imię</th><th>Nazwisko</th><th>Stanowisko</th></tr>"+
                "</thead>";
        for (Pracownik pracownik : pracownicy) {
            tabela += "<tr><td>" + pracownik.getID() + "</td><td>" + pracownik.getImie() + "</td><td>" + pracownik.getNazwisko() + "</td><td>" + pracownik.getStanowisko() + "</td></tr>";
        }
        tabela=tabela+"</table>";
        return tabela;
    }
}
