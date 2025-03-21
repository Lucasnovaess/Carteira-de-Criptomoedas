package SistemaDePagamentoDigital;

public class executando {
    
    public static void main(String[] args) {
        
        Pagamento pagamentoGenerico = new Pagamento();
        Pagamento pagamentoPix = new PagamentoPix();
        Pagamento pagamentoCartao = new PagamentoCC();

        System.out.println(pagamentoGenerico.processarPagamento(190.00));
        System.out.println(pagamentoPix.processarPagamento(500.00));
        System.out.println(pagamentoCartao.processarPagamento(1300.50));

    }
}
