package penilaian;

public class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;    

    public NilaiAkhir(int uts, int uas, int tugas, String nama, String npm) {
        super(nama, npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = (0.4 * uts) + (0.5 * uas) + (0.1 * tugas);
        return nilaiAkhir;
    }
}