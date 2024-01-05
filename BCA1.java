class BCA{
private int age;
public void setAge(int age)
{
if(age<0)this.age=0;
else
this.age=age;
}
public int getAge(){return this.age;}
}
class BCA1{
public static void main(String arga[]){
System.out.println("Good Morning");
BCA ob=new BCA();
//ob.setAge(-10);
ob.setAge(10);
System.out.println("Age:"+ob.getAge());
}}