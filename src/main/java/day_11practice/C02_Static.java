package day_11practice;

import static day_11practice.C02_Static.staticMethod;

public class C02_Static {
//hem static hem instance(non-static) variables lara value assign etme zorunlulugu yoktur.
//static variables lara class icindeki tum methodlardan ulasabiliriz.
//static variables gokteki ay gibi dir. values degistiginde herkes icin degismis olur.
//static variables class a baglidir.


    static String schoolName="Yildiz College";//bunlarda class icinde main disinda olusturulur.
    static int schoolNo;
    static boolean schoolIsOpen;



    public static void main(String[] args) {

/*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
        System.out.println(schoolName);//"Yildiz college"static oldugu icin dogrudan variable ismi ile yazdirabiliriz.
        System.out.println(schoolNo);//0
        System.out.println("schoolIsOpen = " + schoolIsOpen);//false

        ////////////////////////////////

        schoolNo=102;
        System.out.println("schoolNo = " + schoolNo);//102

        staticMethod();
        System.out.println("schoolNo = " + schoolNo);//200


    }//main
    static void staticMethod(){
        schoolNo=200;
        System.out.println("schoolNo = " + schoolNo);//200

    }
}
