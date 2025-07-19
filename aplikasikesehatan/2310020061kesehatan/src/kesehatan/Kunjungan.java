package kesehatan;

import java.util.ArrayList;

public class Kunjungan {
    ArrayList<Input_User> daftarkunjungan = new ArrayList<>();
    
    String nomor;
    String tanggalKunjungan;
    String nomorRekamMedis;
    String namaLengkap;
    String jenisKelamin;
    String namaDokter;
    String peserta;

    // Constructor
    public Kunjungan(String nomor, String tanggalKunjungan, String nomorRekamMedis,
                     String namaLengkap, String jenisKelamin, String namaDokter, String peserta) {
        this.nomor = nomor;
        this.tanggalKunjungan = tanggalKunjungan;
        this.nomorRekamMedis = nomorRekamMedis;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.namaDokter = namaDokter;
        this.peserta = peserta;
    }

    // Method untuk menampilkan data (bisa dipanggil dari frame GUI)
    public String getInfoKunjungan() {
        return "Nomor: " + nomor + "\n"
             + "Tanggal Kunjungan: " + tanggalKunjungan + "\n"
             + "Nomor Rekam Medis: " + nomorRekamMedis + "\n"
             + "Nama Lengkap: " + namaLengkap + "\n"
             + "Jenis Kelamin: " + jenisKelamin + "\n"
             + "Nama Dokter: " + namaDokter + "\n"
             + "Peserta: " + peserta;
    }
}
