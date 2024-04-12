package Java;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número Inteiro: ");
        int number = scanner.nextInt();

		System.out.println("a) O próprio número:             "+ number);
        System.out.println("b) O quadrado deste número:      "+ (number*2));
        System.out.println("c) A raiz quadrada deste número: "+ Math.sqrt(number));
        scanner.close(); 
	}
}
