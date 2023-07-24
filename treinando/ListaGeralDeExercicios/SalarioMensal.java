package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e escrever o valor do novo salário.  */

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite o seu salario mensal :");
        double salario = input.nextDouble();
        
        input.nextLine();

        System.out.print("digite o percentual de reajuste :");
        double percentual = input.nextDouble();

        double reajust = salario + ((percentual / 100.0) * salario);

        System.out.println("O proximo salario com reajuste sera de " + reajust);

        input.close();
    }
}
