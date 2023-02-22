package UKLTest;
import java.util.ArrayList;
import java.util.Scanner;
public class siswa {
    Scanner in = new Scanner(System.in);
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> notelp = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();


    public siswa(){
        
    }
    public void addsiswa(String nama,String alamat,String notelp,Boolean status){
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.notelp.add(notelp);
        this.status.add(status);
    }
    public void getsiswa(int id){
        this.nama.get(id);
        this.alamat.get(id);
        this.notelp.get(id);
        this.status.get(id);
    }
    public void setstatus(int id){
        this.status.set(id, false);
    }
    public String getnama(int id){
        return this.nama.get(id);
    }
    public String getalamat(int id){
        return this.alamat.get(id);
    }
    public String getnotelp(int id){
        return this.notelp.get(id);
    }
    public Boolean getstatus(int id){
        return this.status.get(id);
    }
    public void getset(int id){
        this.status.get(id);
        this.status.add(false);
    }
    public void tampilid(int id){
        System.out.println("");
        System.out.println("SISWA YANG PINJAM");
        System.out.println("=================");
        System.out.println("Nama \t:"+this.nama.get(id));
        System.out.println("Alamat \t:"+this.alamat.get(id));
        System.out.println("No Telp \t:"+this.notelp.get(id));
        System.out.println("Status \t:"+this.status.get(id));
    }
    public void tampil(){
        System.out.println("");
        System.out.println("SISWA");
        System.out.println("=====");
        for(int i = 0;i<nama.size();i++){
            System.out.println("ID \t:"+(i+1));
            System.out.println("Nama \t:"+this.nama.get(i));
            System.out.println("Alamat \t:"+this.alamat.get(i));
            System.out.println("No Telp \t:"+this.notelp.get(i));
            System.out.println("Status \t:"+this.status.get(i));
            System.out.println(" ");
        }
    }
    public void siswain(){
        String namain,alamatin,notelpin;
        int ulang;
        do{
            System.out.println(" ");
            System.out.println("SISWA INPUT");
            System.out.println("===========");
            System.out.print("Masukkan nama siswa : ");
            namain = in.next();
            System.out.print("Masukkan alamat siswa : ");
            alamatin = in.next();
            System.out.print("Masukkan notelp siswa : ");
            notelpin = in.next();
            System.out.println("");
            System.out.print("Apakah anda mau mengisi lagi? [1.ya] / [2.tidak]");
            ulang = in.nextInt();
            addsiswa(namain, alamatin, notelpin, true);
        }while(ulang==1);
        tampil();
    }
    

    

}
