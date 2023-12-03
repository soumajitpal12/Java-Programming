
import java.util.*;
public class AsciiSumChar{
    public static void main(String args[]){
        char x,y;
        int a,b ,s,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two char: ");
    x= sc.next().charAt(0);
    y= sc.next().charAt(0);
    a=x;
    b=y;
    s=a+b;
    d=a-b;

    System.out.println("ASCII Value of Charecter is " + a);
    System.out.println("ASCII Value of Charecter is " + b);

    System.out.println("Sum Of the ASCII value " + s);
    System.out.println("Sub Of the ASCII value " + d);


}
}