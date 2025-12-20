public class arrayavg03 {
    public static void main(String[] args) {
        
        int sum=0;
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        int avg=sum/a.length;
        System.out.println("Average is: "+avg);
    }
}
