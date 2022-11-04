import java.util.ArrayList;
import java.util.*;

public class Main {
    int z;
    public Main(){
        z = 1;
    }
    public static void main(String[] args) {
        Admin a = new Admin();
        User u = new User();
        Member m = new Member();
        Transaksi t = new Transaksi();
        Scanner in = new Scanner(System.in);
        Main ab = new Main();
        ArrayList ue = new ArrayList();
        int n = ab.z;
        int set = 0;
        ue.add(set);
        int harga = 500000, diskon = 200,total;
        int pil, pi;
        int pesanan;
        boolean ad;
        String ph="y";


        while (ph.equals("y")) {
            String pilih = "y";

            System.out.println("Masuk sebagai :");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Member");
            System.out.print("Masukkan Pilihan :");
            pil = in.nextInt();

            switch (pil) {
                case 1:
                    ad = a.mengisi();
                    if (ad) {
                        while (pilih.equals("y")) {
                            System.out.println("Menu :");
                            System.out.println("1. Melihat");
                            System.out.println("2. Mengatur Pesanan");
                            System.out.println("3. Diskon");
                            System.out.println("Masukkan pilihan :");
                            pi = in.nextInt();
                            switch (pi) {
                                case 1:
                                    System.out.println("Masukkan id user : ");
                                    int ka = in.nextInt();
                                    int jml = (int) ue.get(ka);
                                    a.melihat(ka, jml);
                                    break;
                                case 2:
                                    harga = a.mengatur();
                                    System.out.println(harga);
                                    break;
                                case 3:
                                    diskon = a.mengatur(harga);
                                    System.out.println(diskon);
                                    break;
                            }

                            System.out.println("kembali ke menu admin y/n :");
                            pilih = in.next();

                        }
                    }
                    break;
                case 2:
                    pesanan = 0;
                    total = 0;
                    while (pilih.equals("y")) {
                        pesanan += u.mengisi(n);
                        System.out.println("apakah ingin tambah pesanan y/n : ");
                        pilih = in.next();
                    }
                    u.melihat(pesanan);
                    total = t.hitung(harga, pesanan);
                    System.out.println("Total Harga :"+total);
                    ue.add(total);
                    n++;
                    break;
                case 3:
                    pesanan = 0;
                    total = 0;
                    while (pilih.equals("y")) {
                        total += m.mengisi(n);
                        System.out.println("apakah ingin tambah waktu y/n : ");
                        pilih = in.next();
                    }
                    m.melihat(pesanan);
                    total = t.hitung(harga, pesanan, diskon);
                    System.out.println("total harga :"+total);
                    ue.add(total);
                    n++;
                    break;
            }

            System.out.println("kembali ke menu awal y/n :");
            ph = in.next();
        }
    }
}