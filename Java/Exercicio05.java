package Java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu salário atual: ");
        double salarioAtual = scanner.nextDouble();

        double salarioAtualizado = salarioAtual * (1+0.15);
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
		System.out.println("Salário atualizado: "+ formatoMoeda.format(salarioAtualizado));

        scanner.close();
	}
}
