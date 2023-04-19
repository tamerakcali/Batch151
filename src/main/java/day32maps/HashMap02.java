package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

//ex:type code to print the number of occurances of words in a sentence?
// I like you,like like!  ==>I=1, like=3  you=1  !!!!INTERVIEW SORUSU.

 //ilk olarak  like! daki unlem isaretini silmeliyiz.

    String s="I like you,like like!";
    s=s.replaceAll("\\p{Punct}","");

    //2.step  words ile calismaliyiz.bir array olusturacagiz
        String words[]=s.split("");
        System.out.println(Arrays.toString(words));//[I-like-you-like-like]



//3.step   I=1, like=3  you=1 bizden key ve value li gorunum istedigi icin hashMap kullaniriz
        HashMap<String,Integer> occurrance=new HashMap<>();
 //1-words array indeki kelimeler birer birer map de varmi yokmu kontrol edilecek
 //2-words array indeki kelimeler map de yok ise map e value si 1 olarak eklenecek,
 //varsa var olan value bir artirilarak yerlestirilecek


     for(String w:words) {
       Integer numOfOcc= occurrance.get(w);
       if(numOfOcc==null){
           occurrance.put(w,1);
       }else{
           occurrance.replace(w,numOfOcc+1);
       }
     }

        System.out.println(occurrance);




    }
}
