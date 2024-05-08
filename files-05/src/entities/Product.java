package entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantify;

    public Product(String name, Double price, Integer quantify) {
        this.name = name;
        this.price = price;
        this.quantify = quantify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public double total() {
        return price * quantify;
    }
}
