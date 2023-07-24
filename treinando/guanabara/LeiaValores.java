package treinando.guanabara;

import java.util.Scanner;

public class LeiaValores {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int soma = 0;
        for (int i = 1; i <= 5; i++){
            int valor = input.nextInt();
            soma += valor;
        }
        System.out.println(soma);
        input.close();
    }
}
