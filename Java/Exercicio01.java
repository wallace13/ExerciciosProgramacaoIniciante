package Java;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Informe seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Nome: "+nome+"\n");
        System.out.print("Sexo: "+sexo);
        scanner.close();
    }
}
