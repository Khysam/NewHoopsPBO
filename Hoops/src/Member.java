import java.util.Scanner;
public class Member extends User{
    private String username;
    private String password;

    protected void melihat(int pesanan){
        System.out.println("id user :"+id);
        System.out.println("member : "+username);
        System.out.println("Total Pesanan :" +pesanan);
    }
    protected int mengisi(int n){
        Scanner in=new Scanner(System.in);
        setId(id(n));
        System.out.print("Masukkan username : ");
        username = in.next();
        setUsername(username);



        if(username.equals("sam")){
            System.out.print("Masukkan Password : ");
            password=in.next();
            setPassword(password);
            if(password.equals("240203")){
                System.out.print("Masukkan Total Pesanan : ");
                pesanan = in.nextInt();

            }
            else{
                System.out.println("Password Salah");
            }
        }
        else {
            System.out.println("Bukan Member");
        }
        return setPesanan(pesanan);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
