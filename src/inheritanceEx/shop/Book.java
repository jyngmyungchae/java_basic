package inheritanceEx.shop;

public class Book extends Item{
    private String autuor;
    private String isbn;

    Book (String name, int price, String autuor,String isbn){
        super(name,price);
        this.autuor = autuor;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : "+autuor+", isbn : "+isbn);
    }

}
