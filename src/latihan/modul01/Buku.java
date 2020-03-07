package latihan.modul01;

import java.util.LinkedList;
import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        LinkedList<DataBuku> dataBukus = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int jumlahBuku,tahunTerbit;
        String judulBuku, penulis, penerbit, namaBuku;

        do {
            System.out.println(
                    "==========[Pilih Menu]========= \n" +
                            "1. Insert data buku \n" +
                            "2. Lihat data \n" +
                            "3. Hapus buku \n" +
                            "4. Keluar \n" +
                            "==============================="
            );
            System.out.println("pilih menu ke - ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukan jumlah buku : ");
                    jumlahBuku = scanner.nextInt();
                    for (int i = 0; i < jumlahBuku; i++) {
                        System.out.println("Masukan nama");
                        namaBuku = scanner.next();
                        System.out.println("Judul : ");
                        judulBuku =scanner.next();
                        System.out.println("Penulis : ");
                        penulis = scanner.next();
                        System.out.println("Penerbit : ");
                        penerbit = scanner.next();
                        System.out.println("Tahun terbit : ");
                        tahunTerbit = scanner.nextInt();
                        dataBukus.add(new DataBuku(namaBuku,judulBuku,penulis,penerbit,tahunTerbit));

                    }




                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Keluar");
            }

        } while (menu != 4);
    }
}
