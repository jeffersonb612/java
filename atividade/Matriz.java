package atividade;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat [][] = new int [2][2];

        for(int i = 0 ; i < 2; i++){
            for(int j = 0; j < 2; j++){
            mat [i][j] = input.nextInt();
            }
        }
        for(int i = 0 ; i < 2; i++){
            for(int j = 0; j < 2; j++){
            System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
    input.close();
    }
}
