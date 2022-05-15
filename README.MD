## Trabalho Prático 1 
### Unidade Curricular de Algoritmia e Estrutura de Dados

---

### Abordagem ao problema

Comecei por analisar qual é o output desejado, e fiz as seguintes questões:
- Como conseguir saber quais eram os pais do resultado obtido?
- Qual a melhor maneira de saber que já tinha passado por aquele ``Nó``

Após analisar as constraints do problema, vi que tipo de algoritmo, que se enquadrava na categoria Brute Force Searching, mais concretamente, o Breath First;

O que é o Breath-First Algorithm?
- Começamos por gerar os filhos, com base no Root ``Node``, de seguida, fazemos mais 1 iteracao para baixo, de forma a gerar os filhos, dos ``Nodes`` gerados previamente
- Tendo sempre em atenção, se os filhos gerados, já o tenham sido descobertos

### Resolução do problema

#### Estrutura de dados escolhidas
Para resolver o problema, decidi, usar apenas 2 tipos de estruturas de dados:
- LinkedList
- Stack

#### Lógica
##### Descobir o objetivo
- Começei por calcular quais as constraints do Root ``Node``, para saber para onde o nó se consegue mexer.
- Após isso, gerei os filhos com base nas limitações dos movimentos, e armazenei os nodes uma ``LinkedList<Node>`` de nós ainda não visitados(open nodes), e inseri o node pai, numa mesma estrutura de dados de nós já visitados(closed nodes).
- De seguida, por cada filho que estava nos nós náo visitados, gerei os filhos uma camada para baixo, e se esse nó ainda não tinha sido visitado, então o mesmo era adicionado á lista de nós não visitados.
- No próximo passo, eu removia o o primeiro item da lista, de nós não visitados, com recurso ao método ``.poll()``, e adicionava o mesmo aos nós já visitados.
- Por fim, eu ia buscar o filho seguinte(ainda na primeira camada), calculava os seus limites, e gerava os seus filhos, seguindo a mesma logica para cada iteração;
- A iteração, irá acabar assim que a lista de nós estiver vazia, ou o nó atual for igual ao objetivo desejado;

##### Saber todos os pais do resultado
- Foi usado o algoritmo Tranverse Three, de forma a subirmos a árvore, para ir buscar todos os pais do nó gerado e por sua vez, mostrar toda a árvore.

### Testes
- Framework usada: JUnit
[here](https://github.com/filipe11402/AED_TP1/tree/master/tests)

### Resolução
Para concluir, este algoritmo possui inúmeros tipos diferentes de resoluções, sendo que a escolhida, foi com recurso ao Breath First(Brute Force algorithms).
Sinto que isto não será, de longe a melhor resolução, mas cumpre o objetivo pedido, e que está sempre aberto a melhorias, como sempre.

### Resources
[Brute Force Algorithms](https://javascript.plainenglish.io/solving-8-puzzle-exploring-search-options-2e446e29d21)
[Breath First Example](https://www.youtube.com/watch?v=sXgvdmzTiug)