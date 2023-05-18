import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNome("fernando");
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setNome("fernando");

        ATM atmCC = new ATM(cc1);

        ATM atmCP = new ATM(cp1);

        loop: while(true){
            System.out.println("Escolha o tipo de conta: ");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupanca");
            System.out.println("3 - Sair");

            int selection = input.nextInt();
            switch (selection){
                case 1:
                    atmCC.exibirMenu();
                    atmCC.realizarOperacao();
                    break;
                case 2:
                    atmCP.exibirMenu();
                    atmCP.realizarOperacao();
                    break;
                case 3:
                    System.out.println("Obrigado!! Ate logo!");
                    break loop;
            }
        }
    }
}

