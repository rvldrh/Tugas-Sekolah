package UKLTest;
import java.util.ArrayList;
import java.util.Scanner;
public class pinjam {
    Scanner in = new Scanner(System.in);
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private ArrayList<Integer> idb = new ArrayList<Integer>();
    private ArrayList<Integer> bnyk = new ArrayList<Integer>();
    
    siswa siswa = new siswa();
    buku buku = new buku();
    petugas petugas = new petugas();
    private int idsin;
    
    public pinjam(){

    }
    public void setids(int id){
        this.ids.add(id);
    }
    public void getids(int id){
        this.ids.get(id);
    }
    
    public void setidb(int id){
        this.idb.add(id);
    }
    public void getidb(int id){
        this.idb.get(id);
    }
    
    public void setbnyk(int id){
        this.bnyk.add(id);
    }
    public void getbnyk(int id){
        this.bnyk.get(id);
    }
    
    public void pinjam(){
        buku.tampil();
        petugas.tampil();
        petugas.siswain();

    }
}
