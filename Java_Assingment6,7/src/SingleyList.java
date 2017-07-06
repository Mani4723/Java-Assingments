/**
 * Created by zemosozemoso on 6/7/17.
 */
class SList<T> {
    public SNode<T> HeadNode = new SNode<T>(null); // Initializing a Head node.

    SListIterator<T> Iterator() {
        return new SListIterator<T>(HeadNode);
    }

    public String toString() {
        if(HeadNode.next == null) return "Empty list.";
        SListIterator<T> sliterator = this.Iterator();
        StringBuilder s = new StringBuilder(); /* Used to append strings to string builder. */
        while(sliterator.hasNext()) {
           s = s.append(sliterator.next() + " --> ");
        }
        return new String(s + "null"); /* String builder object cannot be returned, */
                              /* So casting to string object. */
    }
}

class SListIterator<T> { // Creating iterator. With basic methods.
    SNode<T> current;
    SListIterator(SNode<T> link) {
        current = link;
    }

    public boolean hasNext() { // Checks if next node present or null in forward direction.
        return current.next != null;
    }
    public SNode<T> next() { // points to the next node.
        current = current.next;
        return current;
    }
    public void add(T data) { // Inserts the data by creating a node at tail.
        current.next = new SNode<T>(data, current.next);
        current = current.next;
    }
    public void remove(SNode head) { // remove the last node of the list.
        current = head;
        if(current.next == null) {
              System.out.println("Empty list, cannot remove anything.");
        }
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }
}
class SNode<T> { /* Creates a new Node. */
    T data;
    SNode<T> next;
    SNode(T data, SNode<T> next) {
        this.data = data;
        this.next = next;
    }
    SNode(T data) {
        this(data, null);
    }
    public String toString() {
        if(data == null) return "null";
        return data.toString();
    }
}
public class SingleyList {
    public static void main(String[] args) {
        SList<String> slist = new SList<String>();
        System.out.println(slist);
        SListIterator<String> slIter = slist.Iterator(); // creates a SListItertor object.
        slIter.add("one");
        slIter.add("two");
        slIter.add("three");
        slIter.add("four");
        slIter.add("five");
        slIter.add("Six");
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
        slIter.remove(slist.HeadNode);
        System.out.println(slist);
    }
}
