package practices;

import java.util.Scanner;

public class Q07IfElse {
    public static void main(String[] args) {

 //ex:  Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        //Eger İlk kelimenin karakter sayısı çift ise,
        // ikinci kelimeyi birinci kelimenin ortasına koyun.
        //İlk kelimenin karakter sayısı tek ise, konsola
        //"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first word...");

         String first=input.next();
         String first1="Kadinlar";

        System.out.println("Please enter second word...");
         String second=input.next();
         String second1="Gunu";

         if(first1.length()%2==0){
             String firstMiddle=first1.substring(0, first1.length()/2);
             String secondMiddle=first1.substring(first1.length()/2);
             System.out.println(firstMiddle+second1+secondMiddle);

         }

    }
}
