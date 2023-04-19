package day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
  /*
1-treemap "thread-safe" ve "synchronized" degildir.
2-multi-thread kullanilan maps de sadece hashtable kullanilir,cunku
hashMap ve hashtree kullanilmaz
2-treemaps value larda null kullanilmasina izin verir,key lerde vermez

3-treemaps entries i key leri esas alarak  naturally order gore siraya koyar,bu nedenle cok yavastir

   */
        long t1=System.nanoTime();
        HashMap<String,Integer> countryPop=new HashMap<>();

        countryPop.put("Usa",40000000);
        countryPop.put("Netherland",18000000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",80000000);
        countryPop.put("Germany",40000000);
        countryPop.put("madagaskar",3000000);

        TreeMap<String,Integer> countryPop1=new TreeMap<>(countryPop);//hashmap i treemap in icine koyarak
                                                                      //tree map e ceviriyoruz.

//code yazarken once entries leri hashMap ile olustururuz cunku random siralama yaptigi icin
//hizli calisir, dha sonra naturally order yapmak istersek treemap ile yapariz. boylece
//islemi hizli yapmis oluruz.



    }
}
