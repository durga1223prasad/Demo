public class WrapperExample4{
public static void main(String args[]){
byte b=10;
short s=20;
int i=30;
long l=40;
float f=50.0f;
double d=60.0D;
char c='a';
boolean b2=true;
Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;
System.out.println("---printing object values---");
System.out.println("Byte Object:"+byteobj);
System.out.println("Short Object:"+shortobj);
System.out.println("Integer Object:"+intobj);
System.out.println("Long Object:"+longobj);
System.out.println("Float Object:"+floatobj);
System.out.println("Double Object:"+doubleobj);
System.out.println("Character Object:"+charobj);
System.out.println("Boolean Object:"+boolobj);
byte bytevalue= byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean boolvalue=boolobj;
System.out.println("---printing primitive values---");
System.out.println("byte value:"+bytevalue);
System.out.println("short value:"+shortvalue);
System.out.println("int value:"+intvalue);
System.out.println("long value:"+longvalue);
System.out.println("float value:"+floatvalue);
System.out.println("double value:"+doublevalue);
System.out.println("char value:"+charvalue);
System.out.println("boolean value:"+boolvalue);
}
}