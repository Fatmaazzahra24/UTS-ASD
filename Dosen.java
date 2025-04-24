public class Dosen {

    public String nidn;
    public String nama;
    public String email;
    public String prodi;
    public int tahunMasuk;

    public Dosen(String nidn, String nama, String email, String prodi, int tahunMasuk) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.prodi = prodi;
        this.tahunMasuk = tahunMasuk;
    }

 
    public int MasaKerja() {
        int tahunSekarang = 2025; 
        return tahunSekarang - tahunMasuk;
    }


    public void tampilkanData() {
        System.out.println("=========== Berikut Data Dosen  =========");
        System.out.println("NIDN         : " + nidn);
        System.out.println("Nama         : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Masa Kerja   : " + MasaKerja() + " tahun");
        System.out.println("------------------------------------------");
    }

    // Mengurutkan berdasarkan NIDN (ascending) dengan bubble sort
    public static void sortBerdasarNidn(Dosen[] listDosen) {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 0; j < listDosen.length - i - 1; j++) {
                if (listDosen[j].nidn.compareTo(listDosen[j + 1].nidn) > 0) {
                    Dosen temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }

    // Mencari data dosen berdasarkan Nama dengan sequential search
    public static  void cariNama (Dosen[] listDosen, String cari) {
        boolean ketemu = false;
        for (int i = 0; i < listDosen.length; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cari)) {
                listDosen[i].tampilkanData();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Dosen dengan nama " + cari + " tidak ditemukan.");
        }
    }
    

    // Mengurutkan berdasarkan Masa Kerja (descending) dengan selection sort
    public static void SortMasaKerja(Dosen[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].MasaKerja() < list[j].MasaKerja()) {
                    Dosen temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }    
}
