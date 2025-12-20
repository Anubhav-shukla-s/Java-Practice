import java.util.Scanner;
public class checkint {
    public static void main(String[] args) {
        System.out.println("Hello from Main");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int [] arr={10,20,30,40,50};
        for(i=0;i<arr.length;i++)
        {
            if(a==arr[i]){
                System.out.println("Found at index " + i);
                break;
            }
        }
        
    }
}
