package review_01;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps_01 {
    public static void main(String[] args) {

        Map<Integer,String > map1= new HashMap<>();
        map1.put(101, "Ali, Can, Java");
        map1.put(101, "Veli, Yan, Java");
        map1.put(101, "Ali, Yan, C#");
        String istenenDil = "Java";

        List<String> isimList = javaBilenler(map1,istenenDil);
        System.out.println("isimList = " + isimList);

    }

    private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
        List<String> isimListesi = new ArrayList<>();
        for (String each: map1.values()){
            String arr[] = each.split(", ");
            if (arr[2].equalsIgnoreCase(istenenDil)){
                isimListesi.add(arr[0]);

            }
        }
        return isimListesi;
    }
}
