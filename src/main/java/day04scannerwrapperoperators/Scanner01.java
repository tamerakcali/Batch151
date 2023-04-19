package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
          //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz?

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //birinci basamak
        int lastDigit = number%10;
         number = number/10;

         //ikinci basamak
          int lastSecondDigit = number%10;
          number = number/10;

          //ucuncu basamak
          int lastThirdDigit = number%10;
           number = number/10;

           //dorduncu basamak
        int lastFourthDigit = number%10;
        number = number/10;

        //besinci basamak
        int lastFifthDigit = number%10;
        number = number/10;

        System.out.println(lastFourthDigit + lastFifthDigit);









    }
}
