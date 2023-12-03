import java.util.*;
public class AreaOfCircle {
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the redious of circle : ");
  float red = sc.nextFloat();
  System.out.print("Area of the circle is : ");
  float area = 3.14f * red * red;
  System.out.println(area);
    
}
}
