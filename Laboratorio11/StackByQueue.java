public class StackByQueue implements Stack {

    public StackByQueue() {
        q = new ArrayQueue();
    }

    public void push(Object obj) {
        Queue tempQ = new ArrayQueue();
        tempQ.enqueue(obj);
        while (!q.isEmpty()) {
            tempQ.enqueue(q.dequeue());
        }
        q = tempQ;
    }

    public Object top() {
        if (q.isEmpty())
            throw new EmptyStackException();
        return q.getFront();
    }

    public Object pop() {
        if (q.isEmpty())
            throw new EmptyStackException();
        return q.dequeue();
    }

    public void makeEmpty() {
        q.makeEmpty();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    // campi di esemplare
    private Queue q;
}
