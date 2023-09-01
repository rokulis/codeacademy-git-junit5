import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    @Test
    public void testGetNamePrice() {
        Product produktas = new Product("Pienas", 2.39);
        assertEquals("Pienas", produktas.getName());
        assertEquals(2.39, produktas.getPrice());

    }


}
