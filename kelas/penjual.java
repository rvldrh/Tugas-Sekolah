package kelas;

public class penjual {
    public String nama;
    public int umur;
    public String gender;
    public int lamakerja;

    public penjual(String nama, int umur, String gender, int lamakerja){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.lamakerja=lamakerja;
    }
    public String getnama(){
        return this.nama;
    }
    public String getgender(){
        return this.gender;
        
    }
    public int getumur(){
        return this.umur;
        
    }
    public int getlamakerja(){
        return this.lamakerja;

    }

    public void infopenjual(){
        System.out.println("nama penjual : "+this.nama);
        System.out.println("umur : "+this.umur);
        System.out.println("gender : "+this.gender);
        System.out.println("lama kerja : "+this.lamakerja);
    }
}
