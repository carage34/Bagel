package Restaurant.src.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<Product> productList;
    public Restaurant() {
        productList = new ArrayList<>();
    }

    public void addProduct(String nom, double prix, int stock) {
        this.productList.add(new Product(nom, prix, stock));
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        String text = "";
        while(text.charAt(0)!='q') {
            System.out.println("What do you want do? [h for help]");
            text = sc.next();
            if(text.length() == 1) {
                switch(text.charAt(0)) {
                    case 'h':
                        System.out.println("a : Ajouter un produit");
                        System.out.println("s : Afficher la liste des produits");
                        System.out.println("o : Ouvrir la note d'un client");
                        System.out.println("e : Enregistrer la vente d'un produit");
                        System.out.println("c : Clôturer la note d'un client");
                        System.out.println("d : Afficher les données comptables");
                        break;
                        case 'a':
                            System.out.print("Entrez le nom du produit : ");
                            String nom = sc.next();
                            System.out.println();
                            System.out.println("Entrez le prix du produit ");
                            double prix  = sc.nextDouble();
                            System.out.println();
                            System.out.println("Entrez le nombre de produit disponible");
                            int stock = sc.nextInt();
                            this.productList.add(new Product(nom, prix, stock));
                            break;
                    case 's':
                        for(int i=0;i<productList.size();i++) {
                            System.out.println(productList.get(i).getStock() + " " + productList.get(i).getNom() + " restant(s)");
                        }
                        break;
                    case 'o':
                        break;
                    case 'e':
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    default:
                        System.out.println("Commande inconnu. Taper h pour de l'aide");
                }
            }
        }
    }
}
