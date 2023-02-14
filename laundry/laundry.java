package laundry;
import java.util.ArrayList;
import java.util.Scanner;
public class laundry {
    Scanner in = new Scanner(System.in);
    customer customer =  new customer();
    public ArrayList<String> jenis = new ArrayList<String>();
    public ArrayList<Integer> harga = new ArrayList<Integer>();

    public laundry(){

    }
    public void addlaundry(String jenis, int harga){
        this.jenis.add(jenis);
        this.harga.add(harga);
    }
    public void setjenis(String jenis){
        this.jenis.add(jenis);
    }
    public void sethrga(int harga){
        this.harga.add(harga);
    }


    public String getjenis(int id){
        return this.jenis.get(id);
    }
    public Integer getharga(int id){
        return this.harga.get(id);
    }
    public void tampil(){
        System.out.println("DAFTAR LAUNDRY");
        System.out.println("==============");
        for(int i = 0;i<jenis.size();i++){
            System.out.println((i+1)+"."+"Jenis laundry : "+this.jenis.get(i));
            System.out.println((i+1)+"."+"Harga laundry : "+this.harga.get(i));
            System.out.println(" ");
        }

    }
}
