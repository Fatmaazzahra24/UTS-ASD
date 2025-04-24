import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        Dosen[] listDosen = {
            new Dosen("D005", "Fatma", "Fatma@polinema.ac.id", "Teknik Informatika", 2010),
            new Dosen("D002", "Sahrul", "Sahrul@polinema.ac.id", "Sistem Informasi Bisnis", 2005),
            new Dosen("D003", "Tiara", "Tica@polinema.ac.id", "Teknik Telekomunikasi", 2016),
            new Dosen("D004", "Dedi", "dedi@polinema.ac.id", "Teknik Elektronika", 2013),
            new Dosen("D001", "Eka", "eka@polinema.ac.id", "Manajemen Informatika", 2020)
        };

        boolean running = true;
        while (running) {
            System.out.println("\n============= MENU SISTEM PENGELOLAAN DOSEN  ===============");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Mengurutkan dosen berdasarkan NIDN (ascending)");
            System.out.println("3. Mencari data dosen berdasarkan Nama");
            System.out.println("4. Mengurutkan dosen berdasarkan Masa Kerja (descending)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = input05.nextInt();
            input05.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Daftar Data Dosen:");
                    for (Dosen dosen : listDosen) {
                        dosen.tampilkanData();
                    }
                    break;
                case 2:
                    Dosen.sortBerdasarNidn(listDosen);
                    System.out.println("Data dosen setelah diurutkan berdasarkan NIDN (ascending):");
                    for (Dosen dosen : listDosen) {
                        dosen.tampilkanData();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = input05.nextLine();
                    Dosen.cariNama(listDosen, cariNama);
                    break;
                case 4:
                    Dosen.SortMasaKerja(listDosen);
                    System.out.println("Data dosen setelah diurutkan berdasarkan masa kerja (descending):");
                    for (Dosen dosen : listDosen) {
                        dosen.tampilkanData();
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem akademik.");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
