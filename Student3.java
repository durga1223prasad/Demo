class Student3{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4program0{
public static void main(String args[]){
Student3 ob1=new Student3();
ob1.setId(34);
ob1.setName("Dhruva");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
}
}