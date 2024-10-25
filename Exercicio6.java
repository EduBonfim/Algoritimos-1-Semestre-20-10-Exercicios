import java.util.Scanner;

public class Exercicio6 {

    
    public static int maiorValor(int[] vetor) {
        int max = vetor[0];  
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];  // Atualiza se achar um número maior
            }
        }
        return max;
    }

   
    public static int menorValor(int[] vetor) {
        int min = vetor[0];  
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];  // Atualiza se achar um número menor
            }
        }
        return min;
    }

    
    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);  
        int min = menorValor(vetor);  
        return (max + min) / 2.0;  // Calcula a média e retorna
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer no vetor? ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Maior valor: " + maiorValor(numeros));
        System.out.println("Menor valor: " + menorValor(numeros));
        System.out.println("Média entre o maior e o menor valor: " + mediaMaxMin(numeros));
    }
}
