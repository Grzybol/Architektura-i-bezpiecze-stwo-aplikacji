package org.betterbox;

import java.util.ArrayList;
import java.util.List;

public class ProduktyStatyczneDane {
    private List<Produkt> produkty;
    private static ProduktyStatyczneDane instance = null;
    public static ProduktyStatyczneDane getInstance() {
        if (instance == null) {
            instance = new ProduktyStatyczneDane();
        }
        return instance;
    }
    public ProduktyStatyczneDane(){
        produkty = new ArrayList<Produkt>();
        produkty.add(new Produkt(1, "Telewizor", 2000.00));
        produkty.add(new Produkt(2, "Pralka", 1200.00));
        produkty.add(new Produkt(3, "Monitor", 2200.00));
        produkty.add(new Produkt(4, "Myszka", 40.00));
        produkty.add(new Produkt(5, "Latarka", 3.00));
    }
    public List<Produkt> pobierzProdukty() {
        return produkty;
    }
    public String pobierzProduktyHTML() {
        String tabela = "<style> td, th {border: 1px solid black;} </style>" +
                "<table>"+
                "<thead>"+
                "<tr><th>Identyfikator</th><th>Nazwa</th><th>Cena</th></tr>"+
                "</thead>";
        for (Produkt produkt : produkty) {
            tabela += "<tr><td>" + produkt.getID() + "</td><td>" + produkt.getNazwa() + "</td><td>" + produkt.getCena() + "</td></tr>";
        }
        tabela=tabela+"</table>";
        return tabela;
    }
}
