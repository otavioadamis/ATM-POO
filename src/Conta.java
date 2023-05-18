public interface Conta {
    double verificarSaldo();
    void realizarDeposito(double valor);
    void realizarSaque(double valor);

    String getNome();
}
