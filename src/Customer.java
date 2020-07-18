public class Customer {
    private String kodeCustomer;
    private String nameCustomer;

    public Customer(String kodeCustomer, String nameCustomer) {
        this.kodeCustomer = kodeCustomer;
        this.nameCustomer = nameCustomer;
    }

    public String getKodeCustomer() {
        return kodeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }
}
