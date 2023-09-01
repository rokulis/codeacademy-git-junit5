import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CartTest {
    @Test
            public void testAddPriceAndCalculateTotal() {
        Cart krepselis = new Cart();
        Product p1 = new Product("Apple", 1.2);
        Product p2 = new Product("Orange", 0.8);

        try {
            krepselis.addProduct(p1);
            krepselis.addProduct(p2);
        } catch (CartException e) {
            e.printStackTrace();
        }
        assertEquals(2.0, krepselis.calculateTotal());
    }
    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(CartException.class, () -> {
            Cart krepselis = new Cart();
            Product p1 = new Product("Apple", 0.0);
            krepselis.addProduct(p1);
        });
        assertEquals("Invalid product price", exception.getMessage());
    }


}
