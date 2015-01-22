/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package klient;

/**
 *
 * @author Zdybel Grzegorz
 */

public class Klienci {
    private String Imie;
    private String Nazwisko;
    private String Miejsowosc;
    private String Adres;
    private int Pesel;
    
    public Klienci(String Imie, String Nazwisko, String Miejscowosc, String Adres, int Pesel)
    {
        this.Imie=Imie;
        this.Nazwisko=Nazwisko;
        this.Miejsowosc=Miejscowosc;
        this.Adres=Adres;
        this.Pesel=Pesel;
    }
    public Klienci()
    {
     this.Adres="nieznany";
     this.Imie="brak";
     this.Nazwisko="brak";
     this.Miejsowosc="brak";
     this.Pesel=0;
    }
}
