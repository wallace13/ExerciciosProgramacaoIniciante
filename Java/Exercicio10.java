package Java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe valor da Prestação: ");
        double valor = scanner.nextDouble();
        System.out.print("Informe o tempo de atraso da Prestação: ");
        double tempo = scanner.nextDouble();
        System.out.print("Informe o valor da Taxa de Atraso: ");
        double taxa = scanner.nextDouble();

        double prestacao = valor+(valor*(taxa/100)*tempo);
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
		System.out.println("Valor da Prestação com Atraso é de: "+ formatoMoeda.format(prestacao));

        scanner.close();
	}
}
