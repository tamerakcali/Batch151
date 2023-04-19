package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    //ex:kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 2 integers");
         int first=input.nextInt();
         int second=input.nextInt();
         
         //1.Way
         if(first<second){
             System.out.println("First");
         }else{System.out.println("second");
             
    //2.Way:use ternary:
      int result=first<second ?first:second;
             System.out.println(result);

      
             
         }
         



    }
}
