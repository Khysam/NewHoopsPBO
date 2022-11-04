public class Transaksi {
    public int harga;
    public int biaya;
    public int diskon;

    public void bayar(){

    }
    public int hitung(int x,int y){
        setHarga(x);
        return x*y;
    }
    public int hitung(int x,int y,int z){
        setHarga(x);
        setDiskon(y);
        return x*y-z;
    }

    public int getHarga() {
        return harga;
    }

    public int setHarga(int harga) {
        this.harga = harga;
        return harga;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getDiskon() {
        return diskon;
    }

    public int setDiskon(int diskon) {
        this.diskon = diskon;
        return diskon;
    }
}
