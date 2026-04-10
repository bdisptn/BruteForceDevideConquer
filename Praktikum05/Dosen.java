package Praktikum05;

public class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}
