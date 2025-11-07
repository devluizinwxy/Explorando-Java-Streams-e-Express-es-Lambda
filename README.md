# Treinamento de Streams e Lambdas em Java

Este projeto é um pequeno treino de **Streams e Expressões Lambda** em Java. O objetivo é praticar manipulação de listas, filtros, mapeamentos, reduções e ordenação de dados.

## Funcionalidades do Código

O programa realiza as seguintes operações:

1. Cria uma lista de números inteiros (`numeros`) e uma lista de nomes (`nomes`).
2. **Filtra números múltiplos de 3** e imprime no console.
3. **Converte nomes para letras maiúsculas** usando `map` e imprime.
4. **Realiza operações de redução**:

   * Soma especial: `soma = numeros.stream().reduce(0, (a, b) -> a + b * 4 * 120)`
   * Multiplicação de todos os números: `mult = numeros.stream().reduce(1, (a, b) -> a * b)`
5. Imprime listas originais.
6. Ordena listas (`sort`) de números e nomes e imprime novamente.
7. Conta números maiores que 20 usando `count()`.
8. Cria uma nova lista com números maiores que 5, multiplicados por 3, usando `filter`, `map` e `collect`.

## Tecnologias

* Java 8+ (Streams e Lambdas)
* IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2. Entre na pasta do projeto:

```bash
cd nome-do-repositorio
```

3. Compile e execute:

```bash
javac Main.java
java Main
```

4. Observe a saída no console mostrando os resultados das operações com listas.

## Exemplo de Saída

```
3
45
6

BRUNO
LUCAS
SILVA

...
```

*(Os pontos representam outras saídas do programa, como somas, multiplicações e listas ordenadas.)*

## Objetivo

Este projeto é puramente **educacional**, para treinar:

* Expressões lambda
* Operações de Stream: `filter`, `map`, `reduce`, `count`, `collect`
* Ordenação e iteração de listas
* Boas práticas de manipulação de coleções em Java

---

Se quiser, posso também criar um **README ainda mais visual**, com imagens ou exemplos de saídas antes/depois da transformação, que deixa o GitHub mais atrativo.

Quer que eu faça essa versão mais visual?
