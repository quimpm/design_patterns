package Observer;

    public class CreateSaleLineItemDTO {

    public final String desc;
    public final int price;
    public final int total;

    public CreateSaleLineItemDTO(String desc, int price, int total){
       this.desc = desc;
       this.price = price;
       this.total = total;
    }

}
