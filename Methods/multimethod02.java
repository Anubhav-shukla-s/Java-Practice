public class multimethod02 {

        static int multiply(int a) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(a + " x " + i + " = " + (a * i));
                }
                return a;
        }
    
    public static void main(String[] args) {
       multiply(10);
       multiply(15);

        
    }
}
