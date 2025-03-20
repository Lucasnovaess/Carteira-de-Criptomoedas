package PedidoOnline;

public class PedidoOnline {
    // Atributos
    private String produto;
    private double precoUnitario;
    private int quantidade;

    // Construtores
    public PedidoOnline(String produto, double precoUnitario) {
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = 1;
    }

    public PedidoOnline(String produto, double precoUnitario, int quantidade) {
        this.produto = produto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Método Status
    public void status() {
        System.out.println("Sobre o pedido:");
        System.out.println("Produto: " + this.getProduto());
        System.out.println("Preço: " + this.getPrecoUnitario());
        System.out.println("Quantidade: " + this.getQuantidade());
    }

    // Getter e Setters
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        
        PedidoOnline pedido1 = new PedidoOnline("Teclado", 120.00);
        PedidoOnline pedido2 = new PedidoOnline("Mouse", 80.00, 3);

        pedido1.status();
        System.out.println("-----------");
        pedido2.status();

    }

}
