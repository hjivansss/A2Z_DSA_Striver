package Linked_List;



public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(0);

        list.insertLast(2399);
        //list.insert(9,3);
        //System.out.println(list.deleteFirst());
        //System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        list.display();
    }
}