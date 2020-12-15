package Queue;

public interface NodeInterface<T> {
    public void push(T data);
    public void pop();
    public void peek();
    public void show();
    public void length();
}
