package wypozyczalniasamochodow;

/**
 *
 * @author Przemysław Chudzik, Grzegorz Zdybel
 */
public class WypozyczalniaSamochodow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pojazd p1 = new Pojazd();
        Pojazd p2 = new Pojazd("renault"," megane", 2014, 1234, "LU12345");
        Klient k1 = new Klient("Przemek", "Chudzik", "Lublin", 123443211);
        Klient k2 = new Klient("Grzegorz", "Zdybel", "Lublin", 999999999);
        
        p1.wypozycz();
        p2.wypozycz();
        p2.zwroc();
        
    }
    
}
