package laundry;
import java.util.ArrayList;
import java.util.Scanner;
public class customer {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        run run = new run();
        laundry laundry = new laundry();
            laundry.addlaundry("kiloan",9000);
            laundry.addlaundry("Dry Cleaning", 12000);
            laundry.addlaundry("Self service", 3000);
            laundry.addlaundry("On demand", 15000);
        }
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<Character> jk = new ArrayList<Character>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public customer(){

    }
    public void setcus(String nama,String alamat,char jk,int saldo){
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.jk.add(jk);
        this.saldo.add(saldo);

    }
    public void setnama(String nama){
        this.nama.add(nama);
    }
    public void setalamat(String alamat){
        this.alamat.add(alamat);
    }
    public void setjk(char jk){
        this.jk.add(jk);
    }
    public void setsaldo(int saldo){
        this.saldo.add(saldo);
    }


    public String getnama(int id){
        return nama.get(id);
    }
    public String getalamat(int id){
        return alamat.get(id);
    }
    public Character getjk(int id){
        return jk.get(id);
    }
    public Integer getsaldo(int id){
        return saldo.get(id);
    }

    public void in(){
        String nama,alamat,ulang;
        int saldo,id = 1;
        char jk;
        System.out.println("INPUT CUSTOMER");
        System.out.println("==============");
        
            System.out.print("masukkan nama : ");
            nama = in.next();
            System.out.print("masukkan alamat : ");
            alamat = in.next();
            System.out.print("masukkan jenis kelamin : ");
            jk = in.next().charAt(0);
            System.out.print("masukkan saldo anda : ");
            saldo = in.nextInt();
            
        setcus(nama, alamat, jk,saldo);
    }
    public void tampil(){
            System.out.println("Nama anda : "+nama.get(0));
            System.out.println("Nama anda : "+alamat.get(0));
            System.out.println("Jenis kelamin anda : "+jk.get(0));
        
    }
    
    
}
