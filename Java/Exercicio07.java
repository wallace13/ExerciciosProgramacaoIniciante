package Java;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma= 0;

        double[] valores = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe um valor" + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }
        for (double valor : valores) {
            soma += valor;
        }

        System.out.print("Média Aritmética: "+(soma/valores.length));
        scanner.close();
    }
}
