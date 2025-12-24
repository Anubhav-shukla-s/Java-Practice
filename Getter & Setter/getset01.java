class myemployee{
    String name;
    int id;
    public void setname(String n){
        name=n;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }

    public static void main(String args[]){
        myemployee emp=new myemployee();
        emp.setname("John Doe");
        emp.setid(101);
        System.out.println("Employee Name: " + emp.getname());
        System.out.println("Employee ID: " + emp.getid());
    }
}
