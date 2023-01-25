package lists.arrayLists;

public interface List <T> {
    boolean isFull();
    boolean isEmpty();
    boolean add(T data);
    void remove(T data);
    boolean search(T data);
    int size();
}
