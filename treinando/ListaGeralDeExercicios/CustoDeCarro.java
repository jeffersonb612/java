package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor. */

public class CustoDeCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o custo de fábrica : R$");
        double custo = input.nextDouble();

        double distribuidor = custo * 0.28;
        double impostos = custo * 0.45;
        
        System.out.println("O custo de um carro novo e de R$" + (custo + distribuidor + impostos));

        input.close();
    }
}
