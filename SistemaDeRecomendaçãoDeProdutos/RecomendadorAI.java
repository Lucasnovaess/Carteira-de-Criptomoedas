package SistemaDeRecomendaçãoDeProdutos;

public class RecomendadorAI {
    
    private ListaRecomendacoes listaRecomendacoes;

    public RecomendadorAI() {
        listaRecomendacoes = new ListaRecomendacoes();
    }

    // Adiciona um produto à lista de recomendações
    public void adicionarRecomendacao(String produto) {
        listaRecomendacoes.Adicionar(produto);
    }

    // Remove um produto da lista de recomendações
    public void removerRecomendacao(String produto) {
        listaRecomendacoes.Remover(produto);
    }

    // Obtém um produto específico da lista de recomendações
    public String obterRecomendacao(int indice) {
        return listaRecomendacoes.ObterItem(indice);
    }

    // Exibe todas as recomendações
    public void exibirRecomendacoes() {
        for (int i = 0; i < listaRecomendacoes.TamanhoLista(); i++) {
            System.out.println(listaRecomendacoes.ObterItem(i));
        }
    }
    
    // Verifica o tamanho da lista de recomendações
    public int obterTamanhoLista() {
        return listaRecomendacoes.TamanhoLista();
    }
}
