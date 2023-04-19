package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        //Numerik data typlerinin bir kucugun buyuk bir data type nina donusturulmesine "Auto Widing" denir.

        byte num1=2;
        short num2=num1;

        //buyuk numerik data type nin kucuk data type ne donusturulmesine de "Explicit Narrowing" denir.

        int num3=6;
        float num4=num3;
        System.out.println("num4 = " + num4);
        //sonuc 6.0 verir 6 vermez. cunku float data type bir decimal ondalikli sayidir.

        char sayi1='2';
        byte sayi2=3;//burda 3 olan numerik degeri esas alir cunku bu zaten sayi. ascii degerini almaz.
        System.out.println(sayi1 +  sayi2);
                
    }
}
