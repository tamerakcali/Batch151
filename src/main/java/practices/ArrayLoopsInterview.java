package practices;

import java.util.Scanner;

public class ArrayLoopsInterview {
    public static void main(String[] args) {
  /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
//her adimi gormek istersek yazdirma islemini loop'un icinde aksi halde disinda yazdiririz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a'harflerini iceren bir kelime giriniz");
        String str = input.nextLine().toLowerCase();
        int counter = 0;
        //Toplama ve cikarma islemlerinde default deger sifirdir.(0)
        //Carpma ya da bolme islemlerinde default deger birdir (1)
        //String datalar icin ""; (hiclik)

        for (int i = 0; i < str.indexOf("c"); i++) {

            if (str.charAt(i) == 'a') {

                counter++;

            }//if body
        }//for body
        // her adimi gormek istersek yazdirma islemini loop'un icinde aksi halde disinda yazdiririz
        System.out.println("c'den once " + counter + " a vardir");

//2. Yol
        int sayac = 0;
        if (str.contains("c") && str.contains("a")) {
            System.out.println("");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    sayac++;
                } else if (str.charAt(i) == 'c') {
                    break;

                }//else if

            }//for loop
            System.out.println("C'den onceki 'a' sayisi " + sayac);
        } else {
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
        }
    }
    }
