package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //ex:user gun numarasini girsin.code gun ismini yazsin.
        //1=Sunday, 2=Monday,3=Tuesday, 4=Wednsday, 5=Thursday, 6=Friday, 7=Saturday
     Scanner input=new Scanner(System.in);
        System.out.println("Please enter your day number");
        int dayNum= input.nextInt();
        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
            System.out.println("Tuesday");
        }else if(dayNum==4){
            System.out.println("Wednsday");
        }else if(dayNum==5){
            System.out.println("Thursday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day number");




    }//main
}
}//class
