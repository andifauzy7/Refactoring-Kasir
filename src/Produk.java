public class Produk {
    private static String[] NamaMakanan = new String[10];
    private static String[] KodeProduk = new String[10];
    private static int[] Harga = new int[10];
    private static int id=0;
    public Produk(){
    }
    public Produk(String Nama, String IdProduk, int Nominal){
        NamaMakanan[id] = Nama;
        Harga[id] = Nominal;
        KodeProduk[id] = IdProduk;
        id++;
    }
    public static int getId() {
        return id;
    }
    public static void TampilMenu(){
        for (int i=0; i<id; i++){
            System.out.println(KodeProduk[i] + " | " + NamaMakanan[i] + "\t | " +
                    Harga[i]);
        }
        System.out.println("=================================");
    }
    public static int CariProduk(String Produk){
        int i=0;
        while (i<id){
            if(Produk.equals(KodeProduk[i])){
                return Harga[i];
            }
            i++;
        }
        return 0;
    }
    public static String CariNama(String Produk){
        int i=0;
        while (i<id){
            if(Produk.equals(KodeProduk[i])){
                return NamaMakanan[i];
            }
            i++;
        }
        return "";
    }
}