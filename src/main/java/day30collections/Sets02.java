package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
 //natural order da siralanmis ogrenci e-mail adreslerini depolayiniz?
//!!!!INTERVIEW SORUSU
 //1.WAY:tree set ile

 TreeSet<String> emails=new TreeSet<>();

        emails.add("abc@gmail.com");
        emails.add("dbc@gmail.com");
        emails.add("fab@gmail.com");
        emails.add("ecz@gmail.com");
        emails.add("asv@gmail.com");
        emails.add("add@gmail.com");
        System.out.println("emails = " + emails);
  //2.WAY:hashSet ile

       HashSet<String> emailsHs=new HashSet<>();//hizli olusturmak icin once hashSet ile depolariz,sonrada
                                                //treeSet ile de naturally order a koyariz.
        emailsHs.add("abc@gmail.com");
        emailsHs.add("dbc@gmail.com");
        emailsHs.add("fab@gmail.com");
        emailsHs.add("ecz@gmail.com");
        emailsHs.add("asv@gmail.com");
        emailsHs.add("add@gmail.com");
        System.out.println("emailsHs = " + emailsHs);

        TreeSet<String> emailsHsTree=new TreeSet<>(emailsHs);//bununlada order akoyariz
        System.out.println("emailsHsTree = " + emailsHsTree);
    }
}
