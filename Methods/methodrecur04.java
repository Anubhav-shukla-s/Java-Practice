public class methodrecur04 {

        static int sum(int a) {
            if(a==1)
                return 1;
            else if(a<=0)
                return 0;
            else{
                return sum(a-1)+a;
            }
        }
    
    public static void main(String[] args) {
        
        System.out.println(sum(10));

        
    }
}
