package application;

import model.entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {
        // Cria uma lista de produtos
        List<Product> list = new ArrayList<>();

        // Adiciona produtos à lista com nome e preço
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0; // Define o preço mínimo

        // Declara uma expressão lambda que verifica se o preço do produto é maior ou igual a min
        Predicate<Product> pred = p -> p.getPrice() >= min;

        // Remove produtos da lista que atendem ao critério do predicado
        list.removeIf(pred);

        // Imprime os produtos restantes na lista
        for (Product p : list) {
            System.out.println(p);
        }
    }
}