package PBObangun;
import java.util.Scanner;
public class persegi {
    Scanner in = new Scanner(System.in);
    int sisi;

    public persegi(){
        this.sisi = sisi;
    }
    public void luasper(){

        System.out.println("laus per : "+(sisi*sisi));
    }
    public void kelpersegi(){
        System.out.println("keliling per : "+(sisi*4));
    }
    public void input(){
        System.out.println("masukkan sisi");
        sisi = in.nextInt();
    }
}
