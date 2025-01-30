package inheritanceEx.drink;

public class Alcohol extends Drink{
    private double alcper;

    Alcohol(String name,int price,int count,double alcper){
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle(){
        System.out.println("상품명(도수 %)   단가    수량   금액");
    }


    @Override
    public void printData() {
        super.printData();
//        System.out.println(getName()+"  "+getPrice()+"  "+getCount()+"  "+getTotalPrice());
    }
}
