public class Customer {
    private String name;
    private String email;

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
        if (name == null || email == null || name.equals("") || email.equals("")) {
            throw new CustomerException("Exception: at least one of the variables' value is null or empty");
        }
        else{
        this.email = email;
        this.name = name;}
    }


}
