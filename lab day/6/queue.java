import java.util.LinkedList;
import java.util.Queue;
 
public class queue {
 
    public static void main(String[] args)
    {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);q.add(2);q.add(3);q.add(4);
        System.out.println("Elements of queue "+ q);
        q.remove();
        System.out.println("using remove-" +q);
        System.out.println("head of queue with peek-"+ q.peek());
        System.out.println("head of queue with poll-"+ q.poll());
    }
}