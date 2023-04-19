package day14loops;

import java.util.Scanner;

public class Loops03DoWhile {
    public static void main(String[] args) {

        //1.WAY:while ile;

        int i = 1;
        while (i < 1)
            System.out.println("while Loop");
        i++;  //bu durumda ekrana hicbirsey yazmaz.while Loop da
        // loop body si hic calismamasi mumkundur.(zero execution possible)

        //2.WAY: do while ile;
        int k = 1;//do-while loop da loop body si en az bir kere calisir.
        do {
            System.out.println("do-while loop");
            k++;
        } while (k < 1);


//ex:user bir sayi girsin,sayi 100 den kucuk ise user kazandiniz mesaji alsin,diger durumlarda
        //kaybettiniz mesaji alsin.

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Please enter a number...");
            int num = input.nextInt();
            if (num < 100) {
                System.out.println("won!");
            } else {
                System.out.println("lost!");
                break;
            }
        } while (true);
//ex:user dan alinan bir cumlenin buyuk harf ile baslayip nokta ile bitiigini kontrol eden code yaziniz.
       do{
           System.out.println("please enter a word...");
           String s=input.next();
           if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z'));{
           System.out.println("your sentence is true for grammatically");

       }//else yazacaz ama sorun oluyor buraya derste oldugumuz icin bakamiorum

       {System.out.println("your sentence is false for grammatically");
            break;
        }
       }while(true);
}
}