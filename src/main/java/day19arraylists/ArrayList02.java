package day19arraylists;

import java.util.*;

public class ArrayList02 {
    public static void main(String[] args) {

        ArrayList<String> cities= new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("'Miami");
        cities.add("Giresun");
        System.out.println("cities = " + cities);
        
//bir arraylist de bir elemanin ilk gorunumu nasil silinir?

        cities.remove("Miami");
        System.out.println("cities");
        
//remove.index istedigimiz index i sileriz.
    
    cities.remove(2);
    
    List<Integer> ages=new ArrayList<>();//sadece list yazarak da array list olusturulabilir.
        
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);
//ex: 12 elemanini ages den siliniz.

    ages.remove((Integer)12);//arraylist ler non-primitive datalarla kullanildigi icin burada

      //!!!! int i Integer yaparak yani autoboxing wrapper class datasi yani non-primitive yaparak yazdiririz.

        System.out.println("ages = " + ages);

 //bir list deki elemanin tum gorunumlerini nasil sileriz?

        List<Object> citiesToRemove=new ArrayList<>();//yeni bir arraylist olusturuyoruz,sonra silecegimiz elemanlari
                                                      //icine koyuyoruz.

        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);//[Miami]

   //kisa yoldan list nasil olusturulur?
        List<Character> initials=List.of('a','k','c','d');
        System.out.println("initials = " + initials);//[a,k,c,d]

//   iki list in birbirine esit olup olmadigini nasil buluruz?

List<Character> letters=List.of('a','c','k','d');

   boolean r1=initials.equals(letters);
        System.out.println("r1 = " + r1);//false,cunku equal hem ayni elemanlarmi, hem de ayni elaman
                                          //ayni index demi diye check eder.dolayisiyla equals() methodu
                                          //ayni elemanlar ayni index de ise "true" return eder.

//ex:bir list deki tekrarsiz elemanlari consola yazdiran code u yaziniz.?

  /*  List<Double> prices=List.of(2.5,1.25,2.5,3.75,1.25,4.0);
    for(Double w:prices){
        if(prices.indexOf(w))==prices.lastIndexOf(w){
            System.out.println("w = " + w);

//ex:bir list de hic tekrarli olup olmadigini gosteren code u yaziniz?

    List<Double> heights=List(2.5,1.25,2.5,3.75,1.25,4.0);

    for(Double w:heights){
        int counter=0;

        if(heights.indexOf(w))!=heights.lastIndexOf(w);
        counter++;

    }

        }if(counter==0){
            System.out.println("some are uniqe");
        }else{
            System.out.println("some are not uniqe");


     */  } }
