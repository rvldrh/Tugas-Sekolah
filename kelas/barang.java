package kelas;

import filevscode.oopsws;

public class barang {
    //properti 
    public String nama;
    public int harga;
    public int stok;
    
    public barang(String nama, int harga, int stok ){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    public barang(){
        super(); 
    }
    
    //method
    public void tambahstok(int jmltambah){
        stok+=jmltambah;
        System.out.println("stok barang berhasil ditambakan jadi "+stok+"\n");

    }
    public void kurangistok(int jmlkurang){
        stok-=jmlkurang;
        System.out.println("stok barang berhasil dikurangi jadi "+stok+"\n");
    }
    public boolean cekstok(){
        if(stok >0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean cekstok( boolean status ){
        if(status == true){
            if(stok >0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(stok >0){
                return false;
            }
            else{
                return true;
            }
        }
    }

    public void infobarang(){
        System.out.println("nama barang :"+this.nama);
        System.out.println("harganya : "+this.harga);
        System.out.println("stok nya : "+this.stok);
    }
    public String getnama(){
        return this.nama;
    }
    public int getharga(){
        return this.harga;
    }
    public int getstok(){
        return this.stok;
    }

    //over reading

    
    
}
