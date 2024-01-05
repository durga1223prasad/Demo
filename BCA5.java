class Notebook{
private String name;
private String standard;
private String section;
private int rollno;
public void setName(String name){this.name=name;}
public void setStandard(String standard){this.standard=standard;}
public void setSection(String section){this.section=section;}
public void setRollno(int rollno){this.rollno=rollno;}
public String getName(){return name;}
public String getStandard(){return standard;}
public String getSection(){return section;}
public int getRollno(){return rollno;}
}
class BCA5{
public static void main(String args[]){
Notebook ob=new Notebook();
ob.setName("Dhruva");
ob.setStandard("2");
ob.setSection("A");
ob.setRollno(34);
System.out.println("name:"+ob.getName());
System.out.println("standard:"+ob.getStandard());
System.out.println("section:"+ob.getSection());
System.out.println("rollno:"+ob.getRollno());
}
}