package day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

 //ex:user dan alinan  bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz.
//1838==>1+3=4

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");

        String s=input.next();

        int sum=0;

        for(int i=0;i<s.length(); i++){

            String d=s.substring(i,i+1);
             if(s.indexOf(d)==s.lastIndexOf(d));


            sum=sum +Integer.valueOf(d);

        }


        }
  //ex:bir string deki tekrarli karakterleri ekrana yazdiriniz.
  //Alala==>laala

    String s="Alala";

    String result="";

   /* for(int i=0;i<s.{

       char ch=s.charAt(i);

       if(s.indexOf(ch)!=s.lastIndexOf(ch)){
           result=result +ch;
*/
       }











