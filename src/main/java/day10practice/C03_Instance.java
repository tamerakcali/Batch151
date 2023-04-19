package day10practice;

public class C03_Instance {
//instance variables class in altinda, main disinda olusturulur.onun icin burada olusturuyoruz.
//variables laara static yazmiyor ve main in disinda ise instance oldugunu anlariz.
    
      int num;//instance variables lere value assign yapilmazsa default "0" zero olur.
    
      String bransName="Java";
      boolean okuldaMi;//boolen larin default value si "false" dir.
      
    
    public static void main(String[] args) {

 /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım?
    
    
****instance leri static method dan ulasabilmek  icin object olusturmamiz gerekir.
*/
        C03_Instance obj=new C03_Instance();//object class ismi ile olusturulur
        System.out.println(obj.num);//0
        System.out.println(obj.bransName);//Java
        System.out.println(obj.okuldaMi);//false

 //!!!!instance variables object e baglidir. hangi object uzerinden variable da
 //degisiklik yapildiysa, yapilan degisiklik sadece o object i baglar.

        obj.num=10;
        System.out.println(obj.num);//10

        C03_Instance obj1=new C03_Instance();
        System.out.println(obj1.num);//0
        
       obj.bransName="sql";

        System.out.println(obj.bransName);//sql

        System.out.println(obj1.bransName);//Java,cunku degisiklik degsikligi yapan objecti etkiler
                                            //obj1 de degisiklik yapilmadigi icin instance variable lari
                                            //esas alir.

        obj.okuldaMi=true;
        System.out.println(obj.okuldaMi);//true

        System.out.println(obj1.okuldaMi);//false

        obj1.num=100;
        System.out.println(obj.num);//10

        System.out.println(obj1.num);//100

    }
}
