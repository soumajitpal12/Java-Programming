import java.util.*;
public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMusk = 1;
        if((n & bitMusk) == 0){
            //even number
            System.out.println("Even Number");

        }else{
            System.out.println("Odd Number");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMusk = 1<<i;
        if((n& bitMusk)==0){
            return 0;
      }else{
        return 1;
      }
    }

    public static int srtIthBit(int n, int i ){
        int bitMusk = 1<<i;
        return n | bitMusk;

    }
    public static int clearIthBit(int n, int i){
        int bitMusk = ~(1<<i);
        return n& bitMusk;
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);

        // }else{
        //     return srtIthBit(n, i);
        // } 

        n = clearIthBit(n, i);
        int BitMusk = newBit<<i;
        return n | BitMusk;

    }

    public static int clearIBits(int n, int i){
        int bitMusk = (~0)<<i;
        return n& bitMusk;
    }
    public static int clearBitsinRange(int n , int i, int j){
        int a =  ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMusk = a|b;
        return n&bitMusk;
    }
    public static boolean isPowerOfTwo(int n){
        return(n&(n-1)) == 0;
    }

  public static int countsetBits(int n){
    int count =0;
    while(n >0){
        if((n&1)!=0){//check our LSB
            count++;

        }
        n= n>>1;

    }
    return count;
  } 

  public static int fastExpo(int a, int n){
    int ans =1;
    while(n>0){
        if((n&1)!=0){//Check LSB
            ans = ans * a;

        }
        a = a*a;
        n= n>>1;
    }
    return ans;
  }
    public static void main(String args[]){
       
        // oddOrEven(3);
        // oddOrEven(11);
        // oddOrEven(14);

        //System.out.println(srtIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        //System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearBitsinRange(10, 2, 4));
        //System.out.println(isPowerOfTwo(9));
        //System.out.println(countsetBits(16));
        System.out.println(fastExpo(3, 5));
    
    }
    
}
