package jti.polinema.ac.id.a04androidrecyclerview;

public class Model {
    private String nama;
    private String absen;
    private String nim;

    public Model(String nama, String absen, String nim) {
        this.nama = nama;
        this.absen = absen;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAbsen() {
        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
