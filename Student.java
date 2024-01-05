class Student{
int rollno;
String name;
static String college="MTIE";
Student(int r, String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+""+name+""+college);}
}
class TestStaticVariable1{
public static void main(String args[]){
Student s1=new Student(111, "Dhruva");
Student s2=new Student(222, "Cherry");
Student.college="MTIET";
s1.display();
s2.display();
}
}