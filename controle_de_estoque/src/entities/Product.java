package entities;

public class Product {
    public String nome;
    public double preco;
    public int quant;

    public Product(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double valorTotalEmEstoque(){
        return preco * quant;
    }

    public void addProdutos(int quant){
        this.quant += quant;
    }

    public void removerProdutos(int quant){
        this.quant -= quant;
    }

    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quant
                + " unidades, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}