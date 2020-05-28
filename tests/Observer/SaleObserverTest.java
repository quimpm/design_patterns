package Observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleObserverTest {

    Store store;
    Sale sale;

    @BeforeEach
    public void setUp(){
        store = new Store("Quim's", "C/Alt n9");
        Register registerStore = new Register(store);
        registerStore.createNewSale(new SaleObserver());
        sale = registerStore.getCurrentSale();
        ProductDescription product1 = new ProductDescription("Toahlitas para bebes", 2);
        ProductDescription product2 = new ProductDescription("Ki ishu no comprendu", 5);
        sale.createSalesLineItem(product1, 2);
        sale.createSalesLineItem(product2, 2);
    }

    @Test
    public void totalTest(){
        assertEquals(14, sale.total());
    }

    @Test
    public void ObserverTest(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        ProductDescription product3 = new ProductDescription("hotal", 3);
        sale.createSalesLineItem(product3, 1);
        assertEquals("hotal - 3 - 17\n", baos.toString());
    }

}
