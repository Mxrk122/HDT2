public interface Stack <T>{
    public void Push(T object);

    public T Pop();

    public boolean Empty();

    public T Peek();

    public int size();
}