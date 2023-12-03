import java.util.*; 
// Average of 3 numbers
public class Average { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int A = sc.nextInt(); 
                
                       System.out.println("Enter 2nd number: ");

        int B = sc.nextInt();
                        System.out.println("Enter 3rd number: ");
        int C = sc.nextInt();
                        

        int average = (A+B+C) / 3;
        System.out.println("average is : " + average);
    }
    
}