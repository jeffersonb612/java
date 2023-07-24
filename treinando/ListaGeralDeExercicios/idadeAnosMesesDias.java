package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

public class idadeAnosMesesDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite sua idade em anos :");
        int anos = input.nextInt();

        System.out.print("digite sua idade em meses :");
        int meses = input.nextInt();

        System.out.print("digite sua idade em dias :");
        int dias = input.nextInt();

        int soma = (anos*365) + (meses * 30) + dias;
        
        System.out.println("O total e de " + soma);

        input.close();
    }
}
