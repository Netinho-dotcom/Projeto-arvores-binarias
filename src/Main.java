public class Main {
    public static void main(String[] args) {
        // Cria uma nova árvore binária vazia
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("ÁRVORE BINÁRIA DE BUSCA - DEMONSTRAÇÃO \n");


        // TESTE 1: INSERÇÃO DE VALORES

        System.out.println(" TESTE 1: INSERÇÃO ");
        System.out.println("Inserindo valores: 50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 65");

        arvore.inserir(50);  // Raiz
        arvore.inserir(30);  // Filho esquerdo da raiz
        arvore.inserir(70);  // Filho direito da raiz
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);
        arvore.inserir(10);
        arvore.inserir(25);
        arvore.inserir(35);
        arvore.inserir(65);

        System.out.println("✓ Valores inseridos com sucesso!\n");


        // TESTE 2: PERCURSOS (TRAVESSIAS)

        System.out.println(" TESTE 2: PERCURSOS DA ÁRVORE ");

        // Pré-Ordem: Raiz -> Esquerda -> Direita
        arvore.preOrdem();

        // Em Ordem: Esquerda -> Raiz -> Direita (valores ordenados)
        arvore.emOrdem();

        // Pós-Ordem: Esquerda -> Direita -> Raiz
        arvore.posOrdem();

        System.out.println();


        // TESTE 3: BUSCA DE VALORES

        System.out.println(" TESTE 3: BUSCA DE VALORES ");

        int[] valoresBuscar = {40, 65, 100, 10, 55};

        for (int valor : valoresBuscar) {
            boolean encontrado = arvore.buscar(valor);
            String resultado = encontrado ? "✓ ENCONTRADO" : "✗ NÃO ENCONTRADO";
            System.out.println("Buscar " + valor + ": " + resultado);
        }

        System.out.println();


        // TESTE 4: NOVA ÁRVORE PARA DEMONSTRAÇÃO

        System.out.println(" TESTE 4: SEGUNDA ÁRVORE (VALORES MENORES) ");
        ArvoreBinaria arvore2 = new ArvoreBinaria();

        System.out.println("Inserindo valores: 15, 10, 20, 8, 12, 17, 25");
        arvore2.inserir(15);
        arvore2.inserir(10);
        arvore2.inserir(20);
        arvore2.inserir(8);
        arvore2.inserir(12);
        arvore2.inserir(17);
        arvore2.inserir(25);

        System.out.println("\nPercursos da segunda árvore:");
        arvore2.preOrdem();
        arvore2.emOrdem();
        arvore2.posOrdem();

        System.out.println("\n      TESTES CONCLUÍDOS COM SUCESSO!       ");

    }
}