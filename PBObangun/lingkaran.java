package PBObangun;
import java.util.Scanner;
public class lingkaran {
        Scanner in = new Scanner(System.in);
        double phi = 3.14;
        double jari;
        
        public lingkaran(){
            this.jari = jari;
            this.phi = phi;
        }
        public void hasilluas(){
            double hasilluas;
            hasilluas = phi*jari*jari;
            System.out.println("luas lingkaran  : "+hasilluas);
        }
        public void hasilkeliling(){
            double hasilkel;
            hasilkel = (2*jari)*phi;
            System.out.println("keliling lingkaran : "+hasilkel);
        }
        public void inputlingk(){
            System.out.println("masukkan jari ");
            jari = in.nextDouble();
        }
    }

