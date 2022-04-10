## Trabalho Prático 1 
### Unidade Curricular de Algoritmia e Estrutura de Dados

---

### Abordagem ao problema

Comecei por analisar qual é o output desejado, e fiz as seguintes questões:
- Pode haver valores repetidos?

Após analisar as constraints do problema, fiz um brainstorming e pesquisei que tipo de Sorts seria melhor aplicado para esta situação, acabando por escolher o Bucket Sort

### Resolução do problema

#### Estrutura de dados escolhidas
Para resolver o problema, decidi, usar 2 tipos de estrutura de dados + 1 estrutura de dados para retorno.
```HashMap<Character, Integer>``` para armazenar o caracter bem como a posição do mesmo, na string ordenada, pois como não existe caractéres repetidos.
```Char[]```, para ser usado como a minha string ordenada.
```Pair<String, Integer>``` para retornar, a string ordenada e o número de passos.

#### Lógica
Iterar sobre a string ordenada, e armazenar no Hashmap, o caractér como chave, e a posição do mesmo na string, como valor.
Após isso, iterar sobre a string não ordenada, e inserir no ```Char[]``` o valor do caracter atual da iteração, com base na posição que o mesmo tem, no ```HashMap<>```, ```dict.get(caracter)``` e incrementamos o número de jogadas, pois é aqui que se dá o processo de ordenação.
Iteramos de seguida sobre o ```Char[]```, e inserimos no StringBuilder, para criarmos uma string através de um array.
Retornamos de seguida o StringBuild + o número total de jogadas, como um Tuple(Pair).


### Testes
- Framework usada: JUnit
- Criado apenas um método, com a data annotation ```@ParameterizedTest```, de forma a testarmos vários tipos de input.
