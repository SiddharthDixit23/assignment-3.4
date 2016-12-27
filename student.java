import java.util.Scanner;
class details
{
public int rollno,classs,marks1,marks2,marks3,marks4,marks5;
public double avg,sum;
public String name;
Scanner obj=new Scanner(System.in);
public void getinput()
{
System.out.println("Enter name of the student: ");
name=obj.nextLine();
System.out.println("Enter class of student: ");
classs=obj.nextInt();
System.out.println("Enter rollno. of the student: ");
rollno=obj.nextInt();
System.out.println("Enter marks obtained by student in subject 1: ");
marks1=obj.nextInt();
System.out.println("Enter marks obtained by student in subject 2: ");
marks2=obj.nextInt();
System.out.println("Enter marks obtained by student in subject 3: ");
marks3=obj.nextInt();
System.out.println("Enter marks obtained by student in subject 4: ");
marks4=obj.nextInt();
System.out.println("Enter marks obtained by student in subject 5: ");
marks5=obj.nextInt();
}


public void disp()
{
System.out.println("          REPORT CARD");
System.out.println("Name : "+name);
System.out.println("Class : "+classs);
System.out.println("Rollno. : "+rollno);
}
public void average()
{
sum=marks1+marks2+marks3+marks4+marks5;
avg = sum/5;
if(avg>90)
{
System.out.println("GRADE : A");
}
else if(avg>80 && avg<=90)
{
System.out.println("GRADE : B");
}
else if(avg>70 && avg<=80)
{
System.out.println("GRADE : C");
}
else if(avg>60 && avg<=70)
{
System.out.println("GRADE : D");
}
else if(avg>50 && avg<=60)
{
System.out.println("GRADE : E");
}
else
{
System.out.println("GRADE : F");
}
}
}
class student
{
public static void main(String args[])
{
details s1=new details();
details s2=new details();
details s3=new details();
s1.getinput();
s2.getinput();
s3.getinput();
s1.disp();
s1.average();
s2.disp();
s2.average();
s3.disp();
s3.average();
}
}