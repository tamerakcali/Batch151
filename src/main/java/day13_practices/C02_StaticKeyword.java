package day13_practices;

public class C02_StaticKeyword {

    //bu class calistiginda output nedir?

    static int y;
           int x;

    public C02_StaticKeyword(int i) {

        x+=i;
        y+=i;
    }

    public static void main(String[] args) {


        C02_StaticKeyword obj1=new C02_StaticKeyword(2);
        C02_StaticKeyword obj2=new C02_StaticKeyword(3);//parametreli cons. olusturdugumuz icin obj1 de
                                                        // default constructor kalkar ve 2. obje de parametre ister
        System.out.println(obj1.x+","+obj2.x+","+obj2.y);//2,3,5
//olusturulan object parametreli ise parametreli constructor a , degilse parametresiz constructor a gider.
    }

}
