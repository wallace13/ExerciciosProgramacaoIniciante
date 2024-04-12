package Java;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Distancia a ser Percorrida: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o Consumo Médio do Automóvel: ");
        double consumo = scanner.nextDouble();

        System.out.print("Litros Necessarios: "+distancia/consumo+"L");
        scanner.close();
    }
}
