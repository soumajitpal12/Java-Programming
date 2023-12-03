import java.util.*;
public class NextCharecter
{
    public static void main(String args[])
    {           
                System.out.println("\f");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a character");
                char ch=sc.next().charAt(0);
                 if(ch=='z')
                 System.out.println("a");
                 else if(ch=='Z')
                 System.out.println("A");
                 else
                 System.out.println(++ch);
    }
}