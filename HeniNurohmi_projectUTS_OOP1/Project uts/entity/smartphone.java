package entity;

public class smartphone {

    private String merk;
    private String harga;
    private String seri;
    private String warna;

    public smartphone(String merk, String harga, String seri, String warna) {
        this.merk = merk;
        this.harga = harga;
        this.seri = seri;
        this.warna = warna;
    }

    public boolean equals(Object object) {
        smartphone smp = (smartphone) object;
        return merk.equals(smp.getMerk());
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}