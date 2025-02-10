package accessmodifierEx;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;
    int sum=0;

    ShoppingCart (){}



//    public int addItem (Item item){
//        sum = item.getPrice() * item.getQuantity();
//        return sum;
//    }

    public void addItem (Item item){
        if (itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount ++;
    }

    public void displayItems (){
        System.out.println("장바구니 상품 출력");



    }
}
