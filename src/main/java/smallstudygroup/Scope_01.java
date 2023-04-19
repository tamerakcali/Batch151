package smallstudygroup;

public class Scope_01 {

    int age=20;
    static String name="Tuna";


    public static void main(String[] args) {

        Scope_01 obj=new Scope_01();
        System.out.println(obj.age);//20


        int age=15;

        System.out.println(age);//15

        System.out.println(name);//Tuna



    }
}
