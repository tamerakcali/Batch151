package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanicidan adresini aliniz ve ekrana yazdiriniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adresinizi giriniz... ");
        //next methodu kullanicidan tek kelimeli string i almak icin kullanilir.
        //nextline methodu ise user dan birden fazla kelime String i almak icin kullanilir.
        String adress = input.nextLine();
        System.out.println( adress);

    }
}
