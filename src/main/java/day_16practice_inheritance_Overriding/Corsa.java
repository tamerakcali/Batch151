package day_16practice_inheritance_Overriding;

public class Corsa extends Opel{
    /*
    -INHERITANCE VARIABLES:olusturulan objectin data type hangi class a aitse ordan baslayarak bakar.yoksa
    parent ina gider,ilk buldugu yerden call eder.

    -INHERITANCE METHODS:Olusturulan OBJECTIN DATA type hangi class a aitse ordan baslar.
    yoksa parent a gider. buldugu yerden hemen call etmez.overriding edilmis mi diye
     control eder(olusturlan objectin constructor class ina(constructor a akadar)
      kadar ayni isimli method varmi diye control etmek),edilmis se onu call eder.
     */




    protected String speed="Corsa has max 200km/h";
    protected String fuel="Corsa  runs patrol or electric ";
    protected String model="Corsa";

    protected void engine(){
        System.out.println("Corsa uses environment friendly fuel");
    }
    protected void fuelConsumption(){
        System.out.println("Corsa consumes 5.6lt./km");
    }
    protected void gear(){
        System.out.println("Corsa has 5 gears");

    }

    public static void main(String[] args) {

        Corsa auto1=new Corsa();
        System.out.println(auto1.move);//Autos move on tyres
        System.out.println(auto1.speed);//Corsa has max 200km/h.  ilk kendi class inda buldugu icin burdan yazdirir.
        System.out.println(auto1.fuel);//Corsa  runs patrol or electric.yine kendi class inda oldugu icin burdan yazdiridi.
        System.out.println(auto1.brand);//Autos have produced brand. Bunu da auto parent class indan getirdi.

        auto1.engine();//Corsa uses environment friendly fuel.burda sadece methodu call ederiz sout a gerek yok,cunku
                       //sout yukarda method kisminda var

        //*********data turu farkli consturctor u farkli objectler*********

        Opel auto2=new Corsa();
        System.out.println(auto2.move);//bu durumda once opel class ina gider orda yoksa onun parent i olan
                                        //auto class ina gider, orda oldugundan ordan cagirdi.
        System.out.println(auto2.speed);//Opel have max 200KM. burda speed variable kendi class inda da var
        // opel class inda var.oncelikle data type opel oldugu icin  ordan call edildi. cunku object in data type opel.

        System.out.println(auto2.fuel);//Autos can run with different fuel.burda da once opel parent class ina gitti
                                      //orda olmadigi icin onun parent i auto class ina gitti ve ordan call etti. ama
                                    //kendisinde de vardi ama ordan kullanmadi, cunku geri donmeden sorgu yapar.burda da
                                    //yoksa kendisinde olsa bile geri donmedigi icin compile Time Error verir.

        System.out.println(auto2.headOffice);//Germany.burda dogrudan opel class indan call etti.

       // System.out.println(auto2.model);//burda da once opel parent class ina gitti
        //orda olmadigi icin onun parent i auto class ina gitti orda da yok.
        //kendisinde de vardi ama ordan kullanmadi, cunku geri donmeden sorgu yapar.burda da
        //yoksa kendisinde olsa bile geri donmedigi icin compile Time Error verir.



        auto2.engine();//Corsa uses environment friendly fuel.methodlarda biraz farkli.data type olan opel class ina gider
                        //orda engine methodu var, sonra overriding edilmis mi ona bakar, edilmisse kendisinde de oldugu icin
                        // kendisinden yazdirir.
        auto2.guarantee();//burda once , bu method override eilmedigi icin(yani ayni isimli method) kendi class inda
                        //olmadigi icin opel class indaki methodu call etti.kendisinde olsaydi yani override edilseydi
                       //kendi methodunu yazdiracakti
                        //Opel has 2 years for guarantee


       // auto2.gearNumber();//bu method parent larda olmadigi icin Compile Time Error verir.


        Auto auto3=new Corsa();
        System.out.println(auto3.move);//Autos move on tyres,auto class indan
        System.out.println(auto3.speed);//Autos run as their engine power auto class indan
        System.out.println(auto3.fuel);//Autos run with different fuel


        auto3.fuelConsumption();//Corsa consumes 5.6lt./km. override ettigi icin kendisininkini yazdirdi.

        auto3.engine();//Corsa uses environment friendly fuel
}
}
