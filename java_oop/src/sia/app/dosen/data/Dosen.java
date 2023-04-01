package sia.app.dosen.data;

import sia.app.abstracts.Person;

public class Dosen extends Person {
    private Number umur;

    public void setUmur (Number umur) {
        this.umur = umur;
    }

    public Number getUmur() {
        return this.umur;
    }
}
