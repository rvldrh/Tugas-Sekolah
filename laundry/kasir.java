package laundry;
import java.util.ArrayList;
public class kasir {
    public ArrayList<String> nama = new ArrayList<String>();
    public ArrayList<Character> jk = new ArrayList<Character>();
    public ArrayList<Integer> pin = new ArrayList<Integer>();
    

    public kasir(){

    }
    public void addkasir(String nama,char jk){
        this.nama.add(nama);
        this.jk.add(jk);
    }
    public void setnama(String nama){
        this.nama.add(nama);
    }
    public void setjk(char jk){
        this.jk.add(jk);
    }

    public String getnama(int id){
        return nama.get(id);
    }
    public Character getjk(int id){
        return jk.get(id);
    }
    public void tampil(){
        System.out.println("KASIR");
        System.out.println("=====");
        for(int i = 0;i<nama.size();i++){
            System.out.println((i+1)+"."+"Nama kasir : "+nama.get(i));
            System.out.println((i+1)+"."+"Jenis kelamin : "+jk.get(i));
            System.out.println(" ");
        }
    }

}
