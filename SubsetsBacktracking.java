public class SubsetsBacktracking {
    public static void findSubsetes(String str, String ans, int i){
        //base case 
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }


        //recursion
        //Yes choice
        findSubsetes(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsetes(str, ans, i+1);


    }

    public static void main(String args[]){
        String str = "abc"; 
        findSubsetes(str, "", 0);
    }
}
