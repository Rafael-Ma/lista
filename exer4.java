public class exer4 {
    public static void main(String[] args) {

        int somaImper;
        long multiPar;

        somaImper = 0;
        multiPar = 1;

        for (int i = 0; i < 30; i++)
        {
            if (i % 2 != 0)
            {
                somaImper += i;
            }
            else
            {
                if (i > 0)
                multiPar *= i;
            }
        }        
        System.out.println("Soma dos números ímpares: " + somaImper);
        System.out.println("Multiplicação dos números pares: " + multiPar);
    }
}