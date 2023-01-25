package midtermAct;

public interface UnorderedListADT {
    public void List(int n);
    public void add(int item);
    public void remove(int item);
    public void search(int item);
    public boolean isEmpty();
    public void size();
    public void append(int item);
    public void index(int item);
    public void insert(int pos, int item);
    public void pop();
    public void pop(int pos);
}