import java.util.Scanner;
public class while01 {
    public static void main(String[] args) {
        System.out.println("Hello from Main");

       
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        i = 0;
        while (i<n) {
            System.out.println(i);
            i++;
        }
    }
}
