package Tugas_Pertemuan6;

public class programmer extends pegawai {
    double Bonus;

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    public double getBonus() {
        return this.Bonus;
    }
    
    public void cetakinfo() {
        super.cetakinfo();

    }
    public void cetakBonus() {
        Bonus = 2000000.00;
        System.out.println("Bonus : Rp." + this.Bonus);
    }
}