public class Main {
    public static void main(String[] args) throws CustomerException {
        Cart cart = new Cart();
        Product p1 = new Product("Apple", 1.2);
        Product p2 = new Product("Orange", 0.8);

        try {
            cart.addProduct(p1);
            cart.addProduct(p2);
        } catch (CartException e) {
            e.printStackTrace();
        }

        System.out.println("Total price: " + cart.calculateTotal());


        try {
            Customer klientas = new Customer(null, "sim@gmail.com");
        }catch (CustomerException e) {
            System.out.println(e.getMessage());
        }
    }


}
