package Restaurant.src.restaurant;
public class Product {

    private String nom;
    private double prix;
    private int stock;

    public Product(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public void decreaseStock() {
        this.stock--;
    }

    public void addStock() {
        this.stock++;
    }


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
