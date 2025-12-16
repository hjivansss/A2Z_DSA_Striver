package Linked_List;

public class LL {
    //Structuring the linklist
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;

        //Constructor
        public Node(int value){
            this.value=value;
        }

        //Constructor
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }



    //Display of the linklist
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
        System.out.println("END");
    }


    /*Insertion of a node at first*/
    public void insertFirst(int value){
        Node node = new  Node(value);
        node.next=head;
        head=node;

        //if head was empty
        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    /*Insertion of a node from the end*/
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;

    }

    /*Insertion at a given index*/
    public void insert(int value,int index){
        if(index==0){
           insertFirst(value);
        }
        if(index==size){
            insertLast(value);
        }
        Node temp = head;
        //index is 4 we have to go till 3 and then insert
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        //Using the constructor above
        Node node = new Node(value,temp.next); //creating a new node of value and attaching it to the next node
        temp.next=node;
        size++;
    }



    /*Deleting the first node*/
    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }

    /* A  function to get reference of the node */
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    /*Function to delete the node from end*/
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLastNode = get(size-1);
        int val= secondLastNode.value;
        tail=secondLastNode;
        tail.next=null;
        size--;
        return val;
    }

    /*Deleting from an index*/
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        System.out.println(prev);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    /* A  function to get reference of the node using the value */
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val){
                return node;
            }else{
                node=node.next;
            }
        }
        return null;
    }

}