package SistemaDePagamentoDigital;

public class PagamentoCC extends Pagamento {

    @Override
    public String processarPagamento(double valor) {
        return "O pagamento de R$" + valor + " via cartão de crédito foi realizado com sucesso!";
    }
    
}
