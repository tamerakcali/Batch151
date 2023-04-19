package day_16practice_inheritance_Overriding;

public class Auto {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, varible ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.

    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

    protected String move="Autos move on tyres";
    protected String speed="Autos run as their engine power";
    protected String fuel="Autos can run with different fuel";
    protected String brand="Autos have produced brand name";


         protected void engine(){
        System.out.println("Autos use different brand end power");


        }
        protected void fuelConsumption(){
        System.out.println("Autos consume different as their engine" );
    }

}
