package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Sale extends Observable {

    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        setChanged();
        //notifyObservers(); // pull
        notifyObservers(new CreateSaleLineItemDTO(desc.getDescription(), desc.getPrice(), total())); // push
    }

    public int total() {
        int acum = 0;
        for(SLI elem : lines){
            acum += elem.subTotal();
        }
        return acum;
    }

    //for pull
    public SLI lastItemAdded(){
        return lines.get(lines.size() - 1);
    }

}
