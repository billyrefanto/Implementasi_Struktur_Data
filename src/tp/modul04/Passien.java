package tp.modul04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Passien {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int nomerAntrian, menu, jumlahPasien;
        String namaPasien,pasien,substr;
        do {
            System.out.println(
                    "========================== \n" +
                            "1.Masukan data pasien \n" +
                            "2.Next pasien \n" +
                            "3.Lihat pasien \n" +
                            "4.Keluar \n" +
                            "=========================="
            );
            System.out.println("Pilih menu ke-");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Masukan jumlah pasien");
                    jumlahPasien = scanner.nextInt();
                    for (int i = 0; i < jumlahPasien; i++) {
                        System.out.println("Nomer antrian : ");
                        nomerAntrian = scanner.nextInt();
                        System.out.println("Nama pasien : ");
                        namaPasien = scanner.next();
                        System.out.println();
                        antrian.add(nomerAntrian+ " " +jumlahPasien + namaPasien);
                    }
                    break;
                case 2:
                    if (antrian.isEmpty()){
                        System.out.println("Tidak ada antrian pasien!");
                    }else{
                        pasien = antrian.poll();
                        substr = pasien.substring(2);
                        System.out.println("Antrian pasien "+ substr + "Silahkan masuk!");
                    }
                    break;
                case 3 :
                    if (antrian.isEmpty()){
                        System.out.println("Tidak ada pasien!");
                    }else{

                        for (String queue:antrian) {
                            System.out.println("Antrian pasien ke- " +" "+ queue);
                        }
                    }
            }

        } while (menu != 4);
    }
}
