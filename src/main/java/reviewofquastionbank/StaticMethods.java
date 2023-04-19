package reviewofquastionbank;

public class StaticMethods {
    static int x;
    int y;
     StaticMethods(){
         x+=2;
         y++;
     }
     static int getSquare(){
         return x*x;
     }

    public static void main(String[] args) {
        StaticMethods sm1=new StaticMethods();
        StaticMethods sm2=new StaticMethods();

        int z=sm1.getSquare();
        System.out.println("-x" + z +"-y" + sm2.y);//-16,-y1
    }
}
