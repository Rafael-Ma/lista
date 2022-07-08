import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            int horas;
            float salario;

            // Input
            System.out.print("Quantidade de horas trabalhadas: ");
            horas = input.nextInt();

            // Cálculo
            salario = (float) (horas * 10.25);

            // Output
            System.out.println("Salário a ser pago R$" + salario);
        }
    }
}
