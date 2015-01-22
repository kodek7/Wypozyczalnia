/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wypozyczalniasamochodow;

/**
 *
 * @author Przemysław Chudzik
 */
public class Pojazd extends Klient{
    private String marka;
    private String model;
    private int rokProdukcji;
    private int nrSeryjny;
    private String nrRejestracyjny;
    
    
    public Pojazd(String marka, String model, int rokProdukcji, int nrSeryjny, String nrRejestracyjny){
        marka = this.marka;
        model = this.model;
        rokProdukcji = this.rokProdukcji;
        nrSeryjny = this.nrSeryjny;
        nrRejestracyjny = this.nrRejestracyjny;
    }//public Pojazd

    public Pojazd() {
        this.marka = "aaa";
        this.model = "bbb";
        this.nrRejestracyjny = "ABC123";
        this.rokProdukcji = 2000;
        this.nrSeryjny = 123456789;    
    }
    
    public int wypozycz(){
        return 0;
    }
    
    public int zwroc (){
        return 0;
    }
   
}//public class Pojazd
