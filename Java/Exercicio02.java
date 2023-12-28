package Java;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma= 0, multiplicacao = 1;

        double[] valores = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe um valor" + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }
        for (double valor : valores) {
            //multiplicacao = valor * multiplicacao;
            multiplicacao *= valor;
            //soma = valor + soma;
            soma += valor;
        }

        System.out.print("a) Resultado de suas adições: "+soma+"\n");
        System.out.print("b) Resultado de suas multiplicações: "+multiplicacao);
        scanner.close();
    }
}
