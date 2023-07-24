package treinando.chatgpt;

import java.util.Scanner;

public class ExemploLoopsCondicoes {
    public static void main(String[] args) {
        // Exemplo de loop for
        System.out.println("Exemplo de loop for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Exemplo de loop while
        System.out.println("Exemplo de loop while:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        System.out.println();

        // Exemplo de loop do-while
        System.out.println("Exemplo de loop do-while:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        System.out.println();

        // Exemplo de estrutura condicional if-else
        System.out.println("Exemplo de estrutura condicional if-else:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }
        System.out.println();

        // Exemplo de estrutura condicional switch-case
        System.out.println("Exemplo de estrutura condicional switch-case:");
        System.out.print("Digite um dia da semana (1-7): ");
        int dia = scanner.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
        System.out.println();

        // Exemplo de uso do break e continue
        System.out.println("Exemplo de uso do break e continue:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                continue; // Pula para a próxima iteração
            }
            if (x == 4) {
                break; // Sai do loop
            }
            System.out.println(x);
        }
        System.out.println();

        // Fechando o Scanner
        scanner.close();
    }
}
