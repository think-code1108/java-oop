package sia.app.mahasiswa.data;

import sia.app.abstracts.Person;

public class Mahasiswa extends Person {
    public String nim;
    public String PhoneNumber;

    public Mahasiswa(String nim,String nama, String gender, String phoneNumber) {
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.PhoneNumber = phoneNumber;
    }
}
