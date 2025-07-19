package kesehatan;

import java.util.ArrayList;

public class Poliklinik {
    ArrayList<Input_User> Poliklinik = new ArrayList<>();
    
    String kodePoli;
    String namaPoliklinik;

    
    // Constructor
    public Poliklinik(String kodePoli, String namaPoliklinik) {
        this.kodePoli = kodePoli;
        this.namaPoliklinik = namaPoliklinik;
    }

    // Getter
    public String getKodePoli() {
        return kodePoli;
    }

    public String getNamaPoliklinik() {
        return namaPoliklinik;
    }

    // Setter
    public void setKodePoli(String kodePoli) {
        this.kodePoli = kodePoli;
    }

    public void setNamaPoliklinik(String namaPoliklinik) {
        this.namaPoliklinik = namaPoliklinik;
    }

    // Method untuk menampilkan
    public void tampilkanInfo() {
        System.out.println("Kode Poli: " + kodePoli);
        System.out.println("Nama Poliklinik: " + namaPoliklinik);
    }

    // Main method contoh penggunaan
    public static void main(String[] args) {
        Poliklinik poli = new Poliklinik("P001", "Poli Umum");
        poli.tampilkanInfo();
    }
}
