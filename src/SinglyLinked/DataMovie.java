package SinglyLinked;

public class DataMovie {
    private String idFilm,judulFilm, sutradara;
    private int harga;

    public DataMovie(String idFilm, String judulFilm, String sutradara, int harga) {
        this.idFilm = idFilm;
        this.judulFilm = judulFilm;
        this.sutradara = sutradara;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "DataMovie{" +
                "idFilm='" + idFilm + '\'' +
                ", judulFilm='" + judulFilm + '\'' +
                ", sutradara='" + sutradara + '\'' +
                ", harga=" + harga +
                '}';
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void lihatMovie(){
        System.out.println("Id film " + getIdFilm());
        System.out.println("Judul film " + getJudulFilm());
        System.out.println("Sutradara" + getSutradara());
        System.out.println("Harga " + getHarga());
        System.out.println("----------------------\n" +
                "");
    }
}
