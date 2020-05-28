package Observer;

import java.util.Observer;

public class Register {
    private Store store;
    private Sale currentSale;

    public Register (Store store){
        this.store = store;
    }

    public void createNewSale(Observer saleObserver){
        currentSale = new Sale();
        currentSale.addObserver(saleObserver);
    }

    public Sale getCurrentSale() {
        return currentSale;
    }
}
