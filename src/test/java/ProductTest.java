import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void firstTest(){
        Product product1= new Product("Vilkas", 12);
       String name1= product1.getName();
        Assertions.assertEquals("Vilkas", name1);
    }
    @Test
    public void secondTest(){
        Product product1= new Product("Vilkas", 12);
        double price1=  product1.getPrice();
        Assertions.assertEquals(12, price1);
    }

}
