public class exer5 {
    public static void main(String[] args) { 

        for(int i = 1; i <= 123; i++) {
            boolean primo = true;  

            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }
    }
}