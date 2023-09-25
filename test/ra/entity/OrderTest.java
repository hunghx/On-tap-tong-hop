package ra.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    @DisplayName("test case 1")
    void calPriceExport() {
        float input = 10;
        double except = 12;
        Order order = new Order();
        order.setPrice(input);
        Assertions.assertEquals(except,order.calPriceExport());
    }
    @Test
    @DisplayName("test case 2")
    void calPriceExport2() {
        float input = 5;
        double except = 6;
        Order order = new Order();
        order.setPrice(input);
        Assertions.assertEquals(except,order.calPriceExport());
    }
}