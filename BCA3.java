class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setname(String name){this.name=name;}
public int getId(){return id;}
public String getname(){return name;}
}
class BCA3{
public static void main(String args[]){
Student ob=new Student();
ob.setId(25935);
ob.setname("Dhruva");
System.out.println("id:"+ob.getId());
System.out.println("name:"+ob.getname());
}
}