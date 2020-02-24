package latihan.modul05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Buku {
    public static void main(String[] args) {
        List<DataBuku> dataBuku = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int tahunTerbit, jumlahBuku, hasil, menu;
        String idBuku, judulBuku, pengarang;
        Comparator<DataBuku> comparator = Comparator.comparing(DataBuku::getJudulBuku);
        do {
            System.out.println(
                    "==========[Pilih Menu]========= \n" +
                            "1. Insert Buku \n" +
                            "2. Search Buku \n" +
                            "3. Lihat Buku \n" +
                            "4. Exit \n" +
                    "==============================="
            );
            System.out.print("Menu ke - ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Jumlah buku : ");
                    jumlahBuku = sc.nextInt();
                    for (int i = 0; i < jumlahBuku; i++) {
                        System.out.println("Id buku : ");
                        idBuku = sc.next();
                        System.out.println("Judul Buku : ");
                        judulBuku = sc.next();
                        System.out.println("Pengarang : ");
                        pengarang = sc.next();
                        System.out.println("Tahun terbit : ");
                        tahunTerbit = sc.nextInt();
                        dataBuku.add(new DataBuku(idBuku, judulBuku, pengarang, tahunTerbit));
                    }
                    break;
                case 2:
                    System.out.println("Judul Buku : ");
                    judulBuku = sc.next();

                    hasil = Collections.binarySearch(dataBuku, new DataBuku(judulBuku), comparator);
                    if (dataBuku.isEmpty())
                        System.out.println("Buku " + judulBuku + " Data tidak ditemukan!");
                    else
                        System.out.println("Buku " + judulBuku +
                                " ditemukan pada urutan ke-" + (hasil + 1));
                    break;
                case 3:
                    if (dataBuku.isEmpty())
                        System.out.println("Tidak ada buku!");
                    else
                        for (DataBuku data : dataBuku)
                            System.out.println(data);
                    break;
                default:
                    System.out.println("Exit!");
            }
        } while (menu != 4);
    }
}
