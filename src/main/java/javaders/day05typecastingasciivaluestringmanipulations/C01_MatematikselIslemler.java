package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {

        //Note1: javada farkli data typeleri arasinda islem yapiliyorsa
        //sonuc buyuk olan data type nin turunde olur.
        //Note 2:karsilastirma operatorlerinde sonuc hep "boolean" olur
        //ornegin:< ,>, ==, ||, &&, <=, >= != gibi

        double sonuc = 4.0*(5+2)/3;

        System.out.println(" sonuc");

        //sonuc note1 de belirtildigi gibi iki farkli data type oldugundan sonucu buyuk olan double
        //data type nda yazdirir. 4.0 double digerleri int, double>int oldugundan sonuc double yazar.

        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2;
        System.out.println("sayi1 + sayi3/sayi2");
        // yani yazdirdigimizda, 5+2+2.0 cunku sayi3 double oldugu icin consolde double 6.0 sonuc yazilir,yani 6 yazdirmaz.


    }
}
