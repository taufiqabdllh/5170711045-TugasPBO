
package tugaspengganti;

import java.util.Scanner;

public class TugasPengganti {

    public static void main(String[] args) {
Anak bocah = new Anak();
Dewasa baligh = new Dewasa();

Scanner apa = new Scanner(System.in);
        System.out.println("Silahkan pilih jenis Manusia :");
        System.out.println("1. Anak");
        System.out.println("2. Dewasa");
        int manusia = apa.nextInt();
        switch(manusia){
            case 1 : System.out.println("Anak cowo / cewe?");
                     String jenis = apa.next();
                     switch(jenis){
                         case "cowo" : bocah.anakcowo();
                                       break;
                         case "cewe" : bocah.anakcewe();
                                       break;
                         default : System.out.println("Masukan salah");
                     }
                     break;
            case 2 : System.out.println("dcowo / dcewe?");
                     String pil = apa.next();
                     switch(pil){
                         case "dcowo" : baligh.cowodewasa();
                                        break;
                         case "dcewe" : baligh.cewedewasa();
                                        break;
                         default : System.out.println("Masukan salah");
                     }
                     break;
            default : System.out.println("Masukan salah");         
        }
        
       
    }
    
}
