package Observer;

import java.util.Observable;
import java.util.Observer;

public class SaleObserver implements Observer {

    /*@Override
    public void update(Observable o, Object arg) {
        Sale sender = (Sale) o;
        String description = sender.lastItemAdded().getDesc().getDescription();
        int price = sender.lastItemAdded().getDesc().getPrice();
        int accumtotal = sender.total();

        System.out.printf("%s - %d - %d \n", description, price, accumtotal);
    }*/

    @Override
    public void update(Observable o, Object arg) {
        CreateSaleLineItemDTO dto = (CreateSaleLineItemDTO) arg;
        System.out.printf("%s - %d - %d%n", dto.desc, dto.price, dto.total);
    }

}
