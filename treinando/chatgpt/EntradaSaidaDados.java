package treinando.chatgpt;

import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite seu nome
        System.out.print("Digite seu nome: ");

        // Ler o nome digitado pelo usuário
        String nome = scanner.nextLine();

        // Solicitar ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");

        // Ler a idade digitada pelo usuário
        int idade = scanner.nextInt();
        
        // Limpar o buffer do Scanner após a leitura do número inteiro
        scanner.nextLine();

        // Solicitar ao usuário que digite um número decimal
        System.out.print("Digite um número decimal: ");

        // Ler o número decimal digitado pelo usuário
        double numeroDecimal = scanner.nextDouble();
        
        // Limpar o buffer do Scanner após a leitura do número decimal
        scanner.nextLine();

        // Solicitar ao usuário que digite um caractere
        System.out.print("Digite um caractere: ");

        // Ler o caractere digitado pelo usuário
        char caractere = scanner.nextLine().charAt(0);

        // Solicitar ao usuário que digite um valor booleano
        System.out.print("Digite um valor booleano (true ou false): ");

        // Ler o valor booleano digitado pelo usuário
        boolean valorBooleano = scanner.nextBoolean();
        
        // Limpar o buffer do Scanner após a leitura do valor booleano
        scanner.nextLine();

        // Solicitar ao usuário que digite um número float
        System.out.print("Digite um número float: ");

        // Ler o número float digitado pelo usuário
        float numeroFlutuante = scanner.nextFloat();
        
        // Limpar o buffer do Scanner após a leitura do número float
        scanner.nextLine();

        // Solicitar ao usuário que digite um número longo
        System.out.print("Digite um número longo: ");

        // Ler o número longo digitado pelo usuário
        long numeroLongo = scanner.nextLong();
        
        // Limpar o buffer do Scanner após a leitura do número longo
        scanner.nextLine();

        // Solicitar ao usuário que digite um valor byte
        System.out.print("Digite um valor byte: ");

        // Ler o valor byte digitado pelo usuário
        byte valorByte = scanner.nextByte();
        
        // Limpar o buffer do Scanner após a leitura do valor byte
        scanner.nextLine();

        // Solicitar ao usuário que digite um valor short
        System.out.print("Digite um valor short: ");

        // Ler o valor short digitado pelo usuário
        short valorShort = scanner.nextShort();
        
        // Limpar o buffer do Scanner após a leitura do valor short
        scanner.nextLine();

        // Exibir os dados informados pelo usuário
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Caractere: " + caractere);
        System.out.println("Valor Booleano: " + valorBooleano);
        System.out.println("Número Float: " + numeroFlutuante);
        System.out.println("Número Longo: " + numeroLongo);
        System.out.println("Valor Byte: " + valorByte);
        System.out.println("Valor Short: " + valorShort);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
