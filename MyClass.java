import java.util.Scanner;
class Salary{
    double sal,bonus;
    void calculate()
    {
    double totalpay=sal+bonus;
    System.out.println("salary="+totalpay);
    }
    }
public class MyClass{
public static void main(String args[])
{
Salary s1= new Salary();
Salary s2= new Salary();
s1.sal=20000;
s2.sal=30000;
s1.bonus=5000;
s2.bonus=10000;
s1.calculate();
s2.calculate();
}
}