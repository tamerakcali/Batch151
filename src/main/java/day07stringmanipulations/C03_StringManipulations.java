package day07stringmanipulations;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

    /*exam:asagidaki kurallara gore user in girdigi password u kontrol ediniz.

     1-en az 8 karakterden   olussun
     2-password space icermesin
     3-en az bir tane buyuk harf olsun
     4-en az bir tane kucuk harf olsun
     5-en az bir tane seymbol olsun
     6-en az bir tane rakam olsun
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu 1-en az 8 karakterden   olussun\n" +
                "     2-password space icermesin\n" +
                "     3-en az bir tane buyuk harf olsun\n" +
                "     4-en az bir tane kucuk harf olsun\n" +
                "     5-en az bir tane seymbol olsun\n" +
                "     6-en az bir tane rakam olsun " + input);
        String pwd=input.nextLine();
        //1-en az 8 karakterden   olussun
        boolean first=pwd.length()>7;//uzunlugu length methodu ile aliyorduk.

        //2-password space icermesin
        boolean second=!pwd.contains(" ");//"!" isareti olumsuz, icermesin komutu verir.

        //3-en az bir tane buyuk harf olsun
        boolean third=pwd.replaceAll("[^A-Z]","").length()>0;
        //iki method bir arada kullanilabilir
        //buna method chain denir.

        //4-en az bir tane kucuk harf olsun

        boolean fourth=pwd.replaceAll("^[a-z]","").length()>0;

       //5-en az bir tane seymbol olsun
        boolean fifth=pwd.replaceAll("[^a-z" +
                "A-Z0-9]","").length()>0;









    }
}
