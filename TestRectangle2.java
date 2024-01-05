class circle{
int radius;
void insert(int r);{
radius=r;
}
void calculateArea(){System.out.println(r*r);}
}
class Testcircle2{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
Rectangle r3=new Rectangle();
r1.insert(5);
r2.insert(34);
r1.calculateArea();
r2.calculateArea();
}
}