public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product p1 = new Product("Apple", 1.2);
        Product p2 = new Product("Orange", 0.8);

        try {
            cart.addProduct(p1);
            cart.addProduct(p2);
            Customer c1 = new Customer(null, "");
        } catch (CartException e) {
            e.printStackTrace();
        } catch (CustomerException a) {
            System.out.println( a.getMessage());
        }


        System.out.println("Total price: " + cart.calculateTotal());
    }
}

