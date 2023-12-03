import java.util.*;
public class FirstWordUpper
{
    public static void main(String args[])
    {           
                //System.out.println("\f");
                //int f=0;
                String w="";
                 Scanner sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String st=sc.nextLine();
                st= st.trim();
                st=' '+st;
                st= st.toLowerCase();
                for(int i=0;i<st.length();i++)
                {
                                char ch=st.charAt(i);
                                if(ch==' ')
                                {
                                    char x = st.charAt(i+1);
                                  w= w +' '+ Character.toUpperCase(x);
                                  i=i+1;
                                }
                                else
                                {
                                    w=w+ch;
                                }
                                
                }   
                System.out.println(w);
    }
}