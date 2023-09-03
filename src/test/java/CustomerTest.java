import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testForGetName(){
        try{
        Customer customer1= new Customer("Final", "email@email.com");
            Assertions.assertEquals("Final", customer1.getName());
        }
        catch (CustomerException a){
            System.out.println(a.getMessage());
        }
          }
          @Test
    public void testForGetEmail(){
              try{
                  Customer customer1= new Customer("Final", "email@email.com");
                  Assertions.assertEquals("email@email.com", customer1.getEmail());
              }
              catch (CustomerException a){
                  System.out.println(a.getMessage());
              }
          }
          @Test
    public void testForCustomerException(){
              CustomerException tested = Assertions.assertThrows(CustomerException.class, () -> {
                  Customer customer= new Customer("", "hey");


              }, "CustomerExeption was expected");

              Assertions.assertEquals("Exception: at least one of the variables' value is null or empty", tested.getMessage());
          }
          @Test
    public void testForCustomerException1(){
        CustomerException tested = Assertions.assertThrows(CustomerException.class, () -> {
            Customer customer= new Customer("Hey", null);


        }, "CustomerExeption was expected");

        Assertions.assertEquals("Exception: at least one of the variables' value is null or empty", tested.getMessage());
    }
    @Test
    public void testForSetName(){
        try{
            Customer customer1= new Customer("Final", "email@email.com");
            customer1.setName("FinalFinal");
            Assertions.assertEquals("FinalFinal", customer1.getName());
        }
        catch (CustomerException a){
            System.out.println(a.getMessage());
        }
    }
    @Test
    public void testForSetEmail(){
        try{
            Customer customer1= new Customer("Final", "email@email.com");
            customer1.setEmail("super@gmail.com");
            Assertions.assertEquals("super@gmail.com", customer1.getEmail());
        }
        catch (CustomerException a){
            System.out.println(a.getMessage());
        }
    }
}


