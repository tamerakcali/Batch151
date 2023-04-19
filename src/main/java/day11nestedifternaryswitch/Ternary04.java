package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        //ex:user dan aldiginiz sayi cift ise yarisini ekrana yazdiriniz,
        // tek ise "bu sayi ikiye bolunmez" yazdiriniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num=input.nextInt();

       // String result=num%2==0 ? num/2 : "bu sayiikiye bolunmez";
        //bu sekilde java sikayet eder. cunku int ve string birarada yazilmaz. bunu cozmek icin
        //object data tipi kullanilir.object java da bir class dir."object class" dir.

        Object result=num%2==0 ? num/2 : "bu sayi ikiye bolunmez";






    }
}
