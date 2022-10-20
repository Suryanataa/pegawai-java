package sifat_pewarisan;

public class Kasir extends Pegawai {
    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas() {
        System.out.println("Tugas: melakukan transaksi dengan pembeli");
        System.out.println("---------------------------------------------");
    }
}
