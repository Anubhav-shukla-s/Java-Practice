import java.util.Scanner;
class rectangle{
    int length;
        int breadth;
    public int takeside()
    {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter the length of rectangle :");
        length=take.nextInt();
        System.out.print("Enter the breadth of rectangle :");
        breadth=take.nextInt();
        return 0;

    }
    public int area()
    {
       int areaa= length*breadth;
        System.out.print("Your area is " +areaa);
        return areaa;

    }
    public int perimeter()
    {
        int peri=2*(length+breadth);
        System.out.print("Your perimeter is " +peri);
        return peri;

    }
}

    public class OOPSrect04 {
    public static void main(String[] args)
    {
        rectangle rect=new rectangle();
        rect.takeside();
        rect.perimeter();
        rect.area();
    }

}
