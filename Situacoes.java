package Somativa;

import java.util.Scanner;

public class Situacoes {
    Scanner scan = new Scanner(System.in);

    public void situacao1() {

        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextDouble();
        System.out.println(
                "Digite a operação aritmética que deseja realizar: 1-Adição / 2-Subtração / 3-Divisão / 4-Multiplicação:  ");
        int operacao = scan.nextInt();
        double resultado;
        char operador;
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                operador = '+';
                System.out.println("O resultado da operação solicitada: " + numero1 + operador + numero2 + " é igual a "
                        + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                operador = '-';
                System.out.println("O resultado da operação solicitada: " + numero1 + operador + numero2 + " é igual a "
                        + resultado);
                break;
            case 3:
                resultado = numero1 / numero2;
                operador = '/';
                System.out.println("O resultado da operação solicitada: " + numero1 + operador + numero2 + " é igual a "
                        + resultado);
                break;
            case 4:
                resultado = numero1 * numero2;
                operador = '*';
                System.out.println("O resultado da operação solicitada: " + numero1 + operador + numero2 + " é igual a "
                        + resultado);
                break;
            default:
                System.out.println("ERRO! Digite um número válido.");
                break;
        }

    }

    public void situacao2() {
        System.out.println("Digite o número de matricula do aluno: ");
        long matricula = scan.nextLong();
        if (matricula % 4 == 0) {
            System.out.println("Aluno designado para o Time do Chris!"); // Critério: matrícula ser divisível por 4
        } else if (matricula % 4 == 1) {
            System.out.println("Aluno designado para o Time do Greg!"); // Critério: resto igual a 1 da divisão da
            // matrícula por 4
        } else if (matricula % 4 == 2) {
            System.out.println("Aluno designado para o Time do Caruso!"); // Critério: resto igual a 2 da divisão da
                                                                          // matrícula por 4
        } else if (matricula % 4 == 3) {
            System.out.println("Aluno designado para o Time do Jerome!"); // Critério: resto igual a 3 da divisão da
                                                                          // matrícula por 4
        } else {
            System.out.println("ERRO! Digite um número de matrícula válido");
        }
    }

    public void situacao3() {
        System.out.println("Digite a quantidade em Kg de morangos que foram comprados: ");
        double Qmorango = scan.nextDouble();
        System.out.println("Digite a quantidade em Kg de maças que foram compradas: ");
        double Qmaca = scan.nextDouble();
        System.out.println("Digite a quantidade em Kg de morango que foram compradas: ");
        double Qbanana = scan.nextDouble();
        double pesoTotal = Qmorango + Qmaca + Qbanana;
        double Pmorango = 2.5 * Qmorango;
        double Pmaca = 1.8 * Qmaca;
        double Pbanana = 1.3 * Qbanana;
        double preco = Pmorango + Pmaca + Pbanana;
        if (preco > 25 || pesoTotal > 8) {
            preco -= preco * 0.1;
            System.out.println("O valor final a ser pago pelo cliente é de: R$" + preco);
        } else if (preco <= 25 || pesoTotal <= 8) {
            System.out.println("O valor final a ser pago pelo cliente é de: R$" + preco);
        } else {
            System.out.println("ERRO! Digite os valores novamente.");
        }
    }

}
