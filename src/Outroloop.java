import java.util.Scanner;

public class Outroloop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0.0;
        double nota = 0.0;
        int totalDeNotas = 0;

        while(nota != -1.0) {
            System.out.println("Digite sua avaliação ou -1 para encerrar : ");
            nota = leitura.nextDouble();
            if (nota != -1.0) {
                mediaAvaliacao += nota;
                ++totalDeNotas;
            }
        }

        System.out.println("Média de avaliações : " + mediaAvaliacao / (double)totalDeNotas);
    }
}
