package CarteiraDeCriptomoeda;

public class ConversorCripto {
    
    // Atributos
    double USD;
    double Ethereum;
    double XRP;
    double Tether;
    double BTC;
    double BRL;

    // Métodos
    
    // Bitcoin para USD
    public void converter(double btc) {
        this.setUSD(btc * 85749.05);
    }

    // Bitcoin para outra criptomoeda
    public void converter(double btc, String paraCripto) {
        switch (paraCripto) {
            case "Ethereum":
                this.setEthereum(btc * 41.97);
                break;
            case "XRP":
                this.setXRP(btc * 34233.68);
                break;
            case "Tether":
                this.setTether(btc * 85635.47);
                break;
        }
    }

    // Reais (BRL) para Bitcoin
    public void converter(double valorReais, double precoBTC) {
        this.setBTC(valorReais * precoBTC);
    }

    // Getters e Setters
    public double getUSD() {
        return this.USD;
    }

    public void setUSD(double valor) {
        this.USD = valor;
    }

    public double getEthereum() {
        return this.Ethereum;
    }

    public void setEthereum(double valor) {
        this.Ethereum = valor;
    }
    
    public double getXRP() {
        return this.XRP;
    }

    public void setXRP(double valor) {
        this.XRP = valor;
    }

    public double getBTC() {
        return this.BTC;
    }

    public void setBTC(double valor) {
        this.BTC = valor;
    }

    public double getTether() {
        return this.Tether;
    }

    public void setTether(double valor) {
        this.Tether = valor;
    }

    public double getBRL() {
        return this.BRL;
    }

    public void setBRL(double valor) {
        this.BRL = valor;
    }

}
