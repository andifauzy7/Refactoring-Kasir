public class Customer extends Person {
    public static String[] DaftarMakanan = new String[10];
    public static String[] NoteKami = new String[10];
    public static int[] Jumlah = new int[10];
    public static int[] ListHarga = new int[10];
    public static int id=0;
    private static int BiayaTotal=0;
    public Customer(String Name){
        super(Name);
    }
    public static void Order(String NamaMakanan, int JumlahN, int Harga, String
            Keterangan){
        DaftarMakanan[id] = NamaMakanan;
        Jumlah[id] = JumlahN;
        if(Keterangan.equals("")){
            NoteKami[id] = "-";
        } else {
            NoteKami[id] = Keterangan;
        }
        ListHarga[id] = Harga*JumlahN;
        Order(Harga*JumlahN);
        id++;
    }
    public static void Order(int Harga){
        BiayaTotal += Harga;
    }
    public static int getBiayaTotal(){
        return BiayaTotal;
    }
    public static void DaftarOrder(){
        System.out.println("=================================");
        for (int i=0; i<id; i++){
            System.out.println(DaftarMakanan[i] + "\t\t | " + Jumlah[i] + " " +
                    ListHarga[i] + " | " +NoteKami[i]);
        }
        System.out.println("TAGIHAN : " + BiayaTotal);
        System.out.println("============Thanks You===========");
    }
}
