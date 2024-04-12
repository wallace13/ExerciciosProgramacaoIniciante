package Java;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus Fahrenhei: ");
        double fahrenhei = scanner.nextDouble();
        double celsius = (fahrenhei - 32)* 5/9;

		System.out.println("Temperatura em Fahrenhei: "+ fahrenhei);
        System.out.println("Temperatura em Celsius:   "+ celsius);
        scanner.close();
	}
}
