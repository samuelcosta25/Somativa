package Somativa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Situacoes objeto = new Situacoes();
        System.out.println("Digite qual situação de aprendizagem proposta deseja executar: ");
        int situacao = read.nextInt();
        switch (situacao) {
            case 1:
                objeto.situacao1();
                break;
            case 2:
                objeto.situacao2();
                break;
            case 3:
                objeto.situacao3();
                break;
            default:
                System.out.println("ERRO! Digite um número válido.");
                break;
        }
        read.close();
    }

}
