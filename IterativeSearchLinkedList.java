public class IterativeSearchLinkedList {
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

   

    

    public void print(){
       
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

  

   

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data ==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
         return idx+1;
       
    }
    public int recSearch(int key){
        return helper(head, key);

    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
      
        

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    } 
    
}
