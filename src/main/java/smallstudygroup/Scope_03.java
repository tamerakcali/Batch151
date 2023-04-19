package smallstudygroup;

public class Scope_03 {

       int a=5;
       int b=10;
       int c=15;

       Scope_03(int a){
           System.out.println("a = " + a);//7
           System.out.println(this.a);//5
       }
        Scope_03 (int a,int b){
           this(7);
            System.out.println(a+b);//12
            System.out.println(this.b);//10
        }

    public static void main(String[] args) {
      //  Scope_03 obj=new Scope_03(1);

        int x=5;
        int y=7;
        Scope_03 obj=new Scope_03(x,y);//


    }
}
