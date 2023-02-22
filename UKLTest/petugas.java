package UKLTest;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.FlavorException;
public class petugas {
    buku buku = new buku();
    siswa siswa = new siswa();
    Scanner in = new Scanner(System.in);
    private ArrayList<String> nama = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telp = new ArrayList<String>();
    private ArrayList<Integer> pin = new ArrayList<Integer>();
    int ulang;
    int id,idsin;

    public petugas(){
        nama.add("mas");
        alamat.add("malang");
        telp.add("08972432");
        pin.add(123456);

        nama.add("mbak");
        alamat.add("malang");
        telp.add("081387323");
        pin.add(987654);
    }
    public void addpetugas(String nama,String alamat,String notelp){
        this.nama.add(nama);
        this.alamat.add(alamat);
        this.telp.add(notelp);
    }

    public void tampil(){
        System.out.println("");
        System.out.println("PETUGAS");
        System.out.println("=======");
        for(int i = 0;i<nama.size();i++){
            System.out.println("ID = "+(i+1));
            System.out.println("Nama \t:"+this.nama.get(i));
            System.out.println("Alamat \t:"+this.alamat.get(i));
            System.out.println("No telp :"+this.telp.get(i));
            System.out.println(" ");
        }
    }

    public void siswain(){
        boolean ulang;
        int petugas,pinin;
        System.out.print("pilih ID petugas anda : ");
        petugas = in.nextInt();
        switch(petugas){
            case 1 : petugas-=1;
                     System.out.println("Nama \t:"+this.nama.get(petugas));
                     System.out.println("Alamat \t:"+this.alamat.get(petugas));
                     System.out.println("No telp :"+this.telp.get(petugas));
                     break;
            
            case 2 : petugas-=1;
                     System.out.println("Nama \t:"+this.nama.get(petugas));
                     System.out.println("Alamat \t:"+this.alamat.get(petugas));
                     System.out.println("No telp :"+this.telp.get(petugas));
                     break;
        }
        do{
            System.out.println("");
            System.out.print("masukkan pin anda : ");
            pinin = in.nextInt();
            if(pinin == pin.get(petugas)){
                System.out.println(" ");
                System.out.println("pin anda benar");
                ulang = true;
                siswa.siswain();
            }
            else if(pinin == pin.get(petugas)){
                System.out.println(" ");
                System.out.println("pin anda benar");
                ulang = true;
                siswa.siswain();
            }
            else{
                System.out.println("");
                System.out.println("maaf pin anda salah");
                System.out.println("");
                ulang = false;
            }

        }while(ulang == false);
    }
    public void pinjam(){
        do{
            System.out.print("apakah anda mau melihat daftar buku? [1.ya] / [2.tidak] : ");
            int inp = in.nextInt();
            if(inp == 1){
                buku.tampil();
            }
            else{

            }
            System.out.println("======");
            System.out.println("PINJAM");
            System.out.println("======");
            
            System.out.print("masukkan id siswa yang pinjam : ");
            idsin = in.nextInt();
            idsin-=1;
            siswa.getsiswa(idsin);
            siswa.tampilid(idsin);

            if(siswa.getstatus(idsin) == false){
                System.out.println("MAAF SISWA SEDANG PINJAM BUKU");
            }
            else{
                System.out.print("masukkan id buku yang dipinjam : ");
                id = in.nextInt();
                id-=1;
                
                buku.getbuku(id);
                System.out.print("apakah anda mau melihat sisa stok buku ? [1.ya] / [2.tidak] : ");
                int bukuin = in.nextInt();
                if(bukuin == 1){
                    buku.sisabuku(id);
                }
                else{
                    siswa.setstatus(idsin);
                    siswa.tampilid(idsin);
                }
            }
            
            
            System.out.print("apakah ada siswa yang pinjam lagi [1.ya] / [2.tidak] : ");
            ulang = in.nextInt();
        }while(ulang == 1);


        

    }

}
