package sifat_pewarisan;

public class App {
    public static void main(String[] args) {
        // mendeklarasikan objek
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // memberi value pada objek

        // manager
        manager.nama = "Surya";
        manager.id_pegawai = 1;
        manager.gaji = "7 juta";

        // kasir
        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1,7 juta";

        // koki
        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = "2 juta";

        // pelayan
        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 juta";

        // satpam
        satpam.nama = "Reza";
        satpam.id_pegawai = 5;
        satpam.gaji = "1 juta";

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

        satpam.tampil();
        satpam.tugas();
    }
}
