package com.company;

public class KRS {
    private String matkul;
    private String semester;
    private String jadwal;

    public KRS(){}

    public KRS(String matkul, String semester, String jadwal) {
        this.matkul = matkul;
        this.semester = semester;
        this.jadwal = jadwal;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
}
