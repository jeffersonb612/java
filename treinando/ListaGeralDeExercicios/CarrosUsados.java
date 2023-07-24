package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas 
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
vendedor. */

public class CarrosUsados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantia total de carros que vocé vendeu ? :");
        int carros = input.nextInt();

        System.out.print("Digite o valor total de suas vendas : R$");
        double vendas = input.nextDouble();
        vendas *= 0.05;

        System.out.print("Digite o seu salario fixo : R$");
        double salario = input.nextDouble();

        System.out.print("digite o valor que vocé recebe por carro vendido : R$");
        double valorcarro = input.nextDouble();
        double comicao = carros * valorcarro;

        double total = salario + vendas + comicao;
        System.out.println("o salario total sera de : R$" + total);

        input.close();
    }
}
