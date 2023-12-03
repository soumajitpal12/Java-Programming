import java.util.ArrayList;
//import java.util.*;

public class ArrayListBasic {
    public static void main(String args[]){
        //Java Collection Framework
        //Vector(C++)== ArrayList(Java)
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Reverse Print O(n)
        for(int i=list.size()-1;i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //list.add(1, 9); //O(n)

        //System.out.println(list);


        // //get operation - O(n)
        // int element = list.get(2);
        // System.out.println(element);

        // //delet
        // list.remove(2);
        // System.out.println(list);

        // //Set Element 
        // list.set(2, 10);
        // System.out.println(list);

        // //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        //System.out.println(list.size());

        //print the arraylist
        // for(int i=0; i<list.size();i++){
        //     System.out.print(list.get(i));
        // }
        // System.out.println();

        
    }
}
