class circlecheck{
    float radius;
    float area;
    float circumference;
    public void setradius(int r){
        radius=r;
    }
    public float getarea(float a){
        area=3.14f*radius*radius;
        if(a==area)
        {
            System.out.println("RIght");
        }else
        {
            System.out.println("False");
        }
        return 0;
        
    }
    public float getcircumference(float a){
        circumference=2*3.14f*radius;
        if(a==circumference)
        {
            System.out.println("RIght");
        }else
        {
            System.out.println("False");
        }
        return 0;
    }
}
public class circlecheckgetset02 {
    public static void main(String[] args){
        circlecheck cir =new circlecheck();
        cir.setradius(3);
        cir.getarea(6.32f);
        cir.getcircumference(5.22f);
    }

}
