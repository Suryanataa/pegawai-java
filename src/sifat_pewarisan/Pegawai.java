package sifat_pewarisan;

public class Pegawai {
    String nama;
    int id_pegawai;
    // mengubah atribut gaji menjadi double
    double gaji;
    // menambah atribut tugas,gaji_bersih,total_gaji
    int tugas;
    double gaji_bersih;
    double total_gaji;

    public void tampil() {
        System.out.println("menampilkan nama, id_pegawai, gaji, dan tugas.");
        System.out.println("------------------------------------------------------");

    }
}