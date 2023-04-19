package day33maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

         String s="HelloHenry!";
        System.out.println(getTheNumOfOccuOfLetters(s));

    }
    //ex:verilen string de hangi harfin kac defa kullanildigini veren method olusturunuz?
 //"Hello Henry!"==>H=2 e=2 l=2 o=1 n=1 r=1 y=1
//1.step bir method olusturmaliyiz

    public static HashMap<String,Integer> getTheNumOfOccuOfLetters(String s){

//2.step   string deki harf haric characterleri siliyoruz
        s=s.replaceAll("[A-Za-z]","");//unlem isaretini silmek icin bunu yaptik

//3.step gorunum sayisini depolamak icin bir hashmap olusturmalyiz

   HashMap<String,Integer> numOfOcc=new HashMap<>();


//4.step harfleri ayristirmaliyiz

        String letters[]=s.split("");

 //5.step for each loop olusturuurz
        for(String w:letters){
         Integer numOfOc=numOfOcc.get(w);
         if(numOfOc==null){
             numOfOcc.put(w,1);

         }else{
             numOfOcc.replace(w,numOfOc+1);
         }


 }
        return numOfOcc;


    }



}
