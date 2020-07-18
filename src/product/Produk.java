package product;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private int hargaProduk;
    public Produk(String kodeProduk, String namaProduk, int hargaProduk) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }
}