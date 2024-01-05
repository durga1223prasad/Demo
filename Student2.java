class Student2{
int rollno;
String name;
static String college="ITS";
static void change(){
college="MTIET";
}
Student2(int r, String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class TestThis{
public static void main(String args[]){
Student2 s1=new Student2(534, "Dhruva");
Student2 s2=new Student2(510, "Cherry");
s1.display();   s2.display();
Student2 s3=new Student2(511, "lakshith");
Student1.change();
s1.display();
s2.display();
s3.display();
}}