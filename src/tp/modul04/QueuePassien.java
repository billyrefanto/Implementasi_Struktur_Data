package tp.modul04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePassien {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int nomerAntrian, menu;
        String namaPasien;
        do {
            System.out.println(
                    "====================== \n" +
                            "1.Insert data pasien \n" +
                            "2.Next pasien \n" +
                            "3.Lihat antrian \n" +
                            "4.Keluar \n" +
                            "======================");
            System.out.print("Pilih menu ke-");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukan jumlah pasien : ");
                    int jumlahPasien = scanner.nextInt();
                    for (int i = 0; i < jumlahPasien; i++) {
                        System.out.println("Nomer antrian : ");
                        nomerAntrian = scanner.nextInt();
                        System.out.println("Nama pasien : ");
                        namaPasien = scanner.next();
                        System.out.println();
                        antrian.add(nomerAntrian + " " + namaPasien);
                    }
                    break;
                case 2:
                    if (antrian.isEmpty()) {
                        System.out.println("Pasien habis!");
                    } else {

                        String pasien = antrian.poll();
                        String substr = pasien.substring(2);
                        System.out.println("Antrian sekarang adalah " + substr + " silahkan masuk!");

                    }
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada antrian!");
                    } else {
                        for (String queue : antrian) {
                            System.out.println("Antrian pasien ke- " + queue);
                        }
                    }
                    break;
                default:
                    System.out.println("keluar");
            }
        } while (menu != 4);
    }
}
