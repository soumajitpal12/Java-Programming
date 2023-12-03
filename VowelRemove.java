import java.util.*;
public class VowelRemove
{
    public static void main(String args[])
    {           
                System.out.println("\f");
                String w="";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String st=sc.nextLine();
                for(int i=0;i<st.length();i++)
                {
                                char x=st.charAt(i);
                                if(x!='A' && x!='E' && x!='I' && x!='O' && x!='U' && x!='a' && x!='e' && x!='i' &&x!='o' && x!='u')
                                w=w+x;          
                 }
                System.out.println(w);
    }
}