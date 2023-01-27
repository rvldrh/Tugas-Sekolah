package kelas;

public class pembeli {
    public String nama;
    public int umur;
    public String gender;
    public String notelp;
    public String alamat;

    public pembeli(String nama, int umur, String gender, String notelp, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.notelp = notelp;
        this.alamat = alamat;

    }
    public String getnama(){
        return this.nama;
    }
    public String getgender(){
        return this.gender;
        
    }
    public String getnotelp(){
        return this.notelp;
        
    }
    public String getalamat(){
        return this.alamat;
        
    }
    public int getumur(){
        return this.umur;
        
    }

    public void infopembeli(){
        System.out.println("nama pembeli : "+this.nama);
        System.out.println("umur : "+this.umur);
        System.out.println("gender : "+this.gender);
        System.out.println("no hp : "+this.notelp);
        System.out.println("alamat : "+this.alamat);
    }
}
