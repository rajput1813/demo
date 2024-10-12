package lll;

public class DoublyLinkedList<V> {
    DoublyLinkedListNode<V>head;
    DoublyLinkedListNode<V>tail;
    public DoublyLinkedList(){
        this.head=new DoublyLinkedListNode<V>(null);
        this.tail=new DoublyLinkedListNode<V>(null);
    }
    public DoublyLinkedListNode<V> addNode(V v){
        DoublyLinkedListNode node1= new DoublyLinkedListNode<>(v);
        if(head==null){
            head=node1;
            tail=node1;
        }
        else{
            tail.next=node1;
            node1.prev=tail;
            tail=tail.next;
        }
        return tail;

    }

    public DoublyLinkedListNode<V> removeNode(DoublyLinkedListNode<V> node){
        node.prev.next = node.next;
        node.next.prev=node.prev;
        node.next=null;
        node.prev=null;
        return  node;
    }
    public  DoublyLinkedListNode <V>removeFirstNode(){
        DoublyLinkedListNode<V> first= head;
        first.prev=null;
        head =first.next;
        first.next.prev=null;
        return  first;

    }
    public DoublyLinkedListNode<V> addNode(DoublyLinkedListNode node1){

        if(head==null){
            head=node1;
            tail=node1;
        }
        else{
            tail.next=node1;
            node1.prev=tail;
            tail=tail.next;
        }
        return tail;

    }

}
