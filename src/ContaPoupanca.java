public class ContaPoupanca implements Conta {
    private String nome;
    private double saldo;
    @Override
    public double verificarSaldo() {
        return this.saldo;
    }
    @Override
    public void realizarDeposito(double valor) {
        this.saldo += valor;
    }
    @Override
    public void realizarSaque(double valor) {
        this.saldo -= valor;
    }
    @Override
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
