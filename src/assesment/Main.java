package assesment;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner aku = new Scanner(System.in);

        LinkedList<Mahasiswa> list = new LinkedList<>();
        list.add(new Mahasiswa("Idar", "123", 2));
        list.add(new Mahasiswa("Dira", "12343", 12));
        list.add(new Mahasiswa("Arid", "12363", 42));
        list.add(new Mahasiswa("Rida", "1232", 32));
        list.add(new Mahasiswa("Dari", "12333", 22));
        int menu = 0;

        String nama, NIM;
        int umur;

        do {


            System.out.println("---Masukan Menu---");
            System.out.println("1. Masukan Data");
            System.out.println("2. Masukan Data dari Awal");
            System.out.println("3. Masukan Data dari Tengah berdasrkan Index");
            System.out.println("4. Masukan Data dari Tengah Berdasarkan NIM");
            System.out.println("5. Tampilkan Data paling awal");
            System.out.println("6. Tampilkan Data paling akhir");
            System.out.println("7. Tampilkan Data Semua dari Akhir");
            System.out.println("8. Tampilkan Data Semua dari awal");
            System.out.println("9. Hapus Depan");
            System.out.println("10. Hapus Belakang");
            System.out.println("11. Hapus Semua");
            System.out.println("12. Hapus Berdasarkan Index");
            System.out.println("13. Hapus Berdasarkan NIM");
            System.out.println("14. Urutkan Data Berdasarkan Nama");
            System.out.println("15. Urutkan Data Berdasarkan Umur");
            System.out.println("16. Cari Data Berdasarkan Nama");
            System.out.println("17. Cari Data Berdasarkan umur");


            System.out.println("18. Keluar");
            System.out.println("Masukan Menu : ");
            menu = aku.nextInt();

            if (menu == 1) {
                //masuukan data biasa


            } else if (menu == 2) {
                //Masukan Data dari Awal
                System.out.println("Masukan nama : ");
                nama = aku.next();
                System.out.println("Masukan NIM : ");
                NIM = aku.next();
                System.out.println("Masukan umur : ");
                umur = aku.nextInt();
                Mahasiswa mahasiswa = new Mahasiswa(nama, NIM, umur);
                list.addFirst(mahasiswa);

            } else if (menu == 3) {
                // Masukan Data dari Tengah berdasrkan Index
                System.out.println("Masukan index ");
                int index = aku.nextInt();
                System.out.println("Masukan nama : ");
                nama = aku.next();
                System.out.println("Masukan NIM : ");
                NIM = aku.next();
                System.out.println("Masukan umur : ");
                umur = aku.nextInt();
                Mahasiswa mahasiswa = new Mahasiswa(nama, NIM, umur);
                list.add(index, mahasiswa);
            } else if (menu == 4) {
                //masukan data dengan nim
                //cari nim terlebih dahulu ke index berapa
                System.out.println("Masukan nim yang ingin di cari : ");
                String cariNim = aku.next();
                int index = 0;
                //fungsi cari
                for (int i = 0; i < list.size(); i++) {
                    if (cariNim.equals(list.get(i).getNim())) {
                        index = i;
                        System.out.println("data cocok");
                        break;
                    } else {
                        System.out.println("Data tidak cocok");
                    }
                }
                System.out.println("Masukan nama : ");
                nama = aku.next();
                System.out.println("Masukan NIM : ");
                NIM = aku.next();
                System.out.println("Masukan umur : ");
                umur = aku.nextInt();
                Mahasiswa mahasiswa = new Mahasiswa(nama, NIM, umur);
                list.add(index, mahasiswa);

            } else if (menu == 5) {
                //Tampilkan Data paling awal

            } else if (menu == 6) {
                //Tampilkan Data paling akhir


            } else if (menu == 7) {
                //Tampilkan Data Semua dari Akhir

            } else if (menu == 8) {
                //Tampilkan Data Semua dari awal
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).tampil();
                }

            } else if (menu == 9) {
                //Hapus Depan

            } else if (menu == 10) {
                //Hapus Belakang


            } else if (menu == 11) {
                //Hapus Semua
                list.clear();

            } else if (menu == 12) {
                //Hapus Berdasarkan Index

            } else if (menu == 13) {
                //Hapus Berdasarkan NIM
                //cari nim terlebih dahulu ke index berapa
                System.out.println("Masukan nim yang ingin di cari : ");
                String cariNim = aku.next();
                int index = 0;
                //fungsi cari
                for (int i = 0; i < list.size(); i++) {
                    if (cariNim.equals(list.get(i).getNim())) {
                        list.remove(i).tampil();
                        System.out.println("data cocok");
                        break;
                    } else {
                        System.out.println("Data tidak cocok");
                    }

                }


            } else if (menu == 14) {
                //Urutkan Data Berdasarkan Nama
                list.sort(Comparator.comparing(Mahasiswa::getNama));

            } else if (menu == 15) {
                //Urutkan Data Berdasarkan Umur dari yang tua
                list.sort(Comparator.comparing(Mahasiswa::getUmur).reversed());

            } else if (menu == 16) {
                //Cari Data Berdasarkan Nama


            } else if (menu == 17) {
                //Cari Data Berdasarkan umur

            } else if (menu == 18) {
                //Keluar

            } else {
                System.out.println("Masukin menu dengan benar woyy!!!\n");
            }
        } while (menu != 18);

        System.out.println("Terima Kasih :)");
    }

//sortring cara lain
//
//    List<CustomObject> list = new ArrayList<CustomObject>();
//    Comparator<CustomObject> comparator = new Comparator<CustomObject>() {
//        @Override
//        public int compare(CustomObject left, CustomObject right) {
//            return left.getId() - right.getId(); // use your logic
//        }
//    };
//
//Collections.sort(list, comparator);

}
