package StudiKasusBuAul;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Scanner;
public class pembeli extends user{
    Scanner in = new Scanner(System.in);
    private ArrayList<Integer> saldo = new ArrayList<>();

    public pembeli(){
        
    }

    public void addpembeli(String nama, String alamat, String jk, int saldo){
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.jk.add(jk);
        this.saldo.add(saldo);
    }
    public void getpembeli(int id){
        this.nama.get(id);
        this.alamat.get(id);
        this.jk.get(id);
        this.saldo.get(id);
    }

    public void tampil(){
        System.out.println("");
        System.out.println("=====PEMBELI=====");
        System.out.println("=================");
        for(int i = 0;i<nama.size();i++){
            System.out.println("");
            System.out.println("ID \t:"+(i+1));
            System.out.println("Nama \t:"+this.nama.get(i));
            System.out.println("Alamat \t:"+this.alamat.get(i));
            System.out.println("Jenis Kelamin :"+this.jk.get(i));
            System.out.println("Saldo \t:"+this.saldo.get(i));
            System.out.println("");
        }
    }
    public void tampil(int id){
        System.out.println("");
        System.out.println("=====PEMBELI=====");
        System.out.println("=================");
        System.out.println("Nama \t:"+this.nama.get(id));
        System.out.println("Alamat \t:"+this.alamat.get(id));
        System.out.println("Jenis Kelamin :"+this.jk.get(id));
        System.out.println("Saldo \t:"+this.saldo.get(id));
    }
    public void in(){
        int ulangin;
        do{
            System.out.println("");
            System.out.println("======INPUT PEMBELI=====");
            System.out.println("========================");
            System.out.print("Masukkan nama : ");
            String namain = in.next();
            System.out.print("Masukkan alamat : ");
            String alamatin = in.next();
            System.out.print("Masukkan Jenis kelamin : ");
            String jkin = in.next();
            System.out.print("Masukkan saldo : ");
            int saldoin = in.nextInt();
            System.out.print("Apakah anda mau isi lagi [1.ya] / [2.tidak] : ");
            ulangin = in.nextInt();
            addpembeli(namain, alamatin, jkin, saldoin);
        }while(ulangin == 1);
    }

    
    public void sisasaldo(int total, int id){
        int saldo = this.saldo.get(id);
        saldo-=total;
        if(saldo <0){
            System.out.println("saldo anda kurang");
        }
        else{

        }
        System.out.println("");
        System.out.println("=====PEMBELI=====");
        System.out.println("=================");
        System.out.println("Nama \t:"+this.nama.get(id));
        System.out.println("Alamat \t:"+this.alamat.get(id));
        System.out.println("Jenis Kelamin :"+this.jk.get(id));
        System.out.println("Sisa saldo \t:"+saldo);

    }



}
