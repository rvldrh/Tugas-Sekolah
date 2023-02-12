package laundry;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        laundry laundry = new laundry();
        laundry.addlaundry("kiloan",9000);
        laundry.addlaundry("Dry Cleaning", 12000);
        laundry.addlaundry("Self service", 5000);
        laundry.addlaundry("On demand", 15000);
        kasir kasir = new kasir();
        kasir.addkasir("Mas", 'L');
        kasir.addkasir("Mbak", 'P');
        customer customer = new customer();
        customer.in();
        
        
        
        
        int tanya;
        System.out.println("apakah anda mau melihat jenis dan menu laundry? [1.ya] / [2.tidak]");
        tanya = in.nextInt();
        if(tanya==1){
            laundry.tampil();
        }
        else{
            System.out.println("oke termiakasih");
        }

        int tanya1;
        System.out.println("apakah anda mau melihat data kasir? [1.ya] / [2.tidak]");
        tanya1 = in.nextInt();
        if(tanya1==1){
            kasir.tampil();
        }
        else{
            System.out.println("oke termiakasih");
        }

        int idc,pilih,harga,uang,kilo,ulang;
        System.out.println("TRANSAKSI");
        System.out.println("=========");
        customer.tampil();
        do{
            System.out.println("pilih layanan laundry : [1.kiloan = 9000] / [2.Dry Cleaning = 12000] / [3.Self service = 5000] / [4.On demand = 15000]");
        pilih = in.nextInt();
        System.out.println("berapa kilo : ");
        kilo = in.nextInt();
        switch(pilih){
            case 1 : harga = laundry.getharga(0);
                     uang = customer.getsaldo(0);
                     harga *= kilo;
                     uang -= harga;
                     System.out.println("sisa uang anda : "+uang);
            case 2 : harga = laundry.getharga(1);
                     uang = customer.getsaldo(1);
                     harga *= kilo;
                     uang -= harga;
                     System.out.println("sisa uang anda : "+uang);
            case 3 : harga = laundry.getharga(2);
                     uang = customer.getsaldo(2);
                     harga *= kilo;
                     uang -= harga;
                     System.out.println("sisa uang anda : "+uang);
            case 4 : harga = laundry.getharga(3);
                     uang = customer.getsaldo(3);
                     harga *= kilo;
                     uang -= harga;
                     System.out.println("sisa uang anda : "+uang);
                     
        }
        System.out.println("apakah anda mau transaksi lagi? [1.ya] / [2.tidak]");
        ulang = in.nextInt();
        }
        while(ulang==1);
        System.out.println("terimakasih");
        
        
        
        
    }
}
