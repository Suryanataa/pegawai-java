package sifat_pewarisan;

public class Pelayan extends Pegawai {
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas() {
        System.out.println("Tugas: melayani dan menyajikan pesanan pembeli");
        System.out.println("---------------------------------------------");
    }
}
