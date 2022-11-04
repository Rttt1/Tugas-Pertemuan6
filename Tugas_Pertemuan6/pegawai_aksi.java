package Tugas_Pertemuan6;

public class pegawai_aksi {
    public static void main(String[] args) {
        //Membuat Objek
        manager manager = new manager();
        manager.Nama = "Rehan";
        manager.GajiPokok = 6000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        programmer programer = new programmer();
        programer.Nama = "Andre";
        programer.GajiPokok = 5000000;
        programer.cetakinfo();
        programer.cetakBonus();

    }
    
}
