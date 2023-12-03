//write a java program to input a number and find the sum of prime digit of the number .
import java.util.*;
public class PrimeDigitSum{
    public static void main(String args[]){
    int n, c,r,s=0,p;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    n= sc.nextInt();
    p=n;
    while(n!=0){
        r=n%10;
        c=0;
        for(int i=1;i<=r;i++)
        {
          if(r%i==0)
          c++;
        }
        if(c==2)
        {
            s=s+r;
        }
        n=n/10;

        
    }
    System.out.println("Sum Of Prime Digit " +p+ "is "+s);


}
}