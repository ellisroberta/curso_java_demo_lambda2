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