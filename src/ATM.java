import java.util.Scanner;

public class ATM {
    Scanner input = new Scanner(System.in);
    private Conta conta;

    public ATM(Conta conta) {
        this.conta = conta;
    }

    public void exibirMenu() {
        System.out.println("BEM VINDO " + conta.getNome());
        System.out.println(" 1 - Depositar.");
        System.out.println(" 2 - Sacar.");
        System.out.println(" 3 - Ver saldo.");
        System.out.println(" 4 - Sair.");
    }

    public void realizarOperacao() {
        int selection = input.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Quanto voce quer depositar?");
                    double valor = input.nextDouble();
                    if (valor > 0) {
                        conta.realizarDeposito(valor);
                        System.out.println(valor + " foram depositado na sua conta! Seu saldo atual e de : " + conta.verificarSaldo());
                    }else {
                        System.out.println("Valor deve ser maior que 0!");
                    }
                    realizarOperacao();
                    break;
                case 2:
                    System.out.println("Quanto voce quer sacar?");
                    double valor2 = input.nextDouble();
                    if (valor2 <= conta.verificarSaldo()) {
                        conta.realizarSaque(valor2);
                        System.out.println("Voce sacou : " +valor2 + "! Seu saldo atual e de : "+ conta.verificarSaldo());
                    }else{
                    System.out.println("Favor informar um valor menor que " + conta.verificarSaldo());
                    }
                    realizarOperacao();
                    break;
                case 3:
                    System.out.println("Seu saldo atual e de " + conta.verificarSaldo());
                    realizarOperacao();
                    break;
                case 4:
                    System.out.println("Obrigado por usar meu ATM seu desgracado");
                    break;
            }
    }
}