public class Cashier extends Person {
    public Cashier(String Name) {
        super(Name);
    }

    public String Greetings() {
        return "=Selamat Datang di Warung Ngopi!=\n" +
                "=Cashier : " + this.getNama() + "===========\n" +
                "==========(Daftar Menu)==========";
    }
}