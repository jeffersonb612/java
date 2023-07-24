package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.  */
public class Antecessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite um numero :");
        int numero = input.nextInt();

        System.out.println("o antecessor e " + --numero);
        input.close();
    }
}
