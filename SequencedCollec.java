import java.util.Deque;
import java.util.LinkedList;

public class SequencedCollec {
    public SequencedCollec() {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(5);
        deque.addFirst(2);
        deque.addLast(3);
        
        System.out.println(deque.getFirst());   
        System.out.println(deque.removeLast()); 
        System.out.println(deque);              

        LinkedList<Integer> reversedDeque = new LinkedList<>(deque);
        java.util.Collections.reverse(reversedDeque);
        System.out.println(reversedDeque);
    }

    public static void main(String[] args) {
        new SequencedCollec();
    }
}
