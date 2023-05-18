import java.util.Scanner;

public class ContaCorrente implements Conta {
    private String nome;
    private double saldo;
    Scanner input = new Scanner(System.in);
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

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
