package practices;

import java.util.Locale;
import java.util.Scanner;

public class Q06IfElse {
    public static void main(String[] args) {

//ex:Kullanicidan bir gun alin
//Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
//Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
//Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
// yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day name...");

        String dayName=input.next().toLowerCase();

        if(dayName.equals("Friday")){
            System.out.println("Sacred day for muslims");
        }else if(dayName.equals("Saturday")){
            System.out.println("Sacred day for Jewish's");
        }else if(dayName.equals("Sunday")){
            System.out.println("Sacred day for Christians");
        }else{
            System.out.println("Invalid day name");
 //ex:  Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
            //Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
            //3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
            //Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız

            System.out.println("Please enter a word that longer than 3characters");
           String word=input.next();//tuna==>unaTunauna

           if(word.length()<=3){
               System.out.println("Please enter at least 4 and more characters word");

           }else {
              String lastThirdWord= word.substring(word.length()-3);
               System.out.println(lastThirdWord +  word + lastThirdWord);

 //ex:
           }




        }

    }//main bodysi
}//class
