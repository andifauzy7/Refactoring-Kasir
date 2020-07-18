public class Cashier {
    private String kodeCashier;
    private String nameCashier;
    public Cashier(String kodeCashier, String nameCashier) {
        this.kodeCashier = kodeCashier;
        this.nameCashier = nameCashier;
    }
    public String getKodeCashier() {
        return kodeCashier;
    }

    public String getNameCashier() {
        return nameCashier;
    }
}