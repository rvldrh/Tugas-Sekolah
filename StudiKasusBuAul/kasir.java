package StudiKasusBuAul;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;
public class kasir extends user{
    pembeli pembeli = new pembeli();
    barang barang = new barang();
    Scanner in = new Scanner(System.in);
    
    public ArrayList<Integer> pin = new ArrayList<>();

    
    public kasir(){
        
        super.nama.add("Mas");
        super.alamat.add("Malang");
        super.jk.add("L");
        this.pin.add(123456);
        
        super.nama.add("Mbak");
        super.alamat.add("Malang");
        super.jk.add("P");
        this.pin.add(987654);

    }
    public void kasirin(){
        int barangg, idb, jumlah, lagi;
        tampil();
        System.out.println("");
        System.out.print("pilih ID anda : ");
        int idin = in.nextInt();
        idin -=1;
        boolean status;
        do{
            System.out.print("Masukkan pin anda : ");
            int pinin = in.nextInt();
    
            if(idin == 0 && pinin == this.pin.get(idin)){
                System.out.println("pin anda benar");
                status = true;
            }
            else if (idin == 1 && pinin == this.pin.get(idin)){
                System.out.println("pin anda benar");
                status = true;
            }
            else{
                System.out.println("maaf pin anda salah");
                status = false;
            }
        }while(status == false);
        
        
        if(status == true){
            pembeli.in();
            System.out.print("Apakah anda mau melihat data pembeli [1.ya] / [2.tidak] ");
            int datain = in.nextInt();
            if(datain == 1){
                pembeli.tampil();
            }
            else{

            }
            System.out.print("Apakah anda mau melihat data barang? [1.ya] / [2.tidak] ");
            int barangd = in.nextInt();
            if(barangd == 1){
                barang.tampil();
            }
            else{

            }
            
            do{
                System.out.print("Masukkan ID pembeli : ");
                idb = in.nextInt();
                idb -=1;
                pembeli.getpembeli(idb);
    
                System.out.print("Masukkan ID barang yang dibeli : ");
                barangg = in.nextInt();
                barangg -=1;
                barang.getbarang(idb);
            
                System.out.print("Masukkan jumlah barang yang dibeli : ");
                jumlah = in.nextInt();
                
                int barangTotal = barang.getharga(barangg);
                barangTotal *= jumlah;
    
                barang.sisastokb(barangg, jumlah);

                pembeli.sisasaldo(barangTotal, idb);

                System.out.println("Apakah ada yang mau beli lagi? [1.ya] / [2.tidak]");
                lagi = in.nextInt();
            }while(lagi == 1);



        }


    }
    public void tampil(){
        System.out.println("");
        System.out.println("=====KASIR=====");
        System.out.println("===============");
        for(int i = 0;i<nama.size();i++){
            System.out.println("ID \t:"+(i+1));
            System.out.println("Nama \t:"+this.nama.get(i));
            System.out.println("Alamat \t:"+this.alamat.get(i));
            System.out.println("Jenis Kelamin :"+this.jk.get(i));
            System.out.println("");
        }
    }




    
}
