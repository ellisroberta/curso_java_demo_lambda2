# Problema exemplo

Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.

## Implementação da interface

* Classe **Program**:
    * No método main, é criada uma lista de produtos e alguns produtos são adicionados a ela. 
    * O método removeIf é chamado na lista, passando uma instância de ProductPredicate. Esse método irá remover todos os produtos que atenderem a condição definida no test do predicado.

* Classe **ProductPredicate**:
  * Implementa a interface Predicate<Product>, que exige a implementação do método test.
  * O método test verifica se o preço do produto é maior ou igual a 100. Se for, retorna true, o que resulta na remoção do produto da lista.

* Classe **Product**:
  * Representa um produto com atributos name e price. 
  * Contém métodos para acessar e modificar esses atributos (getters e setters). 
  * Tem um método toString que formata a saída do produto, facilitando a visualização.

## Reference method com método estático

* Referência a Método Estático:
  * A linha list.removeIf(Product::staticProductPredicate); utiliza uma referência a método estático. Aqui, Product::staticProductPredicate é uma forma concisa de passar o método staticProductPredicate como um predicado para o método removeIf.
  * O método removeIf itera sobre a lista e chama staticProductPredicate para cada produto. Se o método retornar true, o produto é removido da lista.

* Método Estático staticProductPredicate:

  * Este método é declarado como static, o que significa que ele pertence à classe Product e pode ser chamado sem a necessidade de instanciar um objeto da classe.
  * O método recebe um objeto Product como argumento e retorna um booleano indicando se o preço do produto é igual ou superior a 100.

* Funcionalidade do Programa:

  * O programa cria uma lista de produtos, adiciona alguns produtos e, em seguida, remove aqueles cujo preço é maior ou igual a 100 usando a referência ao método estático.
  * Finalmente, imprime os produtos restantes na lista.