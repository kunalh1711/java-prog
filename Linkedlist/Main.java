package Linkedlist;

public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);                                                  //Generic method   ,   but we have to create all the method manually
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(7);
        list.InsertFirst(13);
        list.InsertFirst(5);
        list.display();
        list.insertRec(88, 3);
        list.display();
        list.reverseInPlace();

        

        // list.InsertLast(55);
        // list.InsertLast(69);
        // // list.display();

        // list.Insert(17, 3);
        // list.display();

        // System.out.println(list.DeleteFirst());
        // System.out.println(list.DeleteLast());
        // list.display();
        // System.out.println(list.delete(2));
        
        // System.out.println(list.getHead());



        // DLL list = new DLL();
        // list.InsertFirst(3);
        // list.InsertFirst(7);
        // list.InsertFirst(13);
        // list.InsertFirst(5);
        // list.InsertLast(55);
        // // list.Insert(33, 2);
        // list.InsertAfter(7,22);
        // list.Display();

        // CLL list = new CLL();

        // list.Insert(22);
        // list.Insert(45);
        // list.Insert(34);
        // list.display();
        // InsertRec(88,2)


    }
}
