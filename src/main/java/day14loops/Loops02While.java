package day14loops;

import java.sql.PreparedStatement;
import java.util.Locale;
import java.util.Scanner;

public class Loops02While {
    public static void main(String[] args) {
        
 //ex:3 den 8 e kadar tum tamsayilari consola yazdiran code u yaziniz.
 
 //1.WAY:forloop ile;
 
 for(int i=3;i<9;i++){
     System.out.print(i);
 }
 //2.WAY: while ile

    int i=3;

    while(i<9){
       System.out.print(i + " ");
     i++;
//ex:21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
 //1.WAY:for ile    for(int i=21; i<181; i++){
    if(i%4==0 && i%6==0) {
        if (i % 4 == 0 && i % 6 == 0)
            System.out.print(i + " ");

// 2.Way:while ile;
        int k = 21;
        while (k < 18) {

        }
        if (k % 4 == 0 && k % 6 == 0) {
            System.out.print(k + " ");


        }
        System.out.println(k + " ");

        // Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        int m = 0;
        while (m < s.length()) {

            String ch = s.substring(m, m + 1);

            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);


            }
            m++;


        }
 //ex:size verilen tamsayinin rakamlari toplamini ekrana yazdiran code u yaziniz.
   /*         int r=578;
            while(r>0){
            res = res + r%10;

            r=r/10;
        }
        System.out.println(r);
*/
//ex:userdan aldiginiz sayi icin carpim tablosu olusturan code u yazdiriniz.
//3 verirse ornegin 3x1 3x2 3x3 ....3x10 gibi..
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number...");

        int u=1;
        int num=input.nextInt();
         while(u<11){
             System.out.println(num +"x" + u + "=" +(num*u));
             u++;
         }
//ex:userdan aldiginiz String deki sessiz harfleri yazdiriniz.
//Alabama==>lbm

   String x="Alabama";
        System.out.println("Enter a word");
        String y=input.next();

        int z=0;
        while(z<y.length()){
            char ch= y.charAt(z);
            boolean x1=ch== 'a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' || ch=='E' || ch=='O' || ch=='U';
            if(!x1){

                System.out.println(ch);
        }
        z++;


    }
    }
    }
}}
