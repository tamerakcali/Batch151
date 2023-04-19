package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //if it rains, i will cancel the picnic.
 //ex: verilen bir karakter buyuk harf ise ekrana "Buyuk Harf"yazdiran kodu giriniz.
        char great='A';
        if(great>='A'&& great<='Z'){
            System.out.println("Buyuk Harf");

   //ex:verilen sayi cift sayi ise ekrana "Cift Sayi" yazdiran code giriniz.

   byte  num=24;
    if(num %2==0){

 //ex:verilen bir sayi 300 den kucuk veya 1200 den buyuk ise
        // "harika sayi" yazdiran code u yazidiriniz.

        int num1=200;
        if(num<300 || num>1200){
            System.out.println("harika sayi");

      //ex: kullanicidan alinan datanin tek mi cift mi oldugunu yzdiran
      //code u yazdiriniz.
            //1.WAY:
            Scanner input=new Scanner(System.in);

            System.out.println("Please enter a number..");

            int num2=input.nextInt();

            if(num2%2==0){
                System.out.println("Even nummer" );

            }
            if(num2%2!=0){
                System.out.println("Odd number");

            //2.WAY:
                if(num2%2==0){
                    System.out.println("Even number");

                }else{
                    System.out.println("Odd number");

            }//ex:verilen bir sayinin negatif, pozitif veya notr oldugunu
                //gosteren code u yaziniz.
          int num3=20;
                if(num2<0){
                    System.out.println("Negative");
                }
            else if(num2>0){
                System.out.println("pozitive");
            } else{
                    System.out.println("Notr");
                }

                }


        }

    }


        }



    }
}
