import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            int num;
            boolean primo;
            String tipo;

            // Input
            System.out.print("Digite um número: ");
            num = input.nextInt();

            // Cálculo
            if (num % 2 == 0) {
                tipo = "par";
            }
            else {
                tipo = "impar";
            }

            primo = true;
            for(int i = 2; i < num; i++) {            
                if(num % i == 0) {
                    primo = false;
                }
            }

            // Output
            if (primo) {
                System.out.println("O número " + num + " é " + tipo + " e também é primo.");
            }
            else {
                System.out.println("O número " + num + " é " + tipo + " e não é primo.");
            }
        }
    }
}
