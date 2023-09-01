

public class Customer {
    String name;
    String email;

    public Customer(String name, String email) throws CustomerException {
        if (name != null) {
            this.name = name;
            this.email = email;
        } else {
            throw new CustomerException("Radau NULL");
        }
    }

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
}
