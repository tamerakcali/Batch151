package reviewofquastionbank;

public class While01 {
    public static void main(String[] args) {

        int x=0;
        while(x<10){
            x++;
        }
        String message=x>10?"Greater than":"Less than";
        System.out.println( message+","+x);

        int a=1,b=15;
        while(a<4){
            b--;
            a++;
            
        }
        System.out.println(a+","+ b);
        
        int m=10;
        int n=2;
        int sum=0;
        
        while(m>n){
            m--;
            n=n+2;
            sum=sum+m+n;
            
        }
        System.out.println("sum = " + sum);
    }
}
