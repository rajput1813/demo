package lll;

import lombok.Getter;

@Getter
public class DoublyLinkedListNode <V>{
     V value;
     DoublyLinkedListNode next;
     DoublyLinkedListNode prev;
     public DoublyLinkedListNode(V v){
         this.value=v;
         this.next=null;
         this.prev=null;
     }

}
