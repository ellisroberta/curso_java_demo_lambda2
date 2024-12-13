package model.entities;

// Classe Product que representa um produto com nome e preço
public class Product {

    private String name; // Atributo que armazena o nome do produto
    private Double price; // Atributo que armazena o preço do produto

    // Construtor que inicializa o nome e o preço do produto
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos getters e setters para os atributos
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

    // Método estático que verifica se o preço do produto é maior ou igual a 100
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }

    // Método que retorna uma representação em string do produto
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price); // Formata o preço com duas casas decimais
    }
}