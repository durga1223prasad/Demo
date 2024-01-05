class Student5{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day1{
public static void main(String args[]){
Student5[] ob=new Student5[3];
ob[0]=new Student5();
ob[0].setId(34);
ob[0].setName("Dhruva");
System.out.println("ID:"+ob[0].getId());
System.out.println("Name:"+ob[0].getName());
ob[1]=new Student5();
ob[1].setId(12);
ob[1].setName("Cherry");
System.out.println("ID:"+ob[1].getId());
System.out.println("Name:"+ob[1].getName());
ob[2]=new Student5();
ob[2].setId(43);
ob[2].setName("Bunny");
System.out.println("ID:"+ob[2].getId());
System.out.println("Name:"+ob[2].getId());
}
}
