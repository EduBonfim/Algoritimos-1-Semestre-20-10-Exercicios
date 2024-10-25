import java.util.Scanner;

public class Exercicio4 {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner ParOuImpar = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            numero = ParOuImpar.nextInt();

            if (numero == -1) {
                break;
            }

            if (isPar(numero)) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }
    }
}
