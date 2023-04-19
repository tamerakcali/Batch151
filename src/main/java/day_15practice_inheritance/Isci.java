package day_15practice_inheritance;

public class Isci extends Muhasebe{

    //bu class dan da object olusturulabilir.Bu class in child class larinin olmasi
    //object olusturmaya engel degildir.Ancak isciler icin surekli isci ve ustabasi olmaktan
    //baska ihtimal olmadigi icin isci class inda isci uretmeye gerek yoktur.


    protected String isciStatu="Surekli isci";

    protected void shift(){
        System.out.println("Isciler gunluk 8 saat haftada 5 gun calisir");

    }
}
