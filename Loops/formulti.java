import java.util.Scanner;
public class formulti {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();

        int i=1;
        for(i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n", s, i, s*i);
        }       
    }

}
