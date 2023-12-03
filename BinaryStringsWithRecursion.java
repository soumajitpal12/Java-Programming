public class BinaryStringsWithRecursion {
    public static void printBinStrings(int n, int lastPlace, String str){
if( n== 0){
    System.out.println(str);
    return;
}
        // kaam

    //    if(lastPlace == 0){
    //     //sit 0 on chair n
    //     printBinStrings(n-1, 0, str.append("0"));
    //     printBinStrings(n-1, 1, str.append("1"));
    //    }else {
    //     printBinStrings(n-1, 0, str.append("0"));
    //    }

    printBinStrings(n-1, 0, str+"0");
    if(lastPlace == 0){
        printBinStrings(n-1, 1, str+"1");
    }

    }

    public static void main(String args[]){
        printBinStrings(4, 0, "");
    }
}
