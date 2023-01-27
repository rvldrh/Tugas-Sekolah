package kelas;


public class prosesor extends barang{
    
    public double frekuensi = 0;
    public double turboost = 0;
    
    
    public prosesor(String nama, int harga, int stok , double frekuensi, double turboost){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.frekuensi = frekuensi;
        this.turboost = turboost;
    }

    public void setfrekuensi(double frekuensi){
        this.frekuensi = frekuensi;
    }
    public void getfrekuensi(double frekuensi){
        this.frekuensi = frekuensi;
    }
    public void setturboost(double turboost){
        this.turboost = turboost;
    }
    public void getturboost(double turboost){
        this.turboost = turboost;
    }

    @Override
    public void infobarang(){
       super.infobarang();
       System.out.println("frekuensi : "+this.frekuensi);
       System.out.println("turbo boost : "+this.turboost);

    }
}
