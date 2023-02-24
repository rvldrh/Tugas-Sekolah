package UKLTest;
import java.util.ArrayList;
public class buku {
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public buku(){
        nama.add("komik");
        stok.add(20);
        harga.add(87000);

        nama.add("novel");
        stok.add(30);
        harga.add(97000);
        
        nama.add("manga");
        stok.add(35);
        harga.add(85000);
        
        nama.add("biografi");
        stok.add(15);
        harga.add(105000);
        
        nama.add("pelajaran");
        stok.add(50);
        harga.add(90000);
    }
    public void addbuku(String nama,int stok, int harga){
        this.nama.add(nama);
        this.stok.add(stok);
        this.harga.add(harga);
    }
    public void getbuku(int id){
        this.nama.get(id);
        this.stok.get(id);
        this.harga.get(id);
    }
    public int kurangstok(int id,int jumlah){
        int sisa = this.stok.get(id);
        sisa -= jumlah;
        return sisa;
    }
    public int getstok(int id){
        return this.stok.get(id);
    }
    public void tampil(){
        System.out.println("BUKU");
        System.out.println("====");
        for(int i = 0;i<nama.size();i++){
            System.out.println("ID \t:"+(i+1));
            System.out.println("Jenis \t:"+this.nama.get(i));
            System.out.println("Stok \t:"+this.stok.get(i));
            System.out.println("Harga \t:"+this.harga.get(i));
            System.out.println(" ");
        }
    }
    public void tampilid(int id){
        System.out.println("");
        System.out.println("BUKU");
        System.out.println("==================");
        System.out.println("ID \t:"+(id+1));
        System.out.println("Jenis \t:"+this.nama.get(id));
        System.out.println("Stok \t:"+this.stok.get(id));
        System.out.println("Harga \t:"+this.harga.get(id));
    }
    public void sisabuku(int id){
        System.out.println("");
        System.out.println("BUKU YANG DIPINJAM");
        System.out.println("==================");
        System.out.println("ID \t:"+(id+1));
        System.out.println("Jenis \t:"+this.nama.get(id));
        System.out.println("Sisa Stok \t:"+kurangstok(id, 1));
        System.out.println("Harga \t:"+this.harga.get(id));
        System.out.println("");
    }
}
