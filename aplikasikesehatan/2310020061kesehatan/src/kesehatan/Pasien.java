package kesehatan;

import java.util.ArrayList;

public class Pasien {
    ArrayList<Input_User> daftarpasien = new ArrayList<>();
    
    private String nomor, rekamMedis, nama, ttl, umur, jk, pendidikan, agama, pekerjaan, alamat, status, golDarah;

    public Pasien(String nomor, String rekamMedis, String nama, String ttl, String umur, String jk,
                  String pendidikan, String agama, String pekerjaan, String alamat, String status, String golDarah) {
        
        this.nomor = nomor;
        this.rekamMedis = rekamMedis;
        this.nama = nama;
        this.ttl = ttl;
        this.umur = umur;
        this.jk = jk;
        this.pendidikan = pendidikan;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.status = status;
        this.golDarah = golDarah;
    }

    public String getInfoPasien() {
        return "Nomor: " + nomor + "\n"
             + "Rekam Medis: " + rekamMedis + "\n"
             + "Nama: " + nama + "\n"
             + "TTL: " + ttl + "\n"
             + "Umur: " + umur + "\n"
             + "Jenis Kelamin: " + jk + "\n"
             + "Pendidikan: " + pendidikan + "\n"
             + "Agama: " + agama + "\n"
             + "Pekerjaan: " + pekerjaan + "\n"
             + "Alamat: " + alamat + "\n"
             + "Status Kawin: " + status + "\n"
             + "Golongan Darah: " + golDarah;
    }
}
