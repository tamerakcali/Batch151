package day33maps;

import java.util.HashMap;

public class HashMap02HowToWork {
    public static void main(String[] args) {

  /*hashmap arkasinda calisan sistemi ogrenecegiz.
  1-java once 16 adet buckets olusturur.bunlari 0 dan 15 e kadar index ler.
  2- verilen key icin bir hashcode olusturur,onu 16 ya boler.kalan degeri index
  olarak kabul eder ve o index e key ve value yi koyar.
  3-ayni bucket a birden fazla entry koyabilir, bu durumda java
  linkedlist kullanir, cunku entries leri birbirine baglar.
  4-12 buckets doldugunda yeniden bir 16 buckets daha ekler. bu durumda
  index icin artik 32 ye bolmeye baslar.
   */



        HashMap<String,String> capitals=new HashMap<>();
        capitals.put("Usa'","Washington");


    }
}
