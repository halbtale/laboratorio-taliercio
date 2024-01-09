public class StackByQueue implements Stack {

    public StackByQueue() {
        q = new ArrayQueue();
    }

    // O(n)
    public void push(Object obj) {
        Queue tempQ = new ArrayQueue();
        tempQ.enqueue(obj);
        while (!q.isEmpty()) {
            tempQ.enqueue(q.dequeue());
        }
        q = tempQ;
    }

    // O(1)
    public Object top() {
        if (q.isEmpty())
            throw new EmptyStackException();
        return q.getFront();
    }

    // O(1)
    public Object pop() {
        if (q.isEmpty())
            throw new EmptyStackException();
        return q.dequeue();
    }

    // O(1)
    public void makeEmpty() {
        q.makeEmpty();
    }

    // O(1)
    public boolean isEmpty() {
        return q.isEmpty();
    }

    // campi di esemplare
    private Queue q;
}
