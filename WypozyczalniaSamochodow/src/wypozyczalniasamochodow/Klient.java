/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wypozyczalniasamochodow;

/**
 *
 * @author Zdybel Grzegorz, Przemysław Chudzik
 */

public class Klient {
    //pola
    private String Imie;
    private String Nazwisko;
    private String Adres;
    private int Pesel;
    
    //konstruktor
    public Klient(String Imie, String Nazwisko, String Adres, int Pesel)
    {
        this.Imie=Imie;
        this.Nazwisko=Nazwisko;
        this.Adres=Adres;
        this.Pesel=Pesel;
    }//public Klienci
    //konstruktor bezparametrowy
    public Klient()
    {
     this.Adres="nieznany";
     this.Imie="brak";
     this.Nazwisko="brak";
     this.Pesel=0;
    }//public klienci
    

    
}//public class Klienci
