import java.util.Scanner;
class circle {
    
    int a;
    float pie=3.14f;

    public int takeradius()
    {
        Scanner take = new Scanner(System.in);
        a=take.nextInt();
        return a;

    }
    public float area()
    {
       float areaa=pie*a*a;
        System.out.println("Your area is " +areaa);
        return areaa;

    }
    public float circumference()
    {
        float peri=2*pie*a;
        System.out.println("Your circumference is " +peri);
        return peri; 

    }
}

    public class OOPScircle03 {
    public static void main(String[] args)
    {
        circle sq=new circle();
        sq.takeradius();
        sq.circumference();
        sq.area();
    }

}