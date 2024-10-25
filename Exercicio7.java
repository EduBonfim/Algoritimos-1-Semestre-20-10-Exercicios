import java.util.Scanner;

public class Exercicio7 {

    
    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner NumFator = new Scanner(System.in);

        // Lendo um número do usuário
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = NumFator.nextInt();

        // Calculando e exibindo o fatorial
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
