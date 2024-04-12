package Java;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número Inteiro: ");
        int number = scanner.nextInt();

		System.out.println("Número Informado:  "+ number);
        System.out.println("Número Antecessor: "+ (number-1));
        System.out.println("Número Sucessor:   "+ (number+1));
        scanner.close(); 
	}
}
