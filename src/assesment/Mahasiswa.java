package assesment;



public class Mahasiswa implements Comparable<Mahasiswa> {
    String nama, nim;
    int umur;

    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void tampil() {
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNim());
        System.out.println("Umur : " + getUmur());
        System.out.println("-----------------------------------");
        System.out.println();

    }

    @Override
    public int compareTo(Mahasiswa mahasiswa) {
        return this.nama.compareTo(mahasiswa.getNama());
    }
}

