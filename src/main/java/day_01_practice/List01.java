package day_01_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List01 {
    public static void main(String[] args) {


        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */
            Random randomSayilar=new Random();
            int sayi=0;
            List<Integer> sayiListesi=new ArrayList<>();
            while (sayiListesi.size()<200){
                sayi=randomSayilar.nextInt(1000);
                if (!sayiListesi.contains(sayi)){
                    sayiListesi.add(sayi);
                }
            }
            Scanner scan=new Scanner(System.in);
            int kalanTahmin=5;
            int tahminSayisi=0;
            do {
                tahminSayisi++;
                System.out.println("lutfen tahminde bulunmak icin bir sayi giriniz");
                sayi= scan.nextInt();
                if (sayiListesi.contains(sayi)){
                    System.out.println("tebrikler "+tahminSayisi+". tahminde buldunuz");
                    break;
                }
                kalanTahmin--;
                System.out.println("kalan tahmin hakkınız : "+kalanTahmin);
            }while (kalanTahmin>0);
            if (kalanTahmin==0){
                System.out.println("malesef bulamadiniz");
            }
        }
    }






