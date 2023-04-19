package day36exceptions;

public class E03 {
    public static void main(String[] args) {

 /*throws ile throw arasindaki farklar;

 1-"throws" method signature satirinda , throw ise method body icinde kullanilir
 2-throws method signature satirinda bir veya birden fazla exception ile bir defa kullanilabilir, ancak
throw   ise method body icinde bir tane exception ile tekrar tekrar kullanilabilir
3-throws dan sonra sadece exception class isimleri yazilir, throw dan sonra ise exception class dan
object olusturulur.

  */


//ex:ogrenci yasini kullanicidan alinan yasi consol ayazdiran method olusturunuz?


       printAge(23);

        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Nagetive ages are not valid");
        }

    }
    public static void printAge(int age){

    }
}
