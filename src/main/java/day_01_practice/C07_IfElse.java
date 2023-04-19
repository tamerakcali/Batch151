package day_01_practice;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

//ex:// Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
//        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number...");

        int firstNum=scan.nextInt();

        System.out.println("Please enter second number...");
        int secondNum=scan.nextInt();

        if(firstNum>secondNum){
            System.out.println("firstNum scondNum dan buyuktur");
        }else{
            System.out.println("firstNum secondNum dan buyuk degildir");
        }



    }
}
