/** Write a program to accept a string in upper case and find the frequency of each vowel present
in string:
 Sampke i/p: "RAIN WATER HARVESTING ORGANIZED BY JUSCO"
 Sample o/p: Frequency of 'A' = 4
                     Frequency of 'E' = 3
                     Frequency of 'I' = 3
                     Frequency of 'O' = 2
                     Frequency of 'U' = 1                * */
import java.util.*;
public class VowelCount
{
    public static void main(String args[])
    {           
                System.out.println("\f");
                int ACOU=0,ECOU=0,ICOU=0,OCOU=0,UCOU=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String st=sc.nextLine();
                for(int i=0;i<st.length();i++)
                {
                                char x=st.charAt(i);
                                if(x=='A')
                                ACOU++;
                                else if(x=='E')
                                ECOU++;
                                else if(x=='I')
                                ICOU++;
                                else if(x=='O')
                                OCOU++;
                                else if(x=='U')
                                UCOU++;
                }   
                System.out.println("FREQUENCY OF 'A' ="+ACOU);
                System.out.println("FREQUENCY OF 'E' ="+ECOU);
                System.out.println("FREQUENCY OF 'I' ="+ICOU);
                System.out.println("FREQUENCY OF 'O' ="+OCOU);
                System.out.println("FREQUENCY OF 'U' ="+UCOU);
    }
}