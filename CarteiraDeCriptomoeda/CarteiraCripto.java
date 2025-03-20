package CarteiraDeCriptomoeda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarteiraCripto {

    // Atributos
    private final String enderecoCarteira; // identificador único da carteira
    private String dono; // nome do proprietário da carteira
    private double saldoBitcoin; // quantidade de Bitcoins na carteira

    // Método Construtor
    public CarteiraCripto (String enderecoCarteira, String dono, Double saldoBitcoin) {
        this.enderecoCarteira = enderecoCarteira;
        this.dono = dono;
        this.saldoBitcoin = saldoBitcoin;
    }

    // Metodos
    public void adicionarBitcoin(double bitcoin) {
        if (bitcoin <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        else {
            this.setSaldoBitcoin(this.getSaldoBitcoin() + bitcoin);
            System.out.println("Valor adicionado com sucesso!");
            System.out.println("Saldo atual: " + this.getSaldoBitcoin());
        }
    }

    public double sacarBitcoin(double bitcoin) {
        if (bitcoin > this.getSaldoBitcoin()) {
            System.out.println("O valor de saque é maior que a quantiade na conta");
            return -1;
        }
        else {
            this.setSaldoBitcoin(this.getSaldoBitcoin() - bitcoin);
            System.out.println("Saque de " + bitcoin + " bitcoins realizado com sucesso!");
            System.out.println("Saldo atual: " + this.getSaldoBitcoin());
            return this.getSaldoBitcoin();
        }
    }

    // Métodos Getters e Setters
    public String getEnderecoCarteira() {
        return this.enderecoCarteira;
    }

    public double getSaldoBitcoin() {
        BigDecimal saldoFormatado = new BigDecimal(this.saldoBitcoin) // Converte o double para BigDecimal (mantém precisão total)
                                    .setScale(8, RoundingMode.HALF_UP); // // Define 8 casas decimais com arredondamento
        return saldoFormatado.doubleValue(); // Retorna o valor como double
    }

    public void setSaldoBitcoin(double saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        if (dono == null || dono.trim().isEmpty()) {
            // trim() remove espaços em branco / isEmpty() verifica se o campo está vazio
            System.out.println("O nome do dono não pode ser vazio!");
            return;
        } 
        this.dono = dono;
    }

}
