package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        KRS krs1 = new KRS();
        Mahasiswa mhs1 = new Mahasiswa();

        System.out.print("Masukkan Nama anda    : ");
        String nama = input.nextLine();
        mhs1.setNama(nama);

        System.out.print("Masukkan NIM anda     : ");
        String nim = input.nextLine();
        mhs1.setNim(nim);

        System.out.print("Masukkan Kelas anda   : ");
        String kls = input.nextLine();
        mhs1.setKelas(kls);

        System.out.print("Masukkan Semester anda : ");
        String smt = input.nextLine();
        krs1.setSemester(smt);

        System.out.print("Masukkan jumlah jadwal yang diinginkan : ");
        int jml = input.nextInt();

        String matkul[] = new String[10];
        String jdw[] = new String[10];
        for(int i=0; i<jml; i++) {
            System.out.print("Masukkan Matkul anda  : ");
            matkul[i] = input.nextLine();
            krs1.setMatkul(matkul[i]);

            System.out.print("Masukkan jadwal anda  : ");
            jdw[i] = input.nextLine();
            krs1.setJadwal(jdw[i]);
        }
        mhs1.addKRS(krs1, jml);

    }
}
