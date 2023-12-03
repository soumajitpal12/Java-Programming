import java.util.*;
public class MaximumVowelCountInEachWord
{
    public static void main(String args[])
    {
                System.out.println("\f");
                char x;
                int c=0; 
                String w="";
                Scanner sc =new Scanner(System.in);
                System.out.println("enter a string");
                String st=sc.nextLine();
                st=st.trim();
                st=st+"   ";
                for(int i=0;i<st.length();i++)
                {
                                x=st.charAt(i);
                                if(x!=' ')
                                {
                                      w=w+x;
                                      if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O' 
                                                                                                                   ||x=='u'||x=='U')
                                      c++;
                                }
                                else
                                {
                                       System.out.println(" NO OF VOWELS PRESENT IN "+ w +" = "+c);
                                       w="";
                                       c=0;
                                }
                }
    }
}