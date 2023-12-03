/**
 Write a program to accept a string/sentence in upper case and Display the longest word and the
length of the longest word present in the string.
SampLe i/p: "TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN"
Sample o/p: The longest word : FOOTBALL : The length of word :8  `    * */
import java.util.*;
public class LengthAndLengthNo
{
    public static void main(String args[])
    {           
                System.out.println("\f");
                int max_len=0,len=0;
                String w="",max_word="";
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a String");
                String st=sc.nextLine();
                st=st.trim();
                st=st+' ';
                for(int i=0;i<st.length();i++)
                {
                                char x=st.charAt(i);
                                if(x!=' ')
                                       w=w+x;       
                                else
                                {
                                      len=w.length();
                     if(len>max_len)
                     {
                                                max_word=w;
                                                max_len=len;
                                      }
                                     w="";
                                }
                }
                System.out.println("The longest word : "+max_word+" The length of word: "+ max_len);
    }
}