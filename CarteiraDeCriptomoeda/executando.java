package CarteiraDeCriptomoeda;

public class executando {
    
    public static void main(String[] args) {
        
        CarteiraCripto cp = new CarteiraCripto("3421", "Lucas Novaes", 0.234356689);

        cp.adicionarBitcoin(0.23424);
        cp.sacarBitcoin(0.345673);

    }

}
