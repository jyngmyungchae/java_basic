package inheritanceEx.drink;

public class Drink {

    private String name;
    private int price;
    private int count;


    Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }


    public int getTotalPrice(){
        int tp = price * count;
        return tp;
    }

    public static void printTitle(){
        System.out.println("상품명   단가    수량   금액");
    }

    public void printData(){
        System.out.println(name+"    "+price+"     "+count+"   "+price*count);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
