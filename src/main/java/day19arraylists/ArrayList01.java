package day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

  // ayni data type ndeki datalari depolamak icin array kullaniriz.ancak array lerin
//negatif bir yonu vardir, icine koyacagimiz eleman sayisini en basta belirlemek gerekir. bu code
// static yapmaz.yani ne kadar istersek o kadar artirabilmeli ve azaltabilmeliyiz.bu yuzden Java yeni
//bir yapi olusturmustur. buna "ArrayList" denir.Bu yapi eleman sayisinda esnektir.Yani 1000 eleman koydu isek
//arraylist onu 1000 olarak ayarlar.java arrays i iptal etmedi.cunku;
//a- arrays hizlidir,
//b-memory de az yer kaplarlar.Cunku primitiv data type ve reference(yani string non-primitive
// datalarin reference sini alir)lari depolayabilir.Reference stack memory de oldugu icin.
//"ArrayList" non-primitive data type lerini depolar. Bu nedenle arraylist arraylerden daha cok yer kaplar.

 //arraylist nasil olusturulur?.

 ArrayList<Integer> ages=new ArrayList<>();
        System.out.println("ages = " + ages);//[]
 //arraylist e eleman nasil eklenir?
 //add methodu elemanlari giris sirasina gore "insertion order" liste alir,en son gelen en sona eklenir.
 //1.WAY:
        ages.add(12);
        ages.add(24);
        ages.add(9);
        System.out.println("ages = " + ages);//[12,24]

//2.WAY: addall() methodu ole bir listi diger list in icine yerlestirilir.

 /*   Arraylist<Integer> price=new ArrayList<>();

     price.add(23);
     price.add(33);
//3.WAY:
ages.addAll(price);

//4.WAY:
        ages.addAll(3,price);



 //array liste eleman sayisi nasil bulunur?

      int numOfElm =ages.size();

 //arraylist de specific bir eleman nasil alinir? getmothodu ile istedigimiz elemani almaya yarar.

      int el=ages.get(1);

 //arraylist de specific bir eleman nasil degistirilir?
       ages.set();

 //arraylist de bir elemanin olup omadigi nasil bulunur?

      boolean res2= ages.contains();


//arraylist de eleman vermi yok mu nasil bulunur?

 ages.isEmpty();
 boolean res3=ages.isEmpty();

 //elemanlari nasil sileriz?
        ages.clear();
        System.out.println("res3 = " + res3);//[] output aliriz.

//ex:bir list in bos olup olmadigini check eden code u yaziniz?

  Arraylist<String> names=new ArrayList<>();
  names.add("Ajda");
  names.add("Cuneyt");
  names.add("Angelina");
  names.add("Brad");

//1.WAY:
         if(names.size()==0){
            System.out.println("liste bos");
        }else{
            System.out.println("eleman vardir");//bu iyi degil,isEmty methodu gelistirmistir.

 //2.WAY:isEmty() ile;
            if(names.isEmpty()){
                System.out.println("list is emty");
            }else{
                System.out.println("list has a elemant");

  */
            }

        }



