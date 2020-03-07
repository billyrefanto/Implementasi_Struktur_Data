package latihan.modul05;

public class DataBuku {
    private String idBuku, judulBuku, pengarang;
    private int tahunTerbit;

    DataBuku(String idBuku, String judulBuku, String pengarang, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    DataBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    String getJudulBuku() {
        return judulBuku;
    }

    @Override
    public String toString() {
        return "DataBuku{" +
                "idBuku='" + idBuku + '\'' +
                ", judulBuku='" + judulBuku + '\'' +
                ", pengarang='" + pengarang + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }

}
