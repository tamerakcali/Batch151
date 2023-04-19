package day_11practice;

public class C01_Instance {

    int num;//default value 0 dir.instance variables main disinda class icinde olusturulur ve value assign etme zorunlulugu yoktur.
    String name;//null default deger
    boolean stdMi;//false dir default degeri.



    public static void main(String[] args) {

 /*

    sayi, isim, ogrenciMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

*/
        C01_Instance obj=new C01_Instance();//static main de instance leri yazmak icin object olusturmamiz gerekir.

        System.out.println(obj.num);//0
        System.out.println(obj.name);//null
        System.out.println(obj.stdMi);//false

        C01_Instance obj1=new C01_Instance();

        obj.name="Hasan";
        obj1.name="Huseyin";

        obj.num=20;
        obj1.num=25;

        System.out.println(obj1.name);//Huseyin
        System.out.println(obj.name);//Hasan
        System.out.println(obj.num);//20
        System.out.println(obj1.num);//25





    }



}
