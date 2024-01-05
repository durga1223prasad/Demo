class Student4{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day{
public static void main(String args[]){
Student4 ob1=new Student4();
ob1.setId(34);
ob1.setName("Dhruva");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
Student4 ob2=new Student4();
ob2.setId(23);
ob2.setName("Durga");
System.out.println("ID:"+ob2.getId());
System.out.println("Name:"+ob2.getName());
Student4 ob3=new Student4();
ob3.setId(12);
ob3.setName("Prasad");
System.out.println("ID:"+ob3.getId());
System.out.println("Name:"+ob3.getName());
Student4 ob4=new Student4();
ob4.setId(21);
ob4.setName("Cherry");
System.out.println("ID:"+ob4.getId());
System.out.println("Name:"+ob4.getName());
Student4 ob5=new Student4();
ob5.setId(41);
ob5.setName("Bunny");
System.out.println("ID:"+ob5.getId());
System.out.println("Name:"+ob5.getName());
}
}