package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //kullanicidan iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazan kodu yaziniz?
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        Double firstNumber =  input.nextDouble();
       Double secondNumber = input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}
