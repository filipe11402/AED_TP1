## Trabalho Prático 1 
### Unidade Curricular de Algoritmia e Estrutura de Dados

---

### Abordagem ao problema

Comecei por analisar qual é o output desejado, e fiz as seguintes questões:
- Pode haver valores repetidos?

Após analisar as constraints do problema, fiz um brainstorming e pesquisei que tipo de Sorts seria melhor aplicado para esta situação, acabando por escolher o Bucket Sort

### Resolução do problema

#### Estrutura de dados escolhidas
Para resolver o problema, decidi, usar apenas 1 tipo de estrutura de dados, ```char[]```

#### Lógica
De início, passei a string não ordenada, para um ```char[]```, após isso, fiz uma iteração, com limite ```< .length```.
Por cada iteração, caso o item na posição i da string desordenada, fosse diferente do item na string ordenada, era feito o swap.
Foi criado uma variável temp, de seguida na string desordenada, na posição i, era inserido o item na posição i, da string ordenada.
No final, era retirado a posição do item temporário, na string ordenada, e inserido na mesma posição, na string desordenada.

### Testes
- Framework usada: JUnit
- Criado apenas um método, visto que apenas foi criado um método e era esse que era necessário os devidos testes

### Resolução
Para concluir, este algoritmo possui inúmeros tipos diferentes de resoluções, send que a escolhida, foi com recurso ao Bucket Sort.
Sinto que isto não será, de longe a melhor resolução, mas cumpre o objetivo pedido, e que está sempre aberto a melhorias, como sempre.