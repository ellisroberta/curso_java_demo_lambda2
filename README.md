# Programa de Filtragem de Produtos

## Descrição do Problema

Este programa tem como objetivo criar uma lista de produtos e remover aqueles cujo preço é maior ou igual a 100. A implementação demonstra o uso de diferentes técnicas de filtragem, incluindo métodos estáticos, não estáticos e expressões lambda.

## Estrutura do Código

### Classe **Program**
- O método `main` cria uma lista de produtos e adiciona alguns itens a ela.
- O método `removeIf` é chamado na lista, utilizando uma expressão lambda ou um método de referência para remover produtos que atendem a uma condição específica.

### Classe **ProductPredicate**
- Implementa a interface `Predicate<Product>`, que requer a implementação do método `test`.
- O método `test` verifica se o preço do produto é maior ou igual a 100, retornando `true` para remoção.

### Classe **Product**
- Representa um produto com os atributos `name` e `price`.
- Contém métodos para acessar e modificar esses atributos (getters e setters).
- Inclui um método `toString` para formatar a saída do produto, facilitando a visualização.

## Métodos de Filtragem

### 1. Referência a Método Estático
- A linha `list.removeIf(Product::staticProductPredicate);` utiliza uma referência a um método estático.
- O método `removeIf` itera sobre a lista e chama `staticProductPredicate` para cada produto. Se retornar `true`, o produto é removido.

### 2. Referência a Método Não Estático
- A linha `list.removeIf(Product::nonStaticProductPredicate);` utiliza uma referência a um método não estático.
- O método `removeIf` itera sobre a lista e chama `nonStaticProductPredicate` em cada instância de `Product`. Se retornar `true`, o produto é removido.

### 3. Expressão Lambda
- A expressão lambda `p -> p.getPrice() >= min` é utilizada para definir critérios de filtragem inline.
- O método `removeIf(pred)` é chamado para remover produtos cujo preço é maior ou igual a 100.

## Resultados do Programa

Ao executar o programa, a saída será a lista de produtos que têm preço inferior a 100. Portanto, neste caso, o resultado será:

```
Mouse, 50.00
HD Case, 80.90
```

Os produtos "Tv" e "Tablet" foram removidos da lista porque seus preços eram iguais ou superiores a 100.
A utilização de referências a métodos e expressões lambda simplifica o código e melhora a legibilidade.

## Conclusão

Este programa demonstra a eficácia de diferentes abordagens para filtrar coleções em Java, utilizando conceitos como métodos estáticos,
não estáticos e expressões lambda. Essas técnicas ajudam a manter o código conciso e legível.