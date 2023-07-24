package treinando.chatgpt;

import java.util.Random;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Soma
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão (resultando em um número inteiro)
        int divisaoInteira = a / b;
        System.out.println("Divisão inteira: " + divisaoInteira);

        // Divisão (resultando em um número de ponto flutuante)
        double divisao = (double) a / b;
        System.out.println("Divisão: " + divisao);

        // Resto da divisão (módulo)
        int resto = a % b;
        System.out.println("Resto da divisão: " + resto);

        // Incremento
        a++;
        System.out.println("Incremento: " + a);

        // Decremento
        b--;
        System.out.println("Decremento: " + b);

        // Potenciação
        double potencia = Math.pow(a, b);
        System.out.println("Potenciação: " + potencia);

        // Raiz quadrada
        double raizQuadrada = Math.sqrt(a);
        System.out.println("Raiz quadrada: " + raizQuadrada);

        // Arredondamentos
        double valor = 3.14159;
        double arredondamentoCima = Math.ceil(valor);
        double arredondamentoBaixo = Math.floor(valor);
        double arredondamentoProximo = Math.round(valor);
        System.out.println("Arredondamento para cima: " + arredondamentoCima);
        System.out.println("Arredondamento para baixo: " + arredondamentoBaixo);
        System.out.println("Arredondamento para o número mais próximo: " + arredondamentoProximo);

        // Número aleatório usando Math.random()
        int numeroAleatorio1 = (int) (5 + Math.random() * (10 - 5));
        System.out.println("Número aleatório (Math.random()): " + numeroAleatorio1);

        // Número aleatório usando Random.nextInt()
        Random random = new Random();
        int numeroAleatorio2 = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        System.out.println("Número aleatório (Random.nextInt()): " + numeroAleatorio2);
    }
}
