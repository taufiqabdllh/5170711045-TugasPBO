
package tugaspengganti;

public class Dewasa extends Manusia{ 
    public void cowodewasa(){
        Manusia dewasa = new Manusia();
     System.out.println("Cowo Dewasa:");
     dewasa.name();
     dewasa.nik();
     dewasa.umur();
     System.out.println("Kulit sawo matang");
     System.out.println("Rambut Lurus");
     System.out.println("Tinggi Kurus");
     System.out.println("Memiliki jakun");
        System.out.println("Memiliki kumis");
    }
     public void cewedewasa(){
        Manusia dewasa = new Manusia();
        System.out.println("cewe dewasa :");
        dewasa.name();
        dewasa.nik();
        dewasa.umur();
        System.out.println("Kulit putih");
        System.out.println("Rambut Lurus panjang");
        System.out.println("Tinggi Berisi");
         System.out.println("Memiliki payudara");
         System.out.println("Sudah mensturasi");
    }
}
