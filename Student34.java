class Student34{
int rollno;
String name,course;
float fee;
Student34(int rollno, String name, String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student34(int rollno, String name, String course, float fee){
this(rollno, name, course);
this.fee=fee;
}
void display(){System.out.println(rollno+""+name+""+course+""+fee);}
}
class TestThis7{
public static void main(String args[]){
Student34 s1=new Student34(111, "Dhruva", "java");
Student34 s2=new Student34(112, "Durgaprasad", "java", 6000f);
s1.display();
s2.display();
}
}

