public class DecToBin {
    
    public static void DecToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int lastDigit = decNum % 2;
            binNum = binNum + (lastDigit * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum/2;


        }
        System.out.println("Binary of " + myNum +" = " + binNum);

    }
    public static void main(String args[]){
      DecToBin(7);;  

        
    }
    
}
