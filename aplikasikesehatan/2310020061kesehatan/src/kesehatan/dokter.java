package kesehatan;

import java.util.ArrayList;

public class dokter {
    ArrayList<dokter> daftardokter = new ArrayList<>();

    String kodeDokter;
    String nip;
    String nama;
    String tempatLahir;
    String tanggalLahir;
    String jabatan;
    String pendidikan;
    String spesialis;
    String jenisKelamin;

    public dokter(String kodeDokter, String nip, String nama, String tempatLahir, String tanggalLahir,
                  String jabatan, String pendidikan, String spesialis, String jenisKelamin) {
        this.kodeDokter = kodeDokter;
        this.nip = nip;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jabatan = jabatan;
        this.pendidikan = pendidikan;
        this.spesialis = spesialis;
        this.jenisKelamin = jenisKelamin;
    }



    public String getKodeDokter() {
        return kodeDokter;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public String getSpesialis() {
        return spesialis;
    }
}
