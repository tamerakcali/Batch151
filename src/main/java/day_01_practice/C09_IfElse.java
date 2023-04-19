package day_01_practice;

import java.util.Scanner;

public class C09_IfElse {
    public static void main(String[] args) {

//ex:Kullanıcıdan sisteme bir numara girmesini isteyin.
//
//        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
//
//        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
//        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter a number...");
        int num=scan.nextInt();

        if(num<0){
            System.out.println("Negative Number");
        }else{
            if(num<10){
                System.out.println("Pozitif digit");
            }else{
                System.out.println("Pozitive number");
            }
        }
        {

        }


    }
}
