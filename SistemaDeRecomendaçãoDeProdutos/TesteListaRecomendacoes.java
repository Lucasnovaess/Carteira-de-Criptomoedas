package SistemaDeRecomendaçãoDeProdutos;

public class TesteListaRecomendacoes {

    public static void main(String[] args) {
        // Criação do objeto RecomendadorAI
        RecomendadorAI recomendador = new RecomendadorAI();
        
        // Adicionando produtos à lista de recomendações
        recomendador.adicionarRecomendacao("Produto 1 - Smartphone");
        recomendador.adicionarRecomendacao("Produto 2 - Notebook");
        recomendador.adicionarRecomendacao("Produto 3 - Fones de Ouvido");
        recomendador.adicionarRecomendacao("Produto 4 - Câmera");
        
        // Exibindo todas as recomendações
        System.out.println("Lista de Recomendações:");
        recomendador.exibirRecomendacoes();
        
        // Removendo um produto da lista de recomendações
        System.out.println("\nRemovendo um produto...");
        recomendador.removerRecomendacao("Produto 2 - Notebook");
        
        // Exibindo novamente as recomendações após remoção
        System.out.println("\nLista de Recomendações após remoção:");
        recomendador.exibirRecomendacoes();
        
        // Obtendo um item específico da lista
        System.out.println("\nObtendo o produto na posição 1:");
        System.out.println(recomendador.obterRecomendacao(1));
        
        // Verificando o tamanho da lista de recomendações
        System.out.println("\nTamanho da lista de recomendações: " + recomendador.obterTamanhoLista());
    }
}
