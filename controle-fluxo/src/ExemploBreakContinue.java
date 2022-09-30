public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        
        System.out.println("continue---------------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) 
                continue;

                System.out.println(i);
            
        }


        System.out.println("break------------------");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) 
                break;

                System.out.println(i);
            
        }
    }
    
}
