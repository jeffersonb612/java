package treinando.ListaGeralDeExercicios;

import java.util.Scanner;
/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
área do retângulo. */

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("escreva a altura do quadrado :");
        int altura = input.nextInt();

        System.out.print("Agora digite o tamanho da base :");
        int base = input.nextInt();

        int area = base * altura;
        System.out.println("A area do quadrado e de " + area);

        input.close();
    }
}
