import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();

        int i=1;
        
        while(i<=10){
            System.out.println(s+"X"+i+"="+(s*i));
            i++;
        }
    }
}
