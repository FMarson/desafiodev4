# Nano Projeto de Fundamentos de Programação em Java  
## Tema: Conversões de Medidas

### 1. Objetivo
Desenvolver um programa em **Java** capaz de realizar **conversões de medidas** por meio de um sistema de **menus e submenus** exibidos no console.

O programa deverá utilizar apenas os tipos wrapper:

- `Integer`
- `Double`
- `Boolean`
- `String`

Deverá também utilizar os recursos de entrada e saída da classe **IO**, por meio de:

- `IO.print()`
- `IO.println()`
- `IO.readln()`

---

### 2. Requisitos obrigatórios

#### 2.1 Linguagem e estrutura
- O programa deve ser desenvolvido em **Java**.
- O código deve ser organizado em **métodos com parâmetros**.

#### 2.2 Tipos de dados
- Utilizar apenas:
  - `Integer`
  - `Double`
  - `Boolean`
  - `String`
- Se desejado, é possível utilizar tipos primitivos como `int`, `double` e `boolean`.

#### 2.3 Estruturas de controle
O programa deve obrigatoriamente conter:

- `if/else`
- `switch/case`
- `for`
- `while`
- `do/while`

#### 2.4 Entrada e saída
- Todas as mensagens devem ser apresentadas com `IO.print()` e `IO.println()`.
- A leitura de dados deve ser feita com `IO.readln("prompt")`.

---

### 3. Tema do trabalho
O sistema será voltado para **conversões de medidas**, dividido nos seguintes tópicos:

1. Comprimento  
2. Área  
3. Volume  
4. Velocidade  
5. Massa  

Cada tópico deve aparecer em um **menu principal**, com um **submenu** contendo as conversões disponíveis.

---

### 4. Organização dos menus

#### 4.1 Menu principal
O menu principal deve apresentar as categorias de conversão:

- Comprimento
- Área
- Volume
- Velocidade
- Massa
- Sair

#### 4.2 Submenus
Ao selecionar uma categoria, o programa deve abrir um submenu com as opções de conversão daquela área.

Exemplo:

- Comprimento
  - metro para quilômetro
  - quilômetro para metro
  - metro para centímetro
  - centímetro para metro
  - metro para milímetro
  - milímetro para metro

Cada tópico deve conter entre **quatro e seis conversões**.

---

### 5. Conversões mínimas por tópico

#### 5.1 Comprimento
- milímetro para centímetro
- centímetro para metro
- metro para quilômetro
- metro para polegada
- metro para pé

#### 5.2 Área
- centímetro quadrado para metro quadrado
- metro quadrado para quilômetro quadrado
- metro quadrado para hectare
- metro quadrado para acre

#### 5.3 Volume
- mililitro para litro
- litro para metro cúbico
- centímetro cúbico para mililitro
- metro cúbico para decímetro cúbico

#### 5.4 Velocidade
- metro por segundo para quilômetro por hora
- quilômetro por hora para metro por segundo
- quilômetro por hora para milha por hora
- milha por hora para quilômetro por hora

#### 5.5 Massa
- miligrama para grama
- grama para quilograma
- quilograma para tonelada
- libra para quilograma
- onça para grama

---

### 6. Regras de funcionamento
1. O programa deve iniciar com o **menu principal**.
2. O usuário escolhe uma categoria.
3. O sistema mostra o submenu correspondente.
4. O usuário escolhe a conversão desejada.
5. O sistema solicita o valor a ser convertido.
6. O programa realiza o cálculo usando uma **função com parâmetros**.
7. O resultado é exibido ao usuário.
8. Após a conversão, o sistema deve permitir:
   - realizar outra conversão
   - voltar ao menu anterior
   - sair do programa

---

### 7. Requisitos de implementação
O código deve demonstrar o uso das estruturas pedidas de forma clara, por exemplo:

- `while` para manter o programa em execução até o usuário escolher sair;
- `do/while` para exibir menus ao menos uma vez e repetir enquanto necessário;
- `for` para percorrer repetidamente opções de exibição ou validação;
- `if/else` para validar escolhas ou verificar condições;
- `switch/case` e `switch expressions` com `->` para controlar os menus e chamadas de conversão.

---

### 8. Funções esperadas
O programa deve conter funções separadas, por exemplo:

- função para exibir o menu principal;
- função para exibir cada submenu;
- funções para cada conversão;
- função auxiliar para leitura e validação de valores;
- função para retornar mensagens ou resultados formatados.

Cada conversão deve ser implementada em uma função própria, recebendo parâmetros e retornando o resultado correspondente.

---

### 9. Critérios de avaliação
O trabalho será avaliado de acordo com:

- funcionamento correto dos menus;
- uso correto dos tipos wrapper;
- ausência de arrays;
- uso adequado de `if/else`, `switch/case`, switch expressions, `->`, `for`, `while` e `do/while`;
- clareza na divisão do código em funções;
- correção das fórmulas de conversão;
- apresentação organizada da saída;
- legibilidade e organização do código.

---

### 10. Exemplo de interação
```text
==== MENU PRINCIPAL ====
1 - Comprimento
2 - Área
3 - Volume
4 - Velocidade
5 - Massa
0 - Sair

Escolha uma opção: 1

==== COMPRIMENTO ====
1 - Milímetro para Centímetro
2 - Centímetro para Metro
3 - Metro para Quilômetro
4 - Metro para Polegada
5 - Metro para Pé
0 - Voltar

Escolha uma opção: 3
Informe o valor em metros: 1500
Resultado: 1500 metros = 1.5 quilômetros
