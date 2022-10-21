package sifat_pewarisan;

public class Koki extends Pegawai {
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Id_pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji + " Juta");
    }

    public void tugas() {
        System.out.println("Tugas: memasak makanan dan membuat minuman");
        System.out.println("---------------------------------------------");
    }
}
