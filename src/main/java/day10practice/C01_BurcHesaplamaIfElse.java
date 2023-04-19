package day10practice;

import java.util.Scanner;

public class C01_BurcHesaplamaIfElse {
    public static  void main(String[] args) {

// Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month as string");

        String bornMonth=scan.next();
        System.out.println("Please enter your birth day as int");

        int bornDay=scan.nextInt();
        String burc="";
        if(bornMonth.equalsIgnoreCase("January")){
            if(bornDay>22){
                burc="backet";

            }else{
                burc="goat";
            }
        }

        if(bornMonth.equalsIgnoreCase("february")){
            if(bornDay>20){
                burc="fish";


            }else{
                burc="backet";

            }
        }
        if(bornMonth.equalsIgnoreCase("March")){
            if(bornDay>21){
                burc="ram";

            }else{
                burc="fish";

            }
        }
        if(bornMonth.equalsIgnoreCase("April")){
            if(bornDay>21){
                burc="bull";

            }else{
                burc="ram";
            }
        }
        System.out.println(bornDay+" "+bornMonth+" "+burc);
    }

}
