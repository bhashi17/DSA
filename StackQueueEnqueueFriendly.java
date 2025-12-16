import java.util.LinkedList;
import java.util.Queue;

public class StackQueueEnqueueFriendly {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }


    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int popped = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
