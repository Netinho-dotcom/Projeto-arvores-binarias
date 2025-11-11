# Projeto: Árvore Binária de Busca (BST)

## 📚 Parte 1 - Conceito e Explicação

### 1. O que é recursividade?

Recursividade é uma técnica de programação onde uma função chama a si mesma para resolver um problema dividindo-o em subproblemas menores e mais simples. Para funcionar corretamente, toda função recursiva precisa de dois elementos fundamentais:

- **Caso Base**: A condição de parada que evita chamadas infinitas
- **Caso Recursivo**: A chamada da própria função com um problema reduzido

**Exemplo simples:** Calcular o fatorial de um número
```
fatorial(5) = 5 × fatorial(4)
fatorial(4) = 4 × fatorial(3)
fatorial(3) = 3 × fatorial(2)
fatorial(2) = 2 × fatorial(1)
fatorial(1) = 1  ← Caso base (para aqui)
```

A recursividade é especialmente útil em estruturas de dados hierárquicas como árvores, onde cada subárvore pode ser tratada como uma árvore menor.

---

### 2. Como a recursividade é usada na percorrência de uma árvore binária?

Na percorrência de uma árvore binária, a recursividade permite visitar todos os nós de forma natural e elegante. O processo funciona assim:

**Funcionamento:**
1. **Caso Base**: Se o nó atual é `null` (vazio), retorna sem fazer nada
2. **Caso Recursivo**: Visita o nó atual e chama recursivamente para os filhos esquerdo e direito

**Exemplo prático com percurso Em Ordem:**
```
Árvore:
    50
   /  \
  30   70
 
Execução:
1. emOrdem(50) → chama emOrdem(30) [vai para esquerda]
2. emOrdem(30) → chama emOrdem(null) [esquerda de 30]
3. emOrdem(null) → retorna [caso base]
4. Imprime 30
5. emOrdem(null) → retorna [direita de 30]
6. Volta para o nó 50
7. Imprime 50
8. emOrdem(70) → processa o nó 70
9. Imprime 70
```

A recursividade elimina a necessidade de controlar manualmente a pilha de execução, pois a própria linguagem gerencia as chamadas pendentes automaticamente.

---

### 3. Qual a diferença entre recursão e laço (for/while)?

Ambas são formas de repetição, mas funcionam de maneiras diferentes:

**RECURSÃO:**
- A função chama a si mesma
- Usa a pilha de chamadas do sistema
- Mais intuitiva para estruturas hierárquicas (árvores, grafos)
- Pode consumir mais memória (cada chamada ocupa espaço na pilha)
- Mais legível para problemas que têm natureza recursiva

**LAÇOS (for/while):**
- Repete um bloco de código enquanto uma condição é verdadeira
- Usa menos memória (não empilha chamadas)
- Mais eficiente para iterações simples e sequenciais
- Requer estruturas auxiliares (pilha/fila) para simular recursão em árvores
- Melhor para problemas iterativos simples

```

**Para árvores:** A recursão é naturalmente mais adequada porque cada nó tem a mesma estrutura (valor + filhos), tornando o código mais simples e compreensível. Implementar percursos de árvore com laços exigiria criar e gerenciar estruturas auxiliares manualmente.

---

## 💻 Parte 2 - Implementação

### Estrutura do Projeto

O projeto contém três arquivos principais:

1. **Node.java** - Representa um nó da árvore com valor e referências para filhos
2. **ArvoreBinaria.java** - Implementa a árvore com todos os métodos recursivos
3. **Main.java** - Classe principal com testes e demonstrações

### Métodos Implementados

#### ✅ Inserção
- Insere valores mantendo a propriedade BST (esquerda < raiz < direita)
- Utiliza recursão para encontrar a posição correta

#### ✅ Busca
- Procura um valor na árvore retornando `true` ou `false`
- Usa recursão para navegar pela estrutura

#### ✅ Percursos (Travessias)
- **Pré-Ordem**: Raiz → Esquerda → Direita
- **Em Ordem**: Esquerda → Raiz → Direita (resulta em valores ordenados)
- **Pós-Ordem**: Esquerda → Direita → Raiz

### Destaques da Implementação

- ✨ Todos os métodos principais utilizam recursividade
- 📝 Comentários explicativos indicando casos base e chamadas recursivas
- 🧪 Testes completos demonstrando todas as funcionalidades
- 📊 Código bem organizado e com nomes claros

---

## 🚀 Como Executar

1. Compile os arquivos:
```bash
javac Node.java ArvoreBinaria.java Main.java
```

2. Execute o programa:
```bash
java Main
```

---

## 📊 Evidências de Execução

### Exemplo de Saída:

```

ÁRVORE BINÁRIA DE BUSCA - DEMONSTRAÇÃO     


TESTE 1: INSERÇÃO 
Inserindo valores: 50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 65
✓ Valores inseridos com sucesso!

TESTE 2: PERCURSOS DA ÁRVORE 
Pré-Ordem: 50 30 20 10 25 40 35 70 60 65 80 
Em Ordem: 10 20 25 30 35 40 50 60 65 70 80 
Pós-Ordem: 10 25 20 35 40 30 65 60 80 70 50 

TESTE 3: BUSCA DE VALORES 
Buscar 40: ✓ ENCONTRADO
Buscar 65: ✓ ENCONTRADO
Buscar 100: ✗ NÃO ENCONTRADO
Buscar 10: ✓ ENCONTRADO
Buscar 55: ✗ NÃO ENCONTRADO
```

### Estrutura da Árvore Criada:

```
                50
              /    \
            30      70
           /  \    /  \
         20   40  60  80
        /  \  /    \
       10 25 35   65
```

---

## 🎯 Conceitos Aplicados

- ✅ Recursividade em todas as operações principais
- ✅ Árvore Binária de Busca (BST)
- ✅ Casos base claramente identificados
- ✅ Chamadas recursivas comentadas
- ✅ Percursos: pré-ordem, em ordem e pós-ordem

---

## 👨‍💻 Autor

[José Alves]
