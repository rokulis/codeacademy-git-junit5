public class Customer {
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

    String name;
    String email;
    Customer(String name, String email) throws CustomerException {
        if (name == null)
        {
            throw new CustomerException("Klaida: eilute tuscia");
        }
        if (name == null)
        {
            throw new CustomerException("Klaida: eilute tuscia");
        }


    }

}
