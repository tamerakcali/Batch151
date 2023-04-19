package day31collectionsmaps;

import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {

 /*
 maps=java da maps dictionary demektir.
 1-Maps key=value structure ni kullanir.
 key=tekrarsiz
 value=tekrarli olabilir.
 -key=value  bu structure da elementlere "Entry", tum
elementlere  "EntrySet" denir.cunku  her biri tekrarsizdir.
2-maps de hem key lerin hem de valu lerin data type olmalidir.
3-data type lari farkli olabilir.
4-hashmaps entry leri random siralar, bu nedenle en hizli map tir.
5-maps collection degildir,farkli bir yapidir.
6-loops, maps ile kullanilamaz,ancak entrySet ile entry ler aarasinda gezebiliriz.
7-Maps entries siralarken key leri esas alir.

  */

        HashMap<String,Integer> countryPopulation=new HashMap<>();//map nasil olusturulur
        countryPopulation.put("Germany",83000000);//nasil entry eklenir.
        countryPopulation.put("Albenia",30000000);
        countryPopulation.put("Usa",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",17000000);
        System.out.println("countryPopulation = " + countryPopulation);

        countryPopulation.get("Usa");//hangi elementi istiyorsak,o elementin valu sini verir
//get() methodu,key ile calisir value yi verir.

        Set<String> keys=countryPopulation.keySet();//bu method bize tum key leri verir,set ile calisir,cunku keys
                                    //tekrarsiz idi tekrarsiz elementler set ile calisir.
//tum value ler nasil aliriz.
     Collection<Integer> values=countryPopulation.values();


//ex:contrypopulation map indeki ulkelerin nufus ortalamasi nedir?

        Collection<Integer> value=countryPopulation.values();
        double sum=0;
        for(double w:value){
            sum=sum+w;
            System.out.println(sum/value.size());
            
 //entryset entry leri set in icine koyarak  verir.
 
        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();
  //ex:contryPopulation map indeki ulkelerin isimlerinin karakter sayisi ile nufuslarinin
  //toplamini bulunuz.
  
     int toplam=0;
     for(Map.Entry<String,Integer> w1:entries){
         toplam=toplam+w1.getKey().length()+w1.getValue();
         System.out.println("w1 = " + w1); 
     }
            
            
        }
       







    }
}
