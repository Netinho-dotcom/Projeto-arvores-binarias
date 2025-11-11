class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        // Chama o método recursivo passando a raiz atual
        raiz = inserirRecursivo(raiz, valor);
    }

    /**
     * Método recursivo privado para inserir um valor
     * CASO BASE: Se o nó atual for null, cria e retorna um novo nó
     * CHAMADAS RECURSIVAS: Navega para esquerda ou direita conforme o valor
     */
    private Node inserirRecursivo(Node atual, int valor) {
        // CASO BASE: Encontrou a posição correta (nó vazio)
        if (atual == null) {
            return new Node(valor);
        }

        // CHAMADA RECURSIVA: Se o valor é menor, insere à esquerda
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        }
        // CHAMADA RECURSIVA: Se o valor é maior, insere à direita
        else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        // Se o valor já existe, não insere duplicado

        return atual;
    }

    /**
     * Método público para buscar um valor na árvore
     */
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    /**
     * Método recursivo privado para buscar um valor
     * CASO BASE 1: Se o nó for null, o valor não existe (retorna false)
     * CASO BASE 2: Se o valor do nó atual é igual ao procurado (retorna true)
     * CHAMADAS RECURSIVAS: Continua buscando à esquerda ou direita
     */
    private boolean buscarRecursivo(Node atual, int valor) {
        // CASO BASE 1: Nó vazio, valor não encontrado
        if (atual == null) {
            return false;
        }

        // CASO BASE 2: Valor encontrado
        if (valor == atual.valor) {
            return true;
        }

        // CHAMADA RECURSIVA: Busca à esquerda se valor é menor
        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        }
        // CHAMADA RECURSIVA: Busca à direita se valor é maior
        else {
            return buscarRecursivo(atual.direita, valor);
        }
    }

    /**
     * Método público para percurso em PRÉ-ORDEM
     * Ordem de visita: Raiz -> Esquerda -> Direita
     */
    public void preOrdem() {
        System.out.print("Pré-Ordem: ");
        preOrdemRecursivo(raiz);
        System.out.println();
    }

    /**
     * Método recursivo privado para percurso em pré-ordem
     * CASO BASE: Se o nó for null, não faz nada (retorna)
     * CHAMADAS RECURSIVAS: Visita esquerda e depois direita
     */
    private void preOrdemRecursivo(Node no) {
        // CASO BASE: Nó vazio, retorna
        if (no == null) {
            return;
        }

        // 1º: Visita a raiz (nó atual)
        System.out.print(no.valor + " ");

        // 2º: CHAMADA RECURSIVA para subárvore esquerda
        preOrdemRecursivo(no.esquerda);

        // 3º: CHAMADA RECURSIVA para subárvore direita
        preOrdemRecursivo(no.direita);
    }

    /**
     * Método público para percurso EM ORDEM
     * Ordem de visita: Esquerda -> Raiz -> Direita
     * Resulta em uma sequência ordenada dos valores
     */
    public void emOrdem() {
        System.out.print("Em Ordem: ");
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    /**
     * Método recursivo privado para percurso em ordem
     * CASO BASE: Se o nó for null, não faz nada (retorna)
     * CHAMADAS RECURSIVAS: Visita esquerda, depois raiz, depois direita
     */
    private void emOrdemRecursivo(Node no) {
        // CASO BASE: Nó vazio, retorna
        if (no == null) {
            return;
        }

        // 1º: CHAMADA RECURSIVA para subárvore esquerda
        emOrdemRecursivo(no.esquerda);

        // 2º: Visita a raiz (nó atual)
        System.out.print(no.valor + " ");

        // 3º: CHAMADA RECURSIVA para subárvore direita
        emOrdemRecursivo(no.direita);
    }

    /**
     * Método público para percurso em PÓS-ORDEM
     * Ordem de visita: Esquerda -> Direita -> Raiz
     */
    public void posOrdem() {
        System.out.print("Pós-Ordem: ");
        posOrdemRecursivo(raiz);
        System.out.println();
    }

    /**
     * Método recursivo privado para percurso em pós-ordem
     * CASO BASE: Se o nó for null, não faz nada (retorna)
     * CHAMADAS RECURSIVAS: Visita esquerda, depois direita, depois raiz
     */
    private void posOrdemRecursivo(Node no) {
        // CASO BASE: Nó vazio, retorna
        if (no == null) {
            return;
        }

        // 1º: CHAMADA RECURSIVA para subárvore esquerda
        posOrdemRecursivo(no.esquerda);

        // 2º: CHAMADA RECURSIVA para subárvore direita
        posOrdemRecursivo(no.direita);

        // 3º: Visita a raiz (nó atual)
        System.out.print(no.valor + " ");
    }
}