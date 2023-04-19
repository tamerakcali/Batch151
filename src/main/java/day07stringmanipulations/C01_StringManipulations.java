package day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //examp:s stringinin "money" ile bitip bitmedigini kontrol ediniz.

        String s="Learn java earn money";
       boolean isEnd=s.endsWith("money");
        System.out.println("isEnd = " + isEnd);
        
       //exam: s strinindeki "money" kelimesini "dolar" kelimesiyle replace yapalim.
       
      String s1= s.replace("money","dolar");

        System.out.println("s1 = " + s1);
                
        //exam:s stringdeki 'a' kelimesini '*' kelimesi ile degistiriniz.
        String s2=s.replace('a','*');
        
        //ex: s Stringindeki "L" harfini "***" ile degistiriniz.
        
        String s3=s.replace("L","***");
        System.out.println("s3 = " + s3);
        
        //s Stringindeki tum "e" harflerini siliniz.
        
        String s4=s.replace("e","");
        System.out.println("s4 = " + s4);
        

        
    }
}
