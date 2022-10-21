package sifat_pewarisan;

public class App {
    public static void main(String[] args) {
        // mendeklarasikan objek
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        // memberi value pada objek

        // manager
        manager.nama = "Surya";
        manager.id_pegawai = 1;
        manager.gaji = 7;
        manager.tugas = 1;

        // kasir & satpam
        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = 1.0;
        // mendeklarasi tugas pegawai
        kasir.tugas = 2;
        // program if untuk menentukan gaji bersih
        if (kasir.tugas == 2) {
            kasir.gaji_bersih = kasir.gaji + kasir.gaji;
            kasir.total_gaji = kasir.gaji_bersih - (0.1 * kasir.gaji_bersih);
        }

        // koki
        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = 2;
        kasir.tugas = 1;

        // pelayan & kasir
        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = 1.0;
        // mendeklarasi tugas pegawai
        pelayan.tugas = 2;
        // program if untuk menentukan gaji bersih
        if (pelayan.tugas == 2) {
            pelayan.gaji_bersih = pelayan.gaji + pelayan.gaji;
            pelayan.total_gaji = pelayan.gaji_bersih - (0.1 * pelayan.gaji_bersih);
        }

        // menampilkan pegawai dan tugas
        pegawai.tampil();

        manager.tampil();
        manager.tugas();

        kasir.tampil();
        kasir.tugas();

        koki.tampil();
        koki.tugas();

        pelayan.tampil();
        pelayan.tugas();
    }
}
