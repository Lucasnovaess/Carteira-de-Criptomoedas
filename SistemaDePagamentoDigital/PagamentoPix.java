package SistemaDePagamentoDigital;

public class PagamentoPix extends Pagamento {
    
    @Override
    public String processarPagamento(double valor) {
        return "O pagamento de R$" + valor + " via PIX foi realizado com sucesso!";
    }

}
