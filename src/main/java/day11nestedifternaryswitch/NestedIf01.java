package day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
  /*ex:user dan "0" dan kucuk 120 den buyuk deger giremiyecek sekilde datalari aldiktan
 sonra eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir",eger erkek ise
 65 yasindan buyukse "Emekli Olabilir" yazdiran code u yazdiriniz.*/

        //1.step
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age..");
        //2.step
        int age = input.nextInt();

        //3.step
        System.out.println("Please enter your gender...");
        String gender = input.nextLine();
        {

         }
        if(age<0 || age>120){
            System.out.println("Invalid age");
        }
        //4.step
        else if(gender.equalsIgnoreCase("male")){
            if(age>65){
                System.out.println("Can be retired");

            }else{
                System.out.println("should work");
        }

        }else if(gender.equals("female")){
           if(age>60){
               System.out.println("Can be retired");
           }else{
               System.out.println("Should work");
        }
    }else{
            System.out.println("Undefined gender" );
//Note:if icinde if kullanilmissa nested if kullanilmistir. bu code javayi
 //yavaslattigindan cok kullanilmaz.Bu gibi code lara "time consuming" olareak
 //adlandirilir.
        }
}
}
