package sifat_pewarisan;

public class Manager extends Pegawai {
    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji + " Juta");
    }

    public void tugas() {
        System.out.println("Tugas: melakukan manajemen untuk franchice");
        System.out.println("---------------------------------------------");
    }
}
