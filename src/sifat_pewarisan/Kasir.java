package sifat_pewarisan;

public class Kasir extends Pegawai {
    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        // jika memiliki 2 tugas akan menampilkan total gaji yang sudah dipotong 10%
        System.out.println("Gaji: " + total_gaji + " Juta");
    }

    public void tugas() {
        System.out
                .println("Tugas: melakukan transaksi dengan pembeli dan Menjaga keamanan didalam dan diluar franchise");
        System.out.println("---------------------------------------------");
    }
}
