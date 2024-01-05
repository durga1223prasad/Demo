class employee{
int eid;
String ename;
string field;
void insertRecord(int r,String e,String f){
eid=r;
ename=e;
field=f;
}
void displayInformation(){System.out.println(eid+""+ename+""+field);}
}
class Employee1{
public static void main(String args[]){
Employee s1=new Employee();
Employee s2=new Employee();
s1.insertRecord(111,"karan");
s2.insertRecord(222,"Aryan");
s3.insertRecord(333,"kohli");
s1.displayInformation();
s2.displayInformation();
s3.displayInformation();
}
}