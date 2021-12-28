package entities;

public class Product implements Comparable<Product> {

    //Attributes
    private String name;
    private Double price;

    //Constructor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //Getters and Setters
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ',' + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
