
package tugaspengganti;

public class Anak extends Manusia{
 public void anakcowo(){
     Manusia anak = new Manusia();
     System.out.println("Anak cowo :");
     anak.name();
     anak.nik();
     anak.umur();
     System.out.println("Kulit sawo matang");
     System.out.println("Rambut Lurus");
     System.out.println("Tinggi Kurus");
 }
    public void anakcewe(){
        Manusia anak = new Manusia();
        System.out.println("Anak cewe :");
        anak.name();
        anak.nik();
        anak.umur();
        System.out.println("Kulit putih");
        System.out.println("Rambut Lurus panjang");
        System.out.println("Tinggi Berisi");
    }
}
