package filevscode;

import kelas.*;
import java.*;
import java.util.Scanner;


public class oopsws {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        keyboard keyboard1 = new keyboard("logitech series x", 1000000, 78, "srgb", 87, "outemu blue");
        keyboard keyboard2 = new keyboard("keychrom K2", 1200000, 98, "srgb", 78, "gateon brown");

        prosesor prosesor1 = new prosesor("AMD Ryzen 7 5500", 3000000, 7, 3.6, 4.2);
        prosesor prosesor2 = new prosesor("Intel core I7 12450", 2400000, 8, 2.9, 4.3);


        barang barang1 = new barang("sampo", 7000, 100);
        barang barang2 = new barang("pasta gigi", 11000, 77);
        
        penjual penjual1 = new penjual("udin petot", 20, "kowe lanang lho mas", 2);
        
        pembeli pembeli1 = new pembeli("valdo", 17, "kowe lanang lho mas", "089639038020", "la suvipto gg 22 perumahan graha cipta residence blok a8");

        beli beli = new beli();

        beli.beli();
        keyboard1.infobarang();

        
    }
}
