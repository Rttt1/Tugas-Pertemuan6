package Tugas_Pertemuan6;

public class manager extends pegawai {
    double Tunjangan;

    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }
    public double getTunjangan() {
        return this.Tunjangan;
    }

    public void cetakinfo() {
        super.cetakinfo();
    }

    public void cetakTunjangan() {
         Tunjangan = 4000000;
         System.out.println("Tunjangan : Rp." + this.Tunjangan);
    }

}

