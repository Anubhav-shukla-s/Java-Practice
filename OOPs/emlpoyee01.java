class employee {
    int Salary;
    String name;
    public void setSalary(int s) {
        Salary = s;
        
    }
    public int getsalary() {
        return Salary;
    }
    public void setname(String n) {
        name = n;
    }
    public String getname() {
        return name;
    }
    
}                                            

public class OOPS01 {
    public static void main(String[] args) {
        employee emp=new employee();
        emp.setname("John");
        emp.setSalary(50000);
        System.out.println("employee name " + emp.getname());
        System.out.println("employee salary " + emp.getsalary());       
        
        
    }
}


