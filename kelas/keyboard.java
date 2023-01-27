package kelas;

public class keyboard extends barang{

  public String backlight = "ada backlight";
  public int banyakeys = 0;
  public String tipeswitch = "tidak ada";



  public keyboard(String nama, int harga, int stok, String backlight, int banyakeys, String tipeswitch){
     this.nama = nama;
     this.harga = harga;
     this.stok = stok;
     this.backlight = backlight;
     this.banyakeys =banyakeys;
     this.tipeswitch = tipeswitch;

  }
  public void setbacklight(String backlight){
    this.backlight = backlight;
  }
  public void getbacklight(String backlight){
    this.backlight = backlight;
  }
  public void setbanyakeys(int banyakeys){
    this.banyakeys = banyakeys;
  }
  public void getbanyakeys(int banyakeys){
    this.banyakeys = banyakeys;
  }
  public void settipeswitch(String tipeswitch){
    this.tipeswitch = tipeswitch;
  }
  public void gettipeswitch(String tipeswitch){
    this.tipeswitch = tipeswitch;
  }

  @Override
  public void infobarang(){
    super.infobarang();
    System.out.println("backlight : "+this.backlight);
    System.out.println("banyak keys : "+this.banyakeys);
    System.out.println("tipeswitch : "+this.tipeswitch);
    }
    
 
    
}
