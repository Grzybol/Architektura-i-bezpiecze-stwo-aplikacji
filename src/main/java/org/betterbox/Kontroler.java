package org.betterbox;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Kontroler {
    @RequestMapping("/tabela")
    public String index() {
        String tabela = "<style>" +
                "table, th, td { border: 1px solid black; }" +
                "table { width: 60%}" +
                "th { text-align: left; padding: 8px; }" +
                "td { text-align: center; padding: 8px; }" +
                "</style>" +
                "<table>" +
                "<caption>Wzrost produkcji w latach 1991-1995 (w mln USD)</caption>" +
                "<thead>" +
                "<tr><th>1991</th><th>1992</th><th>1993</th><th>1994</th><th>1995</th></tr>" +
                "</thead>" +
                "<tbody>" +
                "<tr><td>1150</td><td>1240</td><td>1380</td><td>1420</td><td>1550</td></tr>" +
                "</tbody>" +
                "</table>";
        return tabela;
    }
    @RequestMapping("/produkt")
    public String produkt() {
        Produkt produkt = new Produkt(1, "Telewizor", 2000.00);
        return produkt.toString();
    }
    @RequestMapping("/pracownik")
    public String pracownik() {
        return new Pracownik(1, "Jan", "Kowalski", "Sprzedawca").toString();
    }
    @RequestMapping("/produkty")
    public List<Produkt> produkty() {
        return new ProduktyStatyczneDane().pobierzProdukty();
    }
    @RequestMapping("/produktyHTML")
    public String produktyHTML() {
        return new ProduktyStatyczneDane().pobierzProduktyHTML();
    }
    @RequestMapping("/pracownicy")
    public List<Pracownik> pracownicy() {
        return new PracownicyStatyczneDane().pobierzPracownikow();
    }
    @RequestMapping("/pracownicyHTML")
    public String pracownicyHTML() {
        return new PracownicyStatyczneDane().pobierzPracownikowHTML();
    }
}
