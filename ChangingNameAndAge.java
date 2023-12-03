import java.util.*;
public class ChangingNameAndAge
{
    public static void main(String args[])
    {           
                System.out.println("\f");
                String st="My name is Alok Kumar Gupta and my age is 45 years";      
                st=st.replace("Alok","Ashok");
                st= st.replace("45","35");
                System.out.println(st);
    }
}