import java.util.Scanner;
    public class Admin {
        private String username;
        private String password;
        User u = new User();
        Transaksi t = new Transaksi();
        Member m = new Member();
        Sepatu k = new Sepatu();
        Scanner in=new Scanner(System.in);
        protected void melihat(int a, int b){
            System.out.println("Id user : "+a);
            System.out.println("biaya : "+b);
        }
        private String user(){
            String u = "admin";
            return u;
        }
        private String pass(){
            String p = "admin";
            return p;
        }
        protected boolean mengisi(){
            boolean a = false;
            Scanner in=new Scanner(System.in);
            System.out.print("Masukkan username : ");
            username = in.next();
            setUesrname(username);

            if(username.equals(user())){
                System.out.print("Masukkan Password : ");
                password=in.next();
                setPassword(password);
                if(password.equals(pass())){
                    a = true;
                }
                else{
                    System.out.println("Password yang Anda Masukkan Salah!!!");
                }
            }
            else {
                System.out.println("Anda Bukan Admin");
            }
            return a;
        }
        protected int mengatur(){
            int harga;
            String merk;
            int diskon;

            System.out.println("Masukkan Merk Sepatu : ");
            merk = in.next();
            System.out.println("Masukkan Harga Sepatu :");
            harga = in.nextInt();

            t.setHarga(harga);
            return t.setHarga(harga);
        }
        protected int mengatur(int a){
            int diskon;
            System.out.println("Masukkan Diskon untuk member(%) : ");
            diskon = in.nextInt();
            t.setDiskon(a*diskon/100);
            return t.setDiskon(a*diskon/100);
        }
        private void menghapus(){

        }

        public String getUsername() {
            return username;
        }

        public void setUesrname(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

