package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

            HashMap<String,Integer> stdAges=new HashMap<>();
            stdAges.put("Ajda",77);
            stdAges.put("Ezel",38);
            stdAges.put("Tom",76);
            stdAges.put("Brad",58);
            stdAges.put("Angelina",58);
     //  //key i tekrarli yazdirdigimizda,son ekledigimizi yazar.en son verilen tekrarli 76 degil
     //83 tom u verir.bu value update icin kullanilir. buna "overwrite" denir.
            stdAges.put("Tom",83);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}
            System.out.println(stdAges);//{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

            stdAges.replace("Ezel",39);//verdigimiz key in value sini update eder.

            stdAges.replace("Angelina",58,61);//verilen yeni value yi istenilen value
                                                                    //ye gore degistirir.eger 57 olsaydi degistirmeyecekti.
                                                                //58 verseydik degistirecekti.

        stdAges.putIfAbsent("Ali",60);//istedigimiz key yoksa ekler, var ise birsey yapmaz.
//getOrDefault methodu, map de olan key ler icin get methodu ile ayni degeri verir,ancak map de
//yok olan icin get den farkli olarak ikinci verdigimiz  value yi verir.Ama get null verir
        stdAges.get("Tom");//verdigimiz key in valuesini verir ama
        stdAges.getOrDefault("Tom",0);//ayni verir

        stdAges.get("ayse");//map de key olmadigi icin "null"verir.
        stdAges.getOrDefault("ayse",0);//0 verir

        stdAges.remove("Tom");//methodu map de key e gore siler
        stdAges.remove("tom",81);//bu method ise hem key hem de value bakarak siler, ikiside
                                //ayni ise siler, farkli ise silmez.

        HashMap<String,Integer> kidsAges=new HashMap<>();
        kidsAges.put("John",12);
        kidsAges.put("Jim",22);
        kidsAges.put("Jack",32);
        stdAges.putAll(kidsAges);//bir map i diger map in icine koyar,ilk map in icine ikincisini koyar.
        System.out.println(stdAges);//{Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Ali=60, Jim=22}



    }
}
