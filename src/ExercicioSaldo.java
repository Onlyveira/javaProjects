import java.util.Scanner;

public class ExercicioSaldo {

    public static void main(String[] args) {

        String nomeCliente = "Leandro";
        Double saldoCliente = 750.80;
        boolean contaCorrente = true;
        int tentativas = 0;


        // ***************************
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a sua senha:");
        int  senhaConta = scanner.nextInt();

        while (senhaConta != 7452) {
            System.out.println("Senha incorreta, tente novamente");
            senhaConta = scanner.nextInt();
            tentativas++;
            System.out.println(tentativas);
        } if (tentativas == 2){
            System.out.println("Você atingiu o limite de tentativas, conta bloqueada");
        }

        if (senhaConta == 7452) {
            System.out.println("\n *************");
            System.out.println("Cliente " + nomeCliente);
            System.out.println("Saldo disponível na conta: " + saldoCliente);
            if (contaCorrente == true) {
                System.out.println("Conta corrente");
            } else {
                System.out.println("Conta poupança");
            }
            System.out.println(" **************");

            System.out.println("Selecione uma das 4 operações");
            System.out.println("1: operacao sacar");
            System.out.println("2: operacao depositar");
            System.out.println("3: operacao consultar saldo");
            System.out.println("4: operacao sair");


            int operacaoConta = scanner.nextInt();

             while(operacaoConta != 4){
                 operacaoConta = scanner.nextInt();

                 switch (operacaoConta){

                     case 1:
                         System.out.println("Quanto deseja sacar?");
                         double valorSacado = scanner.nextDouble();
                         double valorSacadoFinal = valorSacado - saldoCliente;
                         System.out.println(valorSacadoFinal);
                 }
             }
        }
    }}
