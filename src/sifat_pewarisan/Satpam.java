package sifat_pewarisan;

public class Satpam extends Pegawai {
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji + " Juta");
    }

    public void tugas() {
        System.out.println("Tugas: Menjaga keamanan didalam dan diluar franchise");
        System.out.println("---------------------------------------------");
    }
}
