package Observer;

public class ProductDescription {

    private String description;
    private int price;

    public ProductDescription(String description, int price){
        this.description=description;
        this.price=price;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }

}
