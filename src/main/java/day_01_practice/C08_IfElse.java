package day_01_practice;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {
//ex:Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
//    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
//    5 yıldan daha az calısanların zam alabilmek
//    icin kac yıl daha calısması gerektigini konsola yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your working years...");
        int workYear=scan.nextInt();

        System.out.println("Please enter your salary");
        int salary=scan.nextInt();

        if(workYear>=5){
            System.out.println("Rised salary:" + (salary +(salary*10/100)));

        }else{
            System.out.println("For receiving rised salary :" + (5-workYear)+ " " + "year need to work");


        }




    }
}
