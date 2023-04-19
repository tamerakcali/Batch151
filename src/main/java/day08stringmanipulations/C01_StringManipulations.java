package day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
       //ex: 
        String str="Bizimle Java Ogrenmek Cok Kolay";
        //str stringindeki "a" harfinin yerine "e" harfini yerlestiriniz.
       String str1= str.replaceFirst("a","e");
        System.out.println("str1 = " + str1);
       
        //ex:name Stringindeki varsa space leri trimleyiniz.
        String name="   Mehmet Fatih Yildirim  ";
        System.out.print("*****************");

        System.out.print("name = " + name);
        String name1=name.trim();

        System.out.print("name1 = " + name1);
      
        //valueOf methodu():
        //ex:asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        
        String tv="599.99$";
        String laptop="299.99$";
        
        String tv1=tv.replace("$","");//dolar sembolu sildik ancak datamiz hala
        //String bir data.Toplama islemi String datalarda yapamayacagimiz icin, String datayida ikinci 
        //adimda toplanabilir yani double,int,vs.bir dataya cevirmemiz gerekiyor.
        
        String laptop1=laptop.replace("$","");
        
        double totalPrice=Double.valueOf(tv1)+Double.valueOf(laptop1);
        System.out.println("totalPrice = " + totalPrice);
        
        //spilit() methodu:
        //ex: verilen asagidaki ismin ilk harfi ile son ismin ilk harfini
        //buyuk harf olarak yanyana yazdiriniz.
        
        String tamIsim=" mehmet fatih ";
        
        char tamisim1=tamIsim.trim().toUpperCase().charAt(0);
        
        char tamisim2=tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("tamisim1 = " + "tamisim2");
        
        //1.step:once ismin basinda ve sonunda olan bosluklari sildik trim() ile.
        //2.step:ilk ismin basharfini buyulttuk with toUppercase().
        //3.step:ilk ismin ilk harfini charAt ile aldik
        //4.step:iki ismin ortasindaki space den ikiye bolduk with spilit() ile
        //spilit methodunda bolunen iki kismin ilk kismi "0" ikinci kismi "1" numarali olarak kabul edilir"
        
        
        
        
        
        
        
                
        
    }
}
