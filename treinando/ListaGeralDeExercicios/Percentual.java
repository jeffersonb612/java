package treinando.ListaGeralDeExercicios;

import java.util.Scanner;

/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos 
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total 
de eleitores. */

public class Percentual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o numero total de eleitores do municipio ? :");
        int eleitores = input.nextInt();

        System.out.print("Digite o nmero total de votos brancos :");
        int votosbrancos = input.nextInt();

         System.out.print("Digite o nmero total de votos nulos :");
        int votosnulos = input.nextInt();
        
         System.out.print("Digite o nmero total de votos válidos :");
        int votosvalidos = input.nextInt();
        
        int PercentualVotosBrancos = (votosbrancos * 100) /eleitores ;
        int PercentualVotosNulos = (votosnulos * 100) /eleitores ;
        int PercentualVotosValidos = (votosvalidos * 100) /eleitores ;

        System.out.println("O percentual de votos brancos :" + PercentualVotosBrancos + "%");
        System.out.println("O percentual de votos nulos :" + PercentualVotosNulos + "%");
        System.out.println("O percentual de votos válidos :" + PercentualVotosValidos + "%");

        input.close();
    }
}