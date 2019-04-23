
package tugaspengganti;
import java.util.Scanner;


public class Manusia {
    public Scanner apa = new Scanner(System.in);
    
    protected void name(){
        System.out.println("masukkan nama :");
        String nama = apa.next();
     }
    public void umur(){
        System.out.println("Umur :");
        String umur = apa.next();
    }
    protected void nik(){
        System.out.println("NIK :");
        String nik = apa.next();
    }
}
