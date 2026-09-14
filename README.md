# Carrinho de Compras — Prática 2 (Arrays e Collections)

Programa em Java que simula o carrinho de compras de uma loja de suprimentos, utilizando conceitos de Orientação a Objetos e a coleção `ArrayList`.

Disciplina: Laboratório de Programação Modular — PUC Minas
Professor: Glender Brás

## Descrição

O programa cadastra um catálogo fixo de produtos e permite ao usuário, via menu no terminal, comprar produtos, visualizar a fatura, excluir itens, alterar quantidades e finalizar a compra com o valor total calculado.

## Estrutura de classes

```
Fatura 1 ---- * Item 1 ---- 1 Produto
```

- **`Produto`** — representa um produto do catálogo da loja: `nome`, `código` e `preço`. Classe simples, apenas com getters e setters.
- **`Item`** — representa um produto comprado em determinada quantidade. Guarda uma referência ao `Produto` e a `quantidade`, e calcula o valor total do item (`preço do produto × quantidade`) sob demanda, sem duplicar o preço.
- **`Fatura`** — representa o carrinho/fatura da compra. Contém uma lista (`ArrayList<Item>`) dos itens comprados e calcula o valor total somando o valor de cada item.
- **`Carrinho`** — classe principal (`main`), responsável por exibir o menu, ler as escolhas do usuário e delegar as ações às classes acima. Não executa cálculos diretamente.

## Funcionalidades (menu)

| Opção | Ação |
|---|---|
| 1 | Comprar — lista os produtos disponíveis, pede código e quantidade, e adiciona o item à fatura |
| 2 | Ver Fatura — exibe os itens comprados e o valor total até o momento |
| 3 | Excluir item — remove um item da fatura pela posição |
| 4 | Alterar item — altera a quantidade de um item já comprado |
| 5 | Finalizar — encerra o programa e exibe o valor final da compra |

## Como executar

```bash
javac *.java
java Carrinho
```

## Conceitos aplicados

- Orientação a Objetos: encapsulamento (atributos privados com getters/setters), classes com responsabilidades bem definidas
- Composição de objetos (`Fatura` possui `Item`, `Item` possui `Produto`)
- Uso de `ArrayList` para coleções de tamanho dinâmico
- Cálculo de valores derivados sob demanda (evitando dados duplicados/desatualizados)
