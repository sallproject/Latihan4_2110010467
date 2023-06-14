package penilaian;

public class Main {
    public static void main(String[] args) {
        String nama = "Muhammad Faisal";
        String npm = "2110010467";
        int uts = 85;
        int uas = 80;
        int tugas = 90;

        NilaiAkhir nilai = new NilaiAkhir(nama, npm, uts, uas, tugas);

        double nilaiAkhir = nilai.hitungNilaiAkhir();

        System.out.println("Nama: " + nilai.getNama());
        System.out.println("NPM: " + nilai.getNpm());
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
