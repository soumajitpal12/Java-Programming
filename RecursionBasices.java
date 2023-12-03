public class RecursionBasices {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n== 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }

    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    //Calculate nth term in fibonacci number 
    public static int fib(int n) {
        if(n == 0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
         return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n-1);


    }

    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;

        }
        return halfPowerSq;

    }

    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        // horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;

        }
        char currChar = str.charAt(idx);
         if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
         } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
         }
    }

    
    
    public static void main(String args[]){
        // int n = 10 ;
        // System.out.println(fib(n));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr, 5, 0));
        //System.out.println(power(2, 10));

        // int a = 2;
        // int n = 10;
        // System.out.println(optimizedPower(a, n));

       // System.out.println(tilingProblem(4));

        String str = "soummmajitppal";
       removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);


    


    }
}
  