class Circle{
int radius;
void insert(int r);{
radius=r;
}
void calculateArea(){System.out.println(radius);}
}
class TestCircle{
public static void main(String args[]){
Circle c1=new Circle();
c1.insert(5);
c1.calculateArea();
}
}