package lambdapractice;

import day40lambda.Utils;

import java.util.ArrayList;
import java.util.List;

public class Lambda_01Practice {
    /*
    Stream:
Datalari akisa sunar. Cok sayıda işlevsel metodun çağrılmasını sağlar

ForEach:
Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
**Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
artık kullanılamayacağı anlamına gelir.


Filter:
Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
filtreleme işlemi yapmamıza yarayan bir yapıdır.
Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


Collect:
Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
veri yapısına dönüştürmek için kullanılır.


Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
ve başka elemanlara dönüştürmemize imkan sağlayan


Distinct:
Stream içerisinde bulunan ve tekrar eden elemanlar varsa
bunları distinct metodu ile çıkartabilir ve
elimizde tekrar etmeyen birbirinden farklı
elemanlar barından bir veri setimiz kalır


Sorted:
Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
İkinci formatı ise Comparator arayüzünden türediği için
bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



reduce : indirgeme demektir.
kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
bir sonraki elemanla işlemle tutulur
-reduce() methodu opsional oldugu icin eger sonucu int almak istenirse,reduce den sonra get
methodu eklenmelidir.
get() methodu:Opsional bir data yi int bir data ya cevirir.


Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.


    AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


    NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.



Comparator => bir Class'tır. Compar karşılaştırmak demektir.
Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
sırasını kontrol etmek veya doğal sıralaması olmayan
nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

reverseOrder() => Comparator Class'ının bir methodudur.tersten siralama yapar.
Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
comparing() => karşılaştırma demektir.
reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
uygulayan bir karşılaştırıcı (comparator) döndürür.

   List<Integer> nums = new ArrayList<>();
            nums.add(12);
            nums.add(9);
            nums.add(131);
            nums.add(14);
            nums.add(9);
            nums.add(10);
            nums.add(4);
            nums.add(12);
            nums.add(15);


        }

        //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)


        //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


        //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)


        //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


        //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


        //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


        //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz


        //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


        //9)Liste ogelerinden max degeri veren bir method olusturunuz


        //10)Liste ogelerinden minumum degeri veren method olusturunuz



     */

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        oddNumQuebe(nums);
        System.out.println("nums = " + nums);
        elementPrint(nums);//
        System.out.println(nums);
        evenNums(nums);//
        oddNumsArea(nums);


    }

    private static void elementPrint(List<Integer> nums) {//structured programming ile
        for (Integer w : nums) {
            System.out.println(w + " ");//structured programming ile

// 1- Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
            //  method'u olusturunuz.(Functional) progrmming ile

            nums.stream().forEach(t -> System.out.print(t+" "));//
        }


    }
//3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz
    public static void evenNums(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(System.out::print);//

    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina
// bosluk koyarak yazdiran method'u olusturunuz.(Functional) p
    public static void oddNumsArea(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(System.out::print);//
    }


//9)Liste ogelerinden max degeri veren bir method olusturunuz!!!!!!!!!BU ONEMLI BIR METHOD COK KULLANILIR.
//1.WAY:
         public static void maxNums1(List<Integer> nums) {

             Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

             System.out.println("max = " + max);//

         }
 //2.WAY
      public static void maxNums2(List<Integer> nums){

       Integer  max2= nums.stream().
               distinct().
               reduce(nums.get(0),(t,u)->t>u ?t:u);//get methodu ile 0 nci indexteki sayi
                                                                    //yi alarak isleme baslar
          System.out.println("max2 = " + max2);//


 }
    //3.WAY:
    public static void maxNums3(List<Integer> nums){

        Integer max3=  nums.stream().sorted().reduce((t,u)->u).get();//sorted kullanildigi icin yavas calisir.

        System.out.println("max3 = " + max3);//

}
   //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void minimumNum(List<Integer> nums){

        Integer mimn=nums.
                stream().distinct().
                reduce(Integer.MAX_VALUE,Integer::min);//
    }
//6- Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
// aralarina bosluk koyarak yazan methodu olusturunuz?

     public static void oddNumQuebe(List<Integer> nums ){
        nums.stream().
                filter(t->t%2 !=0).
                map(t->t*t*t).
                distinct().
                forEach(System.out::print);//

     }
//7-    Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static void getUniqueNumAreaOfSum(List<Integer>nums){

        nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Math::addExact).get();
        System.out.println("nums = " + nums);//

    }


    }





