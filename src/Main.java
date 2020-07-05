import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Customer Pembeli = new Customer("Andi Fauzy");
        Cashier Penjaga = new Cashier("Budi Doremi");
        System.out.println(Penjaga.Greetings());
        // Daftar Makanan.
        Makanan[] DaftarMakanan = new Makanan[4];
        DaftarMakanan[0] = new Makanan("Pempek Spec", "MK001", 20000);
        DaftarMakanan[1] = new Makanan("Sate Ayam", "MK002", 25000);
        DaftarMakanan[2] = new Makanan("Nasi Goreng", "MK003", 13000);
        DaftarMakanan[3] = new Makanan("Soto Ayam", "MK004", 15000);
        // Daftar Minuman.
        Minuman[] DaftarMinuman = new Minuman[3];
        DaftarMinuman[0] = new Minuman("Teh Tarik", "MN005",7000);
        DaftarMinuman[1] = new Minuman("Susu Jahe", "MN006",7000);
        DaftarMinuman[2] = new Minuman("Kopi Susu", "MN007",5000);
        Produk.TampilMenu();
        String Konfirmasi;
        String MinumanNote;
        String Keterangan="";
        boolean Lagi = false;
        while (Lagi != true){
            System.out.print("Pilih Menu (Input Kode) : ");
            String KodeMenu = Input.nextLine();
            int Harga = Produk.CariProduk(KodeMenu);
            System.out.print("Banyak Pesanan : ");
            int BanyakPesanan = Integer.valueOf(Input.nextLine());
            if(KodeMenu.substring(0,2).equals("MN")){
                String Tambahan;
                System.out.print("Pakai Gula [true/false] : ");
                MinumanNote = Input.nextLine();
                if(MinumanNote.equals("true")){
                    Keterangan += Produk.CariNama(KodeMenu) + " " + "Pakai Gula ";
                }
                System.out.print("Pakai Es [true/false] : ");
                MinumanNote = Input.nextLine();
                if(MinumanNote.equals("true")){
                    Keterangan += "Pakai Es.";
                }
            }
            Customer.Order(Produk.CariNama(KodeMenu), BanyakPesanan, Harga,
                    Keterangan);
            System.out.print("Pesan Kembali [true/false]: ");
            Konfirmasi = Input.nextLine();
            if(Konfirmasi.equals("false")){
                Lagi = true;
            } else {
                Lagi = false;
            }
            Keterangan="";
        }
        Customer.DaftarOrder();
    }
}

