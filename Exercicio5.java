import java.util.Scanner;

public class Exercicio5 {

    public static String exibirDiaSemana(int numero) {
    String dia;

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia da semana inválido";
        }

        return dia;
    }

    public static void main(String[] args) {
        Scanner Dias = new Scanner(System.in);

        // Pedir ao usuário para inserir o número correspondente ao dia da semana
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int numeroDia = Dias.nextInt();

        // Chamar o método exibirDiaSemana e imprimir o resultado
        String resultado = exibirDiaSemana(numeroDia);
        System.out.println("Dia da semana: " + resultado);
    }
}