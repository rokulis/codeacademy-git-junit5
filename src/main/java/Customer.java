public class Customer {
    String name;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    Customer(String name, String email) throws CustomerException {
        if (name == null || email == null || name == ""|| email == "") {
            throw new CustomerException("Klaida: eilute tuscia");
        }


    }

}
