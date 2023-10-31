import java.io.*;
class Student
{
String name,rollno;
int age;
Student(String nm,String rno,int a)
{
name=nm;
rollno=rno;
age=a;
}
void output()
{
System.out.println("Name:"+name);
System.out.println("RollNo:"+rollno);
System.out.println("Age:"+age);
}
}
class Stud2 extends Student
{
double height,weight;
Stud2(String nm,String rno,int a,double h,double w)
{
super(nm,rno,a);
height=h;
weight=w;
}
void output()
{
super.output();
System.out.println("Height="+height);
System.out.println("weight="+weight);
}
}
class methodoveriding
{
public static void main(String args[]) throws IOException
{
String name,rollno;
int age;
double height,weight;
DataInputStream k=new DataInputStream(System.in);
System.out.println("Enter your Name");
name=k.readLine();
System.out.println("Enter your rollno");
rollno=k.readLine();
System.out.println("Enter Your age");
age=Integer.parseInt(k.readLine());
System.out.println("Enter Your Height");
height=Double.parseDouble(k.readLine());
System.out.println("Enter your weight");
weight=Double.parseDouble(k.readLine());
Stud2 S=new Stud2(name,rollno,age,height,weight);
S.output();
}
}

