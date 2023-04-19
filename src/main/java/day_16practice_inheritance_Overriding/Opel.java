package day_16practice_inheritance_Overriding;

public class Opel extends Auto{

    protected String speed="Opel have max 200KM";
    protected String marka="Opel";
    protected String headOffice="Germany";
    protected void engine(){
        System.out.println("Opel use Opel engine ");

    }
    protected void guarantee(){
        System.out.println("Opel has 2 years for guarantee ");
    }

}
