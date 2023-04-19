package practices;

import java.util.Scanner;

public class ForAgac {
    public static void main(String[] args) {

/*

        Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */

    Scanner scan=new Scanner(System.in);
        System.out.println(" Yaprak satir sayisini giriniz...");
        int yaprakSaSay=scan.nextInt();

        System.out.println("Govde satir sayisi giriniz...");
        int govdeSaSay=scan.nextInt();

        String yaprak="";

        for(int i=0;i<yaprakSaSay;i++){
            yaprak=yaprak+"^";
            System.out.println(yaprak);


            for(int i1=0;i1<govdeSaSay;i1++){
                System.out.println("|||");
  /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */
                int toplam=0;
          for(int i3=0;i3<5;i3++){
                System.out.println("please enter a numbers");

                int numb=scan.nextInt();

                if(i3>=5 && i3<=10) {
                    System.out.println("islem disinda");
                }else{
                    toplam=toplam+numb;


                }
          }
                System.out.println(toplam);


            }

        }



    }
}
