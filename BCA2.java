class Student{
private int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class BCA2{
public static void main(String args[]){
Student ob=new Student();
ob.setId(25935);
System.out.println("id:"+ob.getId());
}
}