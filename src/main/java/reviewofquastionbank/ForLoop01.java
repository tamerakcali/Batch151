package reviewofquastionbank;

public class ForLoop01 {
    public static void main(String[] args) {
        int y=1;
        for(int i=0;i<4;i++){
            y+=i;
            System.out.println(y);
        }
        for(int j=0;j<=10;j=j+3){
            System.out.print(j+" ");
        }
        for(int i=65;i<68;i++){
            System.out.print((char)i);
        }
        String s="Marra";
        for(int i=s.length()-1;i>-1;i--) {

            char c=s.charAt(i);
            
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                System.out.print(c);
            }
        }
            String s1="Love";
            for(int b=s1.length()-1;b>=0;b--){
                System.out.println(s1.charAt(b));
        }

    }
}
