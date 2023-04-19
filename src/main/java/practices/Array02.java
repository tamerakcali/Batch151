package practices;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

/* Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
         ve bu rakamları bir array'e asignn ediniz. Olusturdugunuz array'i yazdırınız

         Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

         Ortalamadan daha buyuk olan array elemanlarını yazdırınız

 */
 //1.soru;bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdıriniz
     Scanner scan=new Scanner(System.in);

     int arry []=new int[4];

     for( int i=0;i<4;i++){
         System.out.println("Please enter a number");
         int num=scan.nextInt();

         arry[i]=num;//kullanicidan aldigimiz her rakami array a assign ettik.

        }
        System.out.println(Arrays.toString(arry));

 //2,soru   Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırıniz.
        double toplam=0;
     for(int each:arry){
         toplam=toplam+each;

     }
     double ortalama=toplam/arry.length;
        System.out.println("ortalama = " + ortalama);

//3.soru;Ortalamadan daha buyuk olan array elemanlarını yazdırınız

      for(int each:arry){//each yerine genelde w kullaniyoruz.onun icin karisiklik olmasin
          if(each>ortalama){
              System.out.println("each = " + each);
          }
      }
    }
}
