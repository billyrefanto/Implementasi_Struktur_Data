package SinglyLinked;

import java.util.LinkedList;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<DataMovie> dataMovies = new LinkedList<>();
        int  harga;
        int menu, jumlahFilm;
        String id, judul, sutradara;

        

        System.out.println(
                "============[Pilih Menu]============ \n" +
                "1. Masukan data film \n" +
                "2. Lihat film \n" +
                "3. Hapus film \n" +
                "4. Keluar \n" +
                "====================================");
        System.out.print("Menu ke - ");
        menu = scanner.nextInt();

        do {
            switch (menu) {
                case 1:
                    System.out.println("Masukan jumlah film");
                    jumlahFilm = scanner.nextInt();

                    for (int i = 0; i < jumlahFilm ; i++) {
                        System.out.println("Id : ");
                        id = scanner.next();
                        System.out.println("Judul film ");
                        judul = scanner.next();
                        System.out.println("Sutradara : ");
                        sutradara = scanner.next();
                        System.out.println("Harga : ");
                        harga = scanner.nextInt();

                        DataMovie dataMovie = new DataMovie(id,judul,sutradara,harga);
                        dataMovies.add(dataMovie);

                    }

                    break;
                case 2:
                    if (dataMovies.isEmpty())
                        System.out.println("Tidak ada data movies");

                    else
                        for (int i = 0; i < dataMovies.size(); i++) {
                            dataMovies.get(i).lihatMovie();

                        }


                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
            }


        } while (menu != 4);
    }
}
