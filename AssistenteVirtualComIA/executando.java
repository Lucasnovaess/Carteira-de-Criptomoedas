package AssistenteVirtualComIA;

public class executando {
    
    public static void main(String[] args) {
        
        AssistenteVirtual av = new AssistenteVirtual();
        AssistenteFinanceiro af = new AssistenteFinanceiro();

        System.out.println(av.responderPergunta("Por que o Sol é quente?"));
        System.out.println(af.responderPergunta("saldo"));
        System.out.println(af.responderPergunta("investimento"));

    }

}
