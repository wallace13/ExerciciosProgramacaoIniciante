package Java;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em dolar: ");
        double dolar = scanner.nextDouble();

        double real = dolar * 4.8931;
        //1 Dólar dos Estados Unidos/USD (220) = 4,8931 Real/BRL (790)
		System.out.println("Valor em real: R$"+ real);

        scanner.close();
	}
}
