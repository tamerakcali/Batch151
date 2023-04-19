package day_17practice;

public class Child2 extends Parent2{
    //extends yapilan  class lardaki tum  constructor larin ilk satirinda
    //gorunmese de super() constructor call
    // vardir ve oncelikle parent class daki constructor calisir.

    public Child2(int i) {
        super();
        System.out.println("child class single parameter");//once parent daki bos cons. yazdirir,sonra donup
                                                            //kendi tek parametreli cons. yazdirir.
    }

    public Child2() {
        super();
        System.out.println("Child class non-parameter constructor");//once parent daki bos cons. yazdirir sonra
                                                                    //donup bir alt satirdaki child cons. non yani burayi yazdirir
    }

    public Child2(int a, int b) {
        super(5,10,15);
        System.out.println("child class 2 parameter cons.");// burdada yine ayni parent daki bos
                                                           //cons. yazdirir,sonra burayi yazdirir.
    }

    // Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız==> super(0 constructoru
    // parent class daki parametresiz
   // consturctor u calistirir.

    public static void main(String[] args) {

        Child2 obj1=new Child2();
        Child2 obj2=new Child2(1);
        Child2 obj3=new Child2(2,3);




    }
}
