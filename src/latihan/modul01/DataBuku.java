package latihan.modul01;


public class DataBuku implements Comparable <DataBuku> {
    private String namaBuku,judulBuku,penulis,penerbit;
    private int tahunTerbit;

    public DataBuku(String namaBuku, String judulBuku, String penulis, String penerbit, int tahunTerbit) {
        this.namaBuku = namaBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "DataBuku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", judulBuku='" + judulBuku + '\'' +
                ", penulis='" + penulis + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tahunTerbit=" + tahunTerbit +
                '}';
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public int compareTo(DataBuku o) {
        return 0;
    }
}