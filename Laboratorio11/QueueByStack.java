public class QueueByStack implements Queue {
    public QueueByStack() {
        s = new ArrayStack();
    }

    // O(n)
    public void enqueue(Object obj) {
        Stack newStack = new ArrayStack();
        while (!s.isEmpty()) {
            newStack.push(s.pop());
        }
        s.push(obj);
        while (!newStack.isEmpty()) {
            s.push(newStack.pop());
        }

    }

    // O(1)
    public Object getFront() {
        return s.top();
    }

    // O(1)
    public Object dequeue() {
        return s.pop();
    }

    // O(1)
    public void makeEmpty() {
        s.makeEmpty();
    }

    // O(1)
    public boolean isEmpty() {
        return s.isEmpty();
    }

    // campi di esemplare
    private Stack s;
}
