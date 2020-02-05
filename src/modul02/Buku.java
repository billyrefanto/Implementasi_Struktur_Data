package modul02;

import java.util.ArrayList;
import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <DataBuku> dataBuku = new ArrayList<>();

        int select;
        do  {
            System.out.println(
                    "=============== \n" +
                    "Daftar Menu \n" +
                    "1. Insert data\n" +
                    "2. Lihat data \n" +
                    "3. Keluar \n" +
                    "===============");
            System.out.print("Pilih menu : ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.println("Masukan nama pengarang , Judul , Penerbit , dan Tahun Terbit : ");
                    String namaPengarang = scanner.next();
                    String judul = scanner.next();
                    String penerbit = scanner.next();
                    String tahunTerbit = scanner.next();
                    dataBuku.add(new DataBuku(namaPengarang,judul,penerbit,tahunTerbit));
                    break;
                case 2:
                    if (dataBuku.size()==0){
                        System.out.println("Data tidak ditemukan!");
                    }else{
                        for (DataBuku buku : dataBuku) {
                            System.out.println(" \n" +
                                    "Data buku yang telah tersimpan :");
                            System.out.println(
                                    "Nama pengarang =  " + buku.getNamaPengarang() +
                                            " ,Judul = " + buku.getJudul() +
                                            " ,Penerbit = " + buku.getPenerbit() +
                                            " ,Tahun terbit =  " + buku.getTahunTerbit()
                            );
                        }
                    }
                    break;
                default:
                    System.out.println("Keluar");
                }
            }
        while (select!=3);
    }
}
