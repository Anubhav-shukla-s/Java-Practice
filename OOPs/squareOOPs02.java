import java.util.Scanner;
class square {
    public int takeside()
    {
        Scanner take = new Scanner(System.in);
        int b=take.nextInt();
        return b;

    }
    public int area(int a)
    {
       int areaa=a*a;
        System.out.println("Your perimeter is " +areaa);
        return areaa;

    }
    public int perimeter(int a)
    {
        int peri=4*a;
        System.out.println("Your perimeter is " +peri);
        return peri;

    }
}

    public class squareOOPS02 {
    public static void main(String[] args)
    {
        square sq=new square();
        sq.takeside();
        sq.perimeter(12);
        sq.area(12);
    }

}
