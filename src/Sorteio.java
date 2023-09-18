import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public Sorteio() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = (new Random()).nextInt(100);
        int tentativas = 0;

        while(tentativas != 5) {
            System.out.println("Digite sua avaliação um número : ");
            int numero = leitura.nextInt();
            ++tentativas;
            if (numero == aleatorio) {
                System.out.println("Parabéns acertou");
                break;
            }

            if (numero > aleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Perdeu o número correto era : " + aleatorio);
        }

    }
}