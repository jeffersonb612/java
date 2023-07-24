package treinando.guanabara;
import java.util.Scanner;
public class primeiro {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("digite o nome do aluno :"); 
            String nome = teclado.nextLine();
            System.out.print("digite a nota do aluno :");
            float nota = teclado.nextFloat();
            System.out.format("a nota de %s é %s",nome ,nota);
        }

    }
}
