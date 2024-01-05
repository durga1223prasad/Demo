class Employee{
int eid;
String ename;
String department;
void insertRecord(int r,String e,String ds){
eid=r;
ename=e;
department=ds;
}
void displayInformation(){System.out.println(eid+""+ename+""+department);}
}
class Employee1{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"karan","T&P");
e2.insertRecord(222,"Aryan","sales");
e3.insertRecord(333,"kohli","Admition");
e1.displayInformation();
e2.displayInformation();
e3.displayInformation();
}
}