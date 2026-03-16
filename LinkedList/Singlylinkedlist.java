public class Singlylinkedlist {
    Node head=null;
    void insertBeging(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.node);
            System.out.print(" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Singlylinkedlist obj=new Singlylinkedlist();
        obj.insertBeging(1);
        obj.insertBeging(2);
        obj.insertBeging(3);
        obj.insertBeging(4);
        obj.insertBeging(5);
        obj.display();
    }
}
