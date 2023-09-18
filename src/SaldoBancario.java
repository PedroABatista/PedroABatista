import java.util.Scanner;

public class SaldoBancario {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Pedro Batista";

        String tipoConta = "Corrente";

        double saldo = 2500.0;

        String receber;

        String transferir;

        int menu;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");


        while ( true ) {

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");

             menu = leitura.nextInt();


             switch (menu){
                 case 1: {
                     System.out.println("Seu saldo é : " + saldo);
                     break;
                 }
                 case 2: {
                     System.out.println("Qual valor você recebeu? ");

                     receber = leitura.next();

                     if (receber.matches("[^0-9]")){
                         System.out.println("Isso não é permitido.");
                         break;
                     }

                     saldo += Double.valueOf(receber);

                     System.out.println("Seu saldo agora é : " + saldo);
                     break;
                 }
                 case 3: {
                     System.out.println("Qual valor você quer transferir? ");

                     transferir = leitura.next();

                     if (transferir.matches("[^0-9]")){
                         System.out.println("Isso não é permitido.");
                         break;
                     } else if (Double.valueOf(transferir) > saldo) {
                         System.out.println("Você não tem saldo suficiente para essa transferencia : ");
                         break;
                     }


                     saldo -= Double.valueOf(transferir);

                     System.out.println("Seu Saldo agora é : " + saldo);
                     break;
                 }
                 case 4: {
                     System.out.println("fechando");
                     return;
                 }
                 default: {
                     System.out.println("Valor inválido favor digite um número do menu!");
                 }
             }

        }

    }
}