package day07stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
       String s="Mehmet  20 yasinda QA Developer kursunda $ dolarla  kazanmistir...";

       //exam: s stringindeki tum rakamlari "*" ceviriniz.

        String s1=s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);
//exam: s Stringindeki tum harfleri ve tum rakamlari "@" ceviriniz.
        
        String s2=s.replaceAll("[a-zA-Z0-9]","@");
        System.out.println("s2 = " + s2);
        //exam:s Stringindeki tum spaces disindaki karakterleri "+" yer degistiriniz.
        
       String s3= s.replaceAll("[^ ]","+");
        System.out.println("s3 = " + s3);
        //exam:s Stringindeki tum kucuk harfler disindaki karakterleri "*" yer degistiriniz
        
        String s4=s.replaceAll("[^a-z]","*");

        System.out.println("s4 = " + s4);
        //exam:s Stringindeki tum sesli harfler disindaki karakterleri "&" la yer degistiriniz.
        
       String s5= s.replaceAll("[^aeiouAEIOU]","&");

        System.out.println("s5 = " + s5);


    }
}
