package javaders.day06typecastingstringmanipulation;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String a="Tek rakibim Dunku Ben .";
        // bu cumlenin tum harflerini buyuterek yazalim.

        //toUpperCase()methodu.
       String aUpper= a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        //toLowerCase() methodu
        String aLower=a.toLowerCase();
        System.out.println("aLower = " + aLower);

        //charAt(0) methodu
        //Bir Stringten index ten belirli bir datayi nasil aliriz?
        System.out.println("ilk karakter:"+(a.charAt(0)));

        System.out.println("Onuncu Karakter:"+(a.charAt(10)) );

        // a stringinden bastan ikinci ve sondan ikinci karakteri aliniz ve yanyana
        //yazdiriniz.

         char ikinciChar=a.charAt(1);
         char sonIkinciChar=a.charAt(20);
        System.out.println(ikinciChar+" "+sonIkinciChar);
        
        
      //Lenght() Methodu:
        //a stringinde bulunan karakter sayisini bulunuz?
        System.out.println(a.length());

        //Substring() methodu
        //a stringindeki ilk 4 datayi aliniz.

        String sunString1=a.substring(0,4);

        System.out.println(a.substring(0,4));

        //yukardaki stringin 4.dahil 7.haric karakterlerini yazdiriniz.

        String dortYedi=a.substring(4,7);


        //
        //a stringindeki Rakip kelimesini aliniz.

        System.out.println(a.substring(4,11));

        //a.contains() methodu:
        //a stringinde "bim" kelimesinin olup olmadigini kontrol ediniz.

        boolean varmi =a.contains("bim");

        //startsWith methodu
        //yukardaki stringin "T"  harfiyle baslayip baslamadigini kontrol ediniz.

        System.out.println(a.startsWith("T"));

        System.out.println(a.startsWith("Tek",3));

        //universite numaralari yil+bolum kodu+bolumegirisSirasi olarak duzenlenen bir okulda, ogrenci
        //umran hukuk fakultesinde okuyup okumadigini gosteren kodu yaziniz.
        //sinif ogr. 22, hukuk 33, bilgisyar 44, eczacilik 55, maliye 66, kimyaMuhendisligi 77 olsun.

        String str="20105501";
        str.startsWith("33",4);


        //example:get the initials of a name which contains first name and last name.


      Scanner input=new Scanner(System.in);

      String fullName=input.nextLine();
     System.out.println("Enter your firs name and last name...");

     char first=fullName.charAt(0);

     char last= fullName.split(" ")[1].charAt(0);

        System.out.println(first + " - " + last);

        //example:type to swap the integers.









    }
}
