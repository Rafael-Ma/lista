package exercicio2;

import java.util.Scanner;

public class exer2{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            float h, b, B, area;
            int area2;

            // Entrada de valores
            System.out.print("Digite a altura do trapézio(h): ");
            h = input.nextFloat();

            System.out.print("Digite a base menor do trapézio(b): ");
            b = input.nextFloat();

            System.out.print("Digite a base maior do trapézio(B): ");
            B = input.nextFloat();

            // Cálculo 
            area = (float) (h * (b +B)) / 2;
            area2 = (int) (h * (b +B)) / 2;

            // Saída
            System.out.println("A área do trapézio é " + area + " ou cerca de " + area2 + ".");
        }
    }
}   