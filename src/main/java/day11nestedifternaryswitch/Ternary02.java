package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
   //ex:user dan bir sayi aliniz,o sayi pozitive ise ekrana "Pozitive" yazdirin
   //degilse "Pozitive degildir" yazdirin.
         Scanner input=new Scanner(System.in);
         int number= input.nextInt();
        int number1=-4;
        String result=number1>0 ? "pozitif " :"pozitif degildir";
        System.out.println("result = " + result);


    }
}
