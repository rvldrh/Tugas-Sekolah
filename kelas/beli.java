package kelas;
import java.util.Scanner;
import filevscode.oopsws;
import kelas.*;
public class beli extends barang{
    Scanner in = new Scanner(System.in);

    keyboard keyboard1 = new keyboard("logitech series x", 1000000, 78, "srgb", 87, "outemu blue");
    keyboard keyboard2 = new keyboard("keychrom K2", 1200000, 98, "srgb", 78, "gateon brown");

    prosesor prosesor1 = new prosesor("AMD Ryzen 7 5500", 3000000, 7, 3.6, 4.2);
    prosesor prosesor2 = new prosesor("Intel core I7 12450", 2400000, 8, 2.9, 4.3);

    int uang,membeli,pilih2,pilih;
    public beli(){

    }
    public void beli(){
        System.out.println("Masukkan nominal uang yang anda punya ");
        uang = in.nextInt();
        System.out.println("Pilih barang yang mau di beli \n1.Keyboard \n2.proseccor");
        pilih = in.nextInt();
        if(pilih==1){
            System.out.println("pilih tipe kyboard \n1.logitech series x \n2.keychrom K2");
            pilih2 = in.nextInt();
            if(pilih2==1){
                System.out.println("Barang yang anda pilih");
                keyboard1.infobarang();
                System.out.println("uang anda sebelumnya : "+uang);
                uang-=keyboard1.harga;
                    
                    if(uang<0){
                        System.out.println("uang anda kurang "+uang);
                    }
                    else{
                        System.out.println("sisa uang anda : "+uang);
                    }
                keyboard1.stok-=1;
            }
            else if (pilih2==2){
                System.out.println("Barang yang anda pilih");
                keyboard2.infobarang();
                System.out.println("uang anda sebelumnya : "+uang);
                uang-=keyboard2.harga;
                
                if(uang<0){
                    System.out.println("uang anda kurang "+uang);
                }
                else{
                    System.out.println("sisa uang anda : "+uang);
                }
                keyboard2.stok-=1;
                
            }
            else{
                System.out.println("pilihan anda tidak tersedia");
            }
            }
            else if(pilih==2){
                System.out.println("pilih tipe proseccor yang anda mau \n1.AMD Ryzen 7 5500 \n2.Intel core I7 12450");
                pilih2 = in.nextInt();
                if(pilih2==1){
                    System.out.println("Barang yang anda pilih");
                    prosesor1.infobarang();
                    System.out.println("uang anda sebelumnya : "+uang);
                    uang-=prosesor1.harga;
                        
                        if(uang<0){
                            System.out.println("uang anda kurang "+uang);
                        }
                        else{
                            System.out.println("sisa uang anda : "+uang);
                        }
                        prosesor1.stok-=1;
                    }
                    else if (pilih2==2){
                        System.out.println("Barang yang anda pilih");
                        prosesor2.infobarang();
                        System.out.println("uang anda sebelumnya : "+uang);
                        uang-=prosesor2.harga;
                        
                        if(uang<0){
                            System.out.println("uang anda kurang "+uang);
                        }
                        else{
                            System.out.println("sisa uang anda : "+uang);
                        }
                        prosesor2.stok-=1;
                    }
            else{
                System.out.println("pilihan anda tidak tersedia");
            }
            
        }
        else{
            System.out.println("pilihan anda tidak tersedia");
        }
    }
}
