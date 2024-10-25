  import java.util.Scanner;
        
    public class Exercicio3 {
    public static void main(String[] args) {
            Scanner Numeros = new Scanner(System.in);
    
            System.out.print("Digite o primeiro número: ");
            int numero1 = Numeros.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int numero2 = Numeros.nextInt();
                
            int maiorNumero = encontrarMax(numero1, numero2);
            System.out.println("O maior número é: " + maiorNumero);
        }
    
    public static int encontrarMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
        
    }

    
}