package day_17practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_02 {

    // Bir tane txt dosyası olusturunuz.
// txt dosyasının icerisine cumleler yazınız
// Olusturdugunuz txt dosyasına ulasınız.
// icerisindeki cumleleri yazdırınız
    /*
 NOTE:   bir code yazarken olasi exceptoin lari ongorup exception olustugunda,
    java nin ne yapmasini istedigimize karar vermeliyiz.

    1-Eger exception atildiginda,devam etmek istemiyorsak,mathod isminin yanina
    olusabilecek exception  declare edilir.

    2-Devam etmek istersek exception a ragmen,sorun ihtimali olan code  try block unun
    icine yazilmalidir.catch block unun icine ise exception durumunda java nin ne yapmasi
    gerektigi yazilmalidir.

    3-Exception lar icin parent-child iliskisi vardir. eger bir code icin birden fazla
    exception olusma ihtimali varsa,oncelikle olasi expectionlar parent-child iliskisi
    tasiyormu bakilir.Eger parent-child iliskisi yoksa, istedigimiz sirada catch blocku
    olustururuz.Eger parent-child iliskisi varsa,sadece parent olan exception u yazabiliriz.
    veya ikisini de yazmak istersek, child i once parent i sonra yazmaliyiz.
     */

    public static void main(String[] args) {

        String findFileWay = "day_17pracatice/file.txt";//once file bulmanin yolunu
        // bulduk,yani txt file ulastik

        try {
            FileInputStream fis = new FileInputStream(findFileWay);//FileInputStream object
            // ile file ulastik.
            int k = 0;
            try {
                while ((k = fis.read()) != -1) {//file dan datalari okumak icin read() methodu kullanilir.

                    System.out.print((char) k);//

                }
            } catch (IOException e) {
                e.printStackTrace();//java nin exception throw edip devam etmesi icin bu method kullanilir.
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}








