package penilaian;

public class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        super(nama, npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    // Getter dan Setter untuk variabel uts, uas, dan tugas
    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public int getTugas() {
        return tugas;
    }

    public void setTugas(int tugas) {
        this.tugas = tugas;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * uts + 0.3 * uas + 0.4 * tugas;
        return nilaiAkhir;
    }
        
}
