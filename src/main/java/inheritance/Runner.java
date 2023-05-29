package inheritance;

public class Runner {

    public static void main(String[] args) {

        Vehicle c1=new Vehicle();
        Car c2=new Car();
         Motor c3=new Motor();
        c1.start();
        c1.stop();

        System.out.println(c3.price);
        System.out.println(c1.model);
        System.out.println(c2.model);

    }
}
