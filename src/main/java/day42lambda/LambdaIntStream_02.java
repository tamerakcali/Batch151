package day42lambda;

import day40lambda.Utils;

import java.util.stream.IntStream;

public class LambdaIntStream_02 {
   public static void main(String[] args) {
    /*   IntStream. yapinca methodlari gorduk. rangeClosed methodunu sectik. Cunku ilk sayi dahil, ikinci sayi haric olacak.
               method parantezi icine starting, ending yazdik.
               Boylece eger 7 ve 10 sayisi verilirse 7 dahil, 10 dahil olur. Eger rangeClosed yerine range methodunu secseydik 10 haric olacakti.

       Java'da, rangeClosed() ve range() metotları IntStream, LongStream ve DoubleStream interface'leri tarafından sağlanan, belirli bir aralıkta değerler üreten metotlardir.

               rangeClosed(int startInclusive, int endInclusive) metodu, startInclusive ile endInclusive arasındaki
       tam sayıları içeren bir akım üretir. Örneğin, IntStream.rangeClosed(7, 10) metodu, 7, 8, 9 ve 10 değerlerini içeren bir stream üretir.

               range(int startInclusive, int endExclusive) metodu, startInclusive ile endExclusive arasındaki
       tam sayıları içeren bir akım üretir. Ancak, endExclusive parametresi dahil edilmez.
               Örneğin, IntStream.range(7, 10) metodu, 7, 8 ve 9 değerlerini içeren bir stream üretir.

               Bu nedenle, rangeClosed() ve range() arasındaki temel fark, rangeClosed() metodu ile belirtilen
       aralığın uç noktalarının dahil edilip edilmediğidir. rangeClosed() metodu, aralığın her iki
       uç noktasını da dahil ederken, range() metodu ikinci parametre olarak belirtilen uç noktasını dahil etmez.

               Bu nedenle, eğer uç noktaları da aralığa dahil etmek istiyorsanız, rangeClosed() metodunu kullanmalısınız.
       Eğer uç noktaları dahil etmek istemiyorsanız, range() metodunu kullanmalısınız.
       Örneğinizde, range() metodu ile 7 ve 10 parametreleri kullanılırsa, sonuçta elde edilecek stream
       7, 8 ve 9 değerlerini içerecektir, ancak 10 değerini içermeyecektir. Aynı parametrelerle rangeClosed()
        metodu kullanılırsa, elde edilecek stream 7, 8, 9 ve 10 değerlerini içerecektir.




       // System.out.println(getSumInRange(7,10)); //34
      //  System.out.println(getMultiply(7,10));//5040

    }
//ex:7 den 10 a kadar tam sayilarin toplamini hesaplayan methodu olusturunuz?

    public static int getSumInRange(int starting,int ending ){
        return IntStream.rangeClosed(starting,ending).sum();//rangClosed() methodu ilk verilen buyuk oldugunda calismaz
        //bunu cozmek icin asagidaki gibi if  statement ile yapariz.

        if(starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }

    }
//ex:7 den 10 kadar tamsayilariin carpimini

    public static int getMultiply(int starting,int ending){

      return  IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();//eger method yoksa
        //kulanabilecegimiz, carpma islemi oldugu icin reduce ile methoda ulasabiliriz
        if(starting>ending) {
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);//swap kullanildiginda tekrar degisen degerleri bir list e eklenmesi gerekir.
        list.add(ending);
        return list;

 //ex:45 den 47 ye kadar tam sayilarin rakamlari toplamini hesaplayan methodu olusturun?
 //==>4+5+4+6+4+7
        public static int getSumOfDigits(int starting1,int ending1){
            IntStream.rangeClosed(starting1,ending1).map(Utils::getSumOfDigits).sum();//30
        }
   private static int swap(int starting2,int ending2){//starting ending den kucukse swap methodu ile degistirilir.
                    List<Integer> list=new ArrayList<>();

            return IntStream.rangeClosed(List.get(0),List.get(1).reduce(Math::multiplyExact).getAsInt();

            System.out.println(getSumInTheGivenRange(10, 7));
        System.out.println(getMultiplicationInTheGivenRange(10, 7));
        System.out.println(getSumOfDigitsInTheGivenRange(47, 45));

    }

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).sum();
    }

    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3: 45'den 47'e kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();

files isimli text'imize ulasmamizi saglayan Paths.get icindeki sifreli kismi aldiktan sonra
java text icindeki metni bir stream halinde satir satir alt alta siraliyor. files.lines kismi kizardiginda main metod yanina exemption'i throws keywordu ile ekladik ve kizariklik sona erdi.
forEach ile yazdirma islemi yapiliyor.

forEach methodu icinde lambda expression yerine System.out::println yazdik. Makbul olan budur.


*/
        }

        }



