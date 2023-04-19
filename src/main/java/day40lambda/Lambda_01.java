package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda_01 {

    /*
    1-Stream kullanmak zorunlu degildir,ancak bircok method cagirdigi icin daha avantajlidir.
    kullanilmadigi yerlerde vardir.

     */
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("Van", "Mus", "Gumushane", "Kutahya", "Ankara", "Ordu", "Gaziantep", "Hatay", "Edirne"));

    uppLength(cities);

    }
//main

// 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz


// 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz


// 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
// Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar


// 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz


// 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz


// 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


//  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.



//1.soru cozumu;

    public static void uppLength(List<String> cities){

        cities.
                stream().
                distinct().
                map(t->t.
                        toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));//VAN MUS ORDU HATAY ANKARA EDIRNE KUTAHYA GUMUSHANE GAZIANTEP KUTAHYA

//2.soru cozumu
        //Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

       cities.stream().
               distinct().
               map(t->t.toUpperCase()).
               sorted(Comparator.
                       comparing(t->t.charAt(t.length()-1))).
               forEach(System.out::println);//

    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz

    public static void uppLengtUn (List<String> cities){

        cities.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).
                        thenComparing(Comparator.naturalOrder())).
                forEach(System.out::print);//


        // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz

//removeIf() ile silme islemi yapilir.Buna stream dan ulasamadigimiz icin dogrudan method ismi ve  nokta
        //yazarak diger methodlari gorup kullanabiliriz. removeIf i boyle bulduk.

        cities.removeIf(t->t.length()>5);

        System.out.println();//Van,Mus,Ordu,Hatay

// 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

  cities.removeIf(t->t.startsWith("H") || t.endsWith("u"));//


    }



}


















