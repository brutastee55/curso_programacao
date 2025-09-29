package gettersSetters.entities;

public class Product {
    private String name;
    private double price;
    private int quantity; //por padrão em java variaveis int recebem o valor 0

    public int getOla() {
        return ola;
    }

    public void setOla(int ola) {
        this.ola = ola;
    }

    private int ola;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}