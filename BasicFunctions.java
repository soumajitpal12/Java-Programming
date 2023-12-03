import java.util.*;
public class BasicFunctions {
    public static void printHelloWorld(){
        // System.out.println("Hello Soumajit");
        // System.out.println("Hello Soumajit");
        // System.out.println("Hello Soumajit");
        // System.out.println("Hello Soumajit");
        // System.out.println("Hello Soumajit");
        return;
    }
    public static int calculateSum(int a, int b){//parameters or formal parameters
         int sum = a + b;
        return sum;
       
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
  //printHelloWorld(); //function call
  int sum = calculateSum(a, b);//arguments or actual perameters
  System.out.println("Sum is : " + sum); 
    }
       
}
