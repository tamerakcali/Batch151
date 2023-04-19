package practices;

public class NestedTernarySwitch01 {
    public static void main(String[] args) {
        char y='c';
        
        String str=(y>'a' && y<'z') ? (y<'f'? "good" :"bad"):(y>'K' ? "big" :"small");
        System.out.println("str = " + str);
    }
}
