import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTest {
    Cart cart1 = new Cart();

    @Test

    public void addProductTest() {
        Product product1 = new Product("Milk", 1);
        try {
            cart1.addProduct(product1);
        } catch (CartException a) {
            System.out.println(a.getMessage());
        }
        double total = cart1.calculateTotal();
        Assertions.assertEquals(1, total);
    }

    @Test
    public void addProductTest1() {
        CartException tested = Assertions.assertThrows(CartException.class, () -> {
            Product product1 = new Product("Bowl", 0);
                cart1.addProduct(product1);

        }, "Cart Exeption was expected");

        Assertions.assertEquals("Invalid product price", tested.getMessage());
    }
}
