package tp.modul02;

public class DataBuku implements Comparable<DataBuku>{
    private String namaPengarang;
    private String judul;
    private String penerbit;
    private String tahunTerbit;

    DataBuku(String namaPengarang, String judul, String penerbit, String tahunTerbit) {
        this.namaPengarang = namaPengarang;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    String getJudul() {
        return judul;
    }

    String getNamaPengarang() {
        return namaPengarang;
    }

    String getPenerbit() {
        return penerbit;
    }

    String getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaPengarang='" + namaPengarang + '\'' +
                ", judul='" + judul + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", tahunTerbit='" + tahunTerbit + '\'' +
                '}';
    }
    @Override
    public int compareTo(DataBuku o) {
        return this.getJudul().compareTo(o.getJudul());
    }
}
