package util;

import model.entities.Product;

import java.util.function.Predicate;

// Classe ProductPredicate que implementa a interface Predicate para filtrar produtos
public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        // Retorna true se o preço do produto for maior ou igual a 100, caso contrário retorna false
        return p.getPrice() >= 100.0;
    }
}