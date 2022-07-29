import java.util.Date;

public class Wisata {
    private String name;
    private  String description;
    private double harga;
    private int stock;
    private String kota;

    public Wisata(String name, String description, double harga, int stock,  String kota) {
        this.kota = kota;
        this.setName(name);
        this.setDescription(description);
        this.setHarga(harga);
        this.setStock(stock);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.name = kota;
    }
}
