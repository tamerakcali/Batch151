package practices09;

public class C02IncrementDecrement {
    public static void main(String[] args) {



        int a=15;
        int b=a++;//java soldan saga calistigi icin once a'yi b'ye assign edip sora increment yapar.
        System.out.println("b = " + b);//15
        System.out.println(a);
        
        int sayi=10;
        int sayi1=20;
        int sayi2=30;
        sayi2=sayi1++;
        System.out.println("sayi2 = " + sayi2);
        System.out.println(sayi1);//20
        sayi2=++sayi1;//once artirdi sora assign yapti.
        System.out.println("sayi2 = " + sayi2);//21

        System.out.println(sayi2++);//21
        System.out.println(sayi2);//22
        
        
    }
}
