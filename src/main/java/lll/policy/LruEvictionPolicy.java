package lll.policy;

import lll.DoublyLinkedList;
import lll.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LruEvictionPolicy <Key> implements EvictionPolicy<Key>{
    private DoublyLinkedList<Key>dll;
    private Map<Key, DoublyLinkedListNode<Key>>m;

    public LruEvictionPolicy(){
        dll= new DoublyLinkedList<Key>();
        m= new HashMap<>();
    }
    @Override
    public Key updateKey(Key key) {
        if(!m.containsKey(key)){
            DoublyLinkedListNode<Key>node = new DoublyLinkedListNode<Key>(key);
            dll.addNode(node);
            m.put(key,node);
            return null;
        }

        dll.removeNode(m.get(key));
        DoublyLinkedListNode node= dll.addNode(m.get(key));
        m.put(key,node);
        return null;
    }

    @Override
    public Key evictKey() {
        DoublyLinkedListNode<Key> node=dll.removeFirstNode();
        m.remove(node.getValue());
        return node.getValue();
    }
}
