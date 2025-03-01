package Linkedlist;
public class LL {

    private Node head;
    private Node tail;
    private int size;

    

    // public Node getHead() {
    //     return head;
    // }
    // public void setHead(Node head) {
    //     this.head = head;
    // }
    // public Node getTail() {
    //     return tail;
    // }
    // public void setTail(Node tail) {
    //     this.tail = tail;
    // }
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null) {
            tail = head;
        }
        size += 1;

    }
    public void InsertLast(int val){
        if (tail==null) {
            InsertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void Insert(int val, int index){
        if (index == 0) {
            InsertFirst(val);
        }
        if (index == size) {
            InsertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    //Insert using recursion
    // public void InsertRec(int val, int index){
    //     head = InsertRec(val, index, head);
    // }
    // private Node InsertRec(int val, int index,Node node){
    //     if (index == 0) {
    //         Node temp = new Node(val , node);
    //         size++;
    //         return temp;
    //     }
    //     node.next = InsertRec(val,index--,node.next);
    //     return node;

    // }
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail =null;

        }
        size--;
        return val; 
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }
    public int DeleteLast(){
        if (size <= 1) {
            return DeleteFirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null; 

        return val;
    }
    public int delete(int index){
        if (index == 0 ) {
            return DeleteFirst();
        }
        if (index == size-1 ) {
            return DeleteLast();
        }

        Node previous = get(index -1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public LL() {
        this.size = 0;
    }



    private class Node {
        private int value;
        private Node next;

        
        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        
    
        
    } 
    public void bubblesort(){
        bubblesort(size-1 , 0);
    }
    private void bubblesort(int row , int col){
        if (row ==0) {
            return;
        }
        if (col < row) {
            Node  first = get(col) ;
            Node  second = get(col + 1);

            if (first.value > second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubblesort(row, col+1);
        }else{
            bubblesort(row-1, 0);
        }
    }


    //reverse ll using rec

    private void Reverse(Node node){
        if (node == tail) {
            head = tail;
            return;
        }
        Reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // in place reversal
    public void reverseInPlace(){

        if (size < 2) {
            return;
        }
        
        Node prev  = null;
        Node prsnt = head;
        Node next = present.next;
        
        while (prsnt != null) {
            prsnt.next = prev;
            prev = prsnt;
            prsnt = next;
            if (next != null) {
                next = next.next;
            }
           
        }
        head = prev;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(7);
        list.InsertFirst(13);
        list.InsertFirst(5);
        list.display();
        list.insertRec(88, 3);
        list.display();
        list.reverseInPlace();
    }


    
}
