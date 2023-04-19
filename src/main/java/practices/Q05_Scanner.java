package practices;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {

 //ex:user dan aldiginiz bir sekil ile asagidaki sekli olusturan code u yaziniz.
  /*     A
        A A
       A A A
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a shape..");

        char ch=input.next().charAt(0);
        System.out.println("  " + ch  + "  " );

        System.out.println(ch+" "+ch+" "+ch);


//ex:user dan iki sayi alip dort islem yapan ve islemlerin sonuclarini
//yazdiran code u yazan bir hesap makinesi code u yaziniz.

        System.out.println("Please enter first number");

        int first=input.nextInt();
         int first1=4;

        System.out.println("Please enter second number");

        int second1=6;
        System.out.println(first1+second1);
        System.out.println(first1-second1);
        System.out.println(first1*second1);
        System.out.println(first1%second1);


 //ex:user dan aldiginiz 5 basamakli bir sayinin ilk iki ve son iki rakamlari toplamini yazdiriniz.

        System.out.println("Please enter a 5-digit number");

        int num=input.nextInt();
        int num1=12345;

        int firstIki=num1%1000;//12
        int firstIkiTop=(firstIki%10)+(firstIki/10);

        int lastIki=num1%100;//45
        int lastIkiTop=(lastIki%10)+(lastIki/10);
        System.out.println("lastIkiTop = " + lastIkiTop);
        int top=firstIkiTop+lastIkiTop;

        System.out.println("top = " + top);//1+2+4+5=12

//2.WAY:









    }
}
