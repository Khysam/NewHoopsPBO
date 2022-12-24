import java.util.ArrayList;
import java.util.Scanner;
public class User extends Pelanggan{
    protected int id;
    protected int pesanan;
    public int mengisi(){

        return 0;

    }
    @Override
    public void melihat(){
    }

    protected void melihat(int pesanan){
        System.out.println("id user :"+id);
        System.out.println("Total Pesanan : " +pesanan);
    }
    protected int id(int j){
        ArrayList ue = new ArrayList();
        int n = 0;
        for(int i=0; i<=10;i++){
            ue.add(n);
            n++;
        }

        return ue.indexOf(j);
    }
    protected int mengisi(int n){
        Scanner in = new Scanner(System.in);
        Scanner Sepatu = new Scanner(System.in);
        Sepatu nama = new Sepatu();
        setId(id(n));
        System.out.println("Masukkan merk sepatu : ");
        nama.nama_sepatu = Sepatu.nextLine();
        System.out.print("Masukkan Total Pemesanan ");
        pesanan = in.nextInt();
        return setPesanan(pesanan);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPesanan() {
        return pesanan;
    }

    public int setPesanan(int pesanan) {
        this.pesanan = pesanan;
        return pesanan;
    }
}
