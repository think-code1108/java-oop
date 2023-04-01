package sia.app.mahasiswa.application;

import sia.app.mahasiswa.data.Mahasiswa;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1111", "Budi", "Laki-Laki", "0812121");
        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.gender);
        System.out.println(mhs.PhoneNumber);
        
    }
}
