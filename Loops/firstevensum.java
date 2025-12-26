import java.util.Scanner;
public class firstevensum {
    public static void main(String[] args) {

       
        var sc= new Scanner(System.in);
        int s=sc.nextInt();

        int i=5;
        int a=0;
        while(i<=s)
        {
            if(i%2==0){
                a=a+i;
            }
            i++;
        }
        System.out.printf("The sum is %d",a);
    }       
    
}

