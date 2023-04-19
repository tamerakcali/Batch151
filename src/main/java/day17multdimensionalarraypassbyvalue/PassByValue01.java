package day17multdimensionalarraypassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {


 //ex:
        int shirtPrice=200;
        System.out.println(discount("student",shirtPrice));

        System.out.println(shirtPrice);

    }
    //onceki methodun disinda yeni bir method olusturuyoruz.

    //1-access modifier
    // 2-return type
    // 3-method name
    //4-method parantez
    //5-method curly braces(method body scope)

    public static int discount (String type,int price) {
        switch (type) {
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;

        }
    return price;

    }
}
