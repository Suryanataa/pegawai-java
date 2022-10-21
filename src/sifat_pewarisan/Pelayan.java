package sifat_pewarisan;

public class Pelayan extends Pegawai {
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + total_gaji + " Juta");
    }

    public void tugas() {
        System.out.println("Tugas: melayani dan menyajikan pesanan pembeli dan melakukan transaksi dengan pembeli");
        System.out.println("---------------------------------------------");
    }
}
