package sia.app.dosen.application;

import sia.app.dosen.data.Dosen;

public class DosenApp {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nama = "Budi";
        dosen.gender = "Laki-Laki";
        dosen.setUmur(30);

        System.out.println(dosen.nama);
        System.out.println(dosen.gender);
        System.out.println(dosen.getUmur());
    }

}
