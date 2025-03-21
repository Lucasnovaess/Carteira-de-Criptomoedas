package SistemaDeRecomendaçãoDeProdutos;

public class ListaRecomendacoes {
    
    private int contador = 0;
    private String ListaRecomendacoes[] = new String[10];

    // Métodos
    // Adicionar 
    public void Adicionar(String elemento) {
        if (contador >= ListaRecomendacoes.length) {
            aumentarCapacidade();
        }
        else {
            ListaRecomendacoes[contador] = elemento;
            contador++;
        }
    }
    
    // Remover
    public void Remover(String elemento) {
        for (int i = 0; i < ListaRecomendacoes.length; i++) {
            if (ListaRecomendacoes[i].equals(elemento)) {
                for (int j = i + 1; j < ListaRecomendacoes.length; j++) {
                    ListaRecomendacoes[j - 1] = ListaRecomendacoes[j];
                }
                ListaRecomendacoes[contador - 1] = null; // Defina o último item como null
                contador--;
                System.out.println("O elemento: " + elemento + " foi removido");
                break;
            }
        }
    }
    
    // Obter um item 
    public String ObterItem(int elemento) {
        if (elemento < 0 || elemento >= contador) {
            return "Não existe um elemento na posição " + elemento;
        }
        else {
            return "O item retornado na posição " + elemento + " é: " + ListaRecomendacoes[elemento];
        }
    }
    
    // Verificar o tamanho da lista
    public int TamanhoLista() {
        return getContador();
    }

    // Aumentar a capacidade do Array
    public void aumentarCapacidade() {
        String novoArray[] = new String[ListaRecomendacoes.length * 2];

        for (int i = 0; i < ListaRecomendacoes.length; i++) {
            novoArray[i] = ListaRecomendacoes[i];
        }

        ListaRecomendacoes = novoArray;
        System.out.println("Capacidade aumentada. Novo tamanho: " + ListaRecomendacoes.length);
    }

    // Getters e Setters
    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
