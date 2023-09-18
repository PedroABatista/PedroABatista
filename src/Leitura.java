import java.util.Scanner;

public class Leitura {
    public Leitura() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual sua nota para o filme? ");
        double avaliacao = leitura.nextDouble();
        System.out.println("Seu filme favorito é : " + filme);
        System.out.println("O ano de lançamento dele é : " + anoDeLancamento);
        System.out.println("A sua nota para esse filme é : " + avaliacao);
    }
}