package day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

        //exam: interview question.!!!!!!
        //bir stringdeki tekrarsiz karakterleri ekrana yazdiriniz.

        String y = "abbccdc";//orjinal soru bu.

        char chr = y.charAt(0);

        if (y.indexOf(chr) == y.lastIndexOf(chr)) {
            System.out.println("chr = " + chr);

        }
        char chr1 = y.charAt(1);

        if (y.indexOf(chr1) == y.lastIndexOf(chr1)) {
            System.out.println("chr1 = " + chr1);
        }
        char chr2=y.charAt(2);
        if(y.indexOf(chr2)==y.lastIndexOf(chr2)){
            System.out.println("chr2 = " + chr2);
        }
        char chr3=y.charAt(3);
        if(y.indexOf(chr3)==y.lastIndexOf(chr3)){
            System.out.println("chr3 = " + chr3);
            
        }
        char chr4=y.charAt(4);
        if(y.indexOf(chr4)==y.lastIndexOf(chr4)){
            System.out.println("chr4 = " + chr4);
        }
        char chr5=y.charAt(5);
        if(y.indexOf(chr5)==y.lastIndexOf(chr5)){
            System.out.println("chr5 = " + chr5);
        }
        char chr6=y.charAt(6);
        if(y.indexOf(chr6)==y.lastIndexOf(chr6)){
            System.out.println("chr6 = " + chr6);
        }
        
                


        //ex:verilen sayi "+" ise ekrana sayi pozitif yazdiran kodu yazdiriniz.
        int num = 65;

        if (num > 0) {
            System.out.println("sayi pozitif");
        }
        //ex:sayi -1 ile 10 arasinda ise ekrana "verilen data rakamdir" yazdiran
        //kodu yaziniz.rakamlar 0,1,2,3,4,5,6,7,8,9 dur.

        int num1 = 33;
        if (num1 > -1 || num1 < 10) {
            System.out.println("verilen sayi rakamdir");


        }
        //ex: sayi 3 basmakli ise ekrana " sayi uc basamaklidir" yazdiriniz.

        //bunun pratik yolu Math.abs() methodu nu kullanmaktir.

        int sayi=-999;
        sayi=Math.abs(sayi);

        if(sayi>99 && sayi<1000){
            System.out.println("sayi uc basamaklidir");

        }
        //ex:-100 iki basamakli ise  ekrana he yazdiriniz.

        int sayi1=20;
        sayi1 =Math.abs(sayi1);

        if(sayi1<100 && sayi>9){
            System.out.println("he");{


            }

        }



    }
}