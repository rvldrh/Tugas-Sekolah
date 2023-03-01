package StudiKasusBuAul;
import java.util.ArrayList;
public class barang {
    public ArrayList<String>  nama = new ArrayList<>();
    public ArrayList<Integer>  harga = new ArrayList<>();
    public ArrayList<Integer>  stok = new ArrayList<>();

    public barang(){

        nama.add("Buku");
        harga.add(7000);
        stok.add(50);
        
        nama.add("Pensil");
        harga.add(3000);
        stok.add(150);
        
        nama.add("Bulpoin");
        harga.add(7000);
        stok.add(200);
        
        nama.add("Penggaris");
        harga.add(12000);
        stok.add(60);
        
        nama.add("Tip ex");
        harga.add(9000);
        stok.add(400);

    }
    public int sisastok(int id, int jumlah){
        int stok = this.stok.get(id);
        stok-=jumlah;
        return stok;
    }
    public void getbarang(int id){
        this.nama.get(id);
        this.harga.get(id);
        this.stok.get(id);
    }
    public int getharga(int id){
        return this.harga.get(id);
    }
    public void tampil(){
        System.out.println("");
        System.out.println("=====BARANG=====");
        System.out.println("================");
        for(int i = 0;i<nama.size();i++){
            System.out.println("ID \t:"+(i+1));
            System.out.println("Nama \t:"+this.nama.get(i));
            System.out.println("Harga \t:"+this.harga.get(i));
            System.out.println("Stok \t:"+this.stok.get(i));
            System.out.println("");
        }
    }
    public void tampil(int id){
        System.out.println("");
        System.out.println("=====BARANG=====");
        System.out.println("================");
        System.out.println("Nama \t:"+this.nama.get(id));
        System.out.println("Harga \t:"+this.harga.get(id));
        System.out.println("Stok \t:"+this.stok.get(id));
    }
    public void sisastokb(int id, int jumlah){
        System.out.println("");
        System.out.println("=====BARANG=====");
        System.out.println("================");
        System.out.println("Nama \t:"+this.nama.get(id));
        System.out.println("Harga \t:"+this.harga.get(id));
        System.out.println("Sisa Stok \t:"+sisastok(id, jumlah));
    }

}
