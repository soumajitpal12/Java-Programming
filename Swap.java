import java.util.*;
public class Swap {
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
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 

    }
    public static void main(String args[]) {
       //swap - value exchage
       int a = 5;
       int b = 10;

       swap(a, b);

      

    }
       
}
