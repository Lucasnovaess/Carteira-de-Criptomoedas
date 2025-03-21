package AssistenteVirtualComIA;

public class AssistenteFinanceiro extends AssistenteVirtual {
    
    @Override
    public String responderPergunta(String pergunta) {
        if (pergunta.toLowerCase().contains("saldo")) {
            return "Seu saldo atual é de R$ 1.500,00.";
        } else if (pergunta.toLowerCase().contains("investimento")) {
            return "Seus investimentos estão rendendo 10% ao ano.";
        } else {
            return super.responderPergunta(pergunta); // Chama o método da superclasse
        }
    }

}
