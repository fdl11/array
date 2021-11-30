package com.company;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public void addKRS(KRS isi, int jml) {
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNim());
        System.out.println("Kelas       : " + getKelas());
        System.out.println("Semester    : " + isi.getSemester());
        for(int i=0; i<jml; i++) {
            System.out.println("Mata Kuliah : " + isi.getMatkul());
            System.out.println("Jadwal      : " + isi.getJadwal());
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}