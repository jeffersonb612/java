package atividade;

import java.util.Scanner;

public class CodigoGTIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            exibirCabecalho();
            System.out.println("1. Validar código GTIN-13");
            System.out.println("2. Identificar país");
            System.out.println("0. Sair");
            System.out.println("===============================");
            System.out.print("Digite a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    exibirCabecalho();
                    System.out.println("VALIDAR CÓDIGO");
                    validarCodigo(input);
                    break;
                case 2:
                    exibirCabecalho();
                    System.out.println("IDENTIFICAR PAÍS");
                    identificarPais(input);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        input.close();
        System.out.println("Fim do programa.");
    }

    public static void exibirCabecalho() {
        System.out.println("===============================");
        System.out.println("         VAREJOS S/A           ");
        System.out.println("  (código GTIN-13/UPC/EAN-13)  ");
        System.out.println("===============================");
    }

    public static void validarCodigo(Scanner input) {
        input.nextLine();
        System.out.print("Digite o código GTIN-13 (13 dígitos): ");
        String codigo = input.nextLine();

        if (codigo.length() == 13) {
            if (validarGTIN13(codigo)) {
                System.out.println("NÚMERO GTIN-13 VÁLIDO");
            } else {
                System.out.println("NÚMERO GTIN-13 INVÁLIDO");
            }
        } else {
            System.out.println("O número GTIN-13 não possui 13 dígitos.");
        }
    }

    private static boolean validarGTIN13(String codigo) {
        int digitoVerificador = Character.getNumericValue(codigo.charAt(12));

        int soma = 0;
        for (int i = 0; i < 12; i++) {
            int multiplicador = (i % 2 == 0) ? 1 : 3;
            soma += Character.getNumericValue(codigo.charAt(i)) * multiplicador;
        }

        int resto = soma % 10;
        int verificadorCalculado = (resto == 0) ? 0 : 10 - resto;

        return verificadorCalculado == digitoVerificador;
    }

    private static void identificarPais(Scanner input) {
        input.nextLine();
        System.out.print("Digite o código GTIN-13: ");
        String codigo = input.nextLine();

        if (codigo.length() == 13) {
            String pais = identificarPaisPorPrefixo(codigo);
            System.out.println("País: " + pais);
        } else {
            System.out.println("O número GTIN-13 não possui 13 dígitos.");
        }
    }

    private static String identificarPaisPorPrefixo(String codigo) {
        String prefixo = codigo.substring(0, 3);
        switch (prefixo) {
            case "789":
            case "790":
                return "Brasil";
            case "779":
                return "Argentina";
            case "773":
                return "Uruguai";
            case "780":
                return "Chile";
            case "784":
                return "Paraguai";
            case "786":
                return "Equador";
            case "770":
                return "Colômbia";
            case "743":
                return "Nicarágua";
            case "600":
            case "601":
                return "África do Sul";
            default:
                return "País desconhecido";
        }
    }
}
