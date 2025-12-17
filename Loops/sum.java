import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("Hello from Main");

       
        var sc= new Scanner(System.in);
        int s=sc.nextInt();
        
int a=0;
        int i=1;
        for(i=1;i<=s;i++){
           a=a+i;
        }
        System.out.printf("The sum is %d",a);
    }   
}