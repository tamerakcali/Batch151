package day07stringmanipulations;

import java.util.Scanner;

public class C01StringManipulationsReview {
    public static void main(String[] args) {
        String shoes="20.99€";
        String top="33.99€";
        String suit="99.99€";
        //ex:string degerleri verilen datalarin toplamini veren kodu yaziniz.

        String shoes1= shoes.replace("€","");
        System.out.println("shoes1 = " + shoes1);
        String top1=top.replace("€","");
        System.out.println("top1 = " + top1);
        String suit1= suit.replace("€","");
        System.out.println("suit1 = " + suit1);

        
        Double totalPrice=Double.valueOf(shoes1)+ Double.valueOf(top1)+Double.valueOf(suit1);
        System.out.println("totalPrice = " + totalPrice+"€");

        //ex:tuna tamer akcali stringindeki birinci ismin ilk harfi ile son ismin
        // 3. harfini buyuk harf olarak yanyana yazdiran kodu giriniz.

        String fullName=" tamer akcali tuna ";

        char first=fullName.trim().toUpperCase().charAt(0);

        char last=fullName.trim().toUpperCase().split(" ")[2].charAt(2);

        System.out.println("first+last = " + first+last);
        
        //ex: asagidaki stringde "ali" stringinin ilk ve son kacinci index de oldugunu gosteren kodu giriniz.
        
        String str="tuna top oynuyor";
        
       int str1= str.indexOf("top");
        System.out.println("str1 = " + str1);

        //ex:Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz
        //
        //                i) En az 8 karakterden olussun
        //                ii)Password space icermesin
        //                iii)En az 1 tane buyuk harf olsun
        //                iv) En az 1 tane kucuk harf olsun
        //                v) En az 1 tane sembol olsun
        //                vi) En az 1 tanede rakam olsun

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your password...");

        String pwd=input.nextLine();

      //i)En az 8 karakterden olussun
         boolean pwd1=pwd.length()>=8;

      //ii)Password space icermesin
        boolean pwd2=!pwd.contains(" ");

     //   iii)En az 1 tane buyuk harf olsun
     boolean pwd3=pwd.replaceAll("[^A-Z]","").length()>0;

     //iv) En az 1 tane kucuk harf olsun
        boolean pwd4=pwd.replaceAll("[^a-z]","").length()>0;

     //   v) En az 1 tane sembol olsun
        boolean pwd5=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;

    //  vi) En az 1 tanede rakam olsun
    boolean pwd6=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(pwd1 && pwd2&& pwd3 && pwd4 && pwd5 && pwd6);


























    }
}
