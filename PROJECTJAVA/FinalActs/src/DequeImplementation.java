import java.util.Arrays;


public class DequeImplementation
{
    static final int Max = 5;
    int arr[];
    int front;
    int rear;
    int size;


    public DequeImplementation(int size) {
        arr = new int[Max];
        front = -1;
        rear = -1;
        this.size = size;
    }
    public boolean isFull() {
        return ((front==0 && rear== size-1)||
                front == rear+1);
    }
    public boolean isEmpty() {
        return front == -1;
    }

    int getFront()
    {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1 ;
        }
        return arr[front];
    }
    int getRear() {
        if (isEmpty()|| rear<0) {
            System.out.println("Underflow\n");
            return -1;
        }
        return arr[rear];
    }
    void deque() {
        System.out.println(Arrays.toString(arr));
    }
    void addFront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
        else if (front == 0)
            front = size - 1 ;
        else
            front = front - 1;
        arr[front]= key;

    }



    void addRear(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        }
        else if (rear == size-1)
            rear = 0;
        else
            rear = rear+1;
        arr[rear]= key;
    }
    void removeFront() {
        if (isEmpty()) {
            System.out.println("Deque underflow\n");
            return ;
        }
        if (front == rear) {
            front = -1;
            rear = 0;

        }
        else front = front+1;

    }
    void removeRear() {
        if (isEmpty()) {
            System.out.println("underflow");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = 0;

        }
        else if (rear ==0)
            rear = size-1;

        else
            rear = rear -1;
    }
    void isEmpty1() {
        if (isEmpty()) {
            System.out.println("True");
            return;
        }
        else
            System.out.println("False");
    }
    public static void main(String[] args) {
        DequeImplementation dq = new DequeImplementation(5);
        dq.deque();
        System.out.println("adding element at rear end: 5 ");
        dq.addRear(5);
        dq.deque();
        System.out.println("adding element at rear end: 10 ");
        dq.addRear(10);
        dq.deque();
        System.out.println("adding element at front end: 15 ");
        dq.addFront(15);
        dq.deque();
        System.out.println("get rear element: "+dq.getRear());
        dq.removeRear();
        System.out.println("After removing rear element new rear becomes: "+dq.getRear());
        dq.deque();
        System.out.println("adding element at front end");
        dq.addFront(12);
        dq.deque();
        dq.removeFront();
        dq.deque();
        System.out.println("After removing front element, new front becomes: " +dq.getFront());
        dq.removeRear();
        dq.deque();
        System.out.println("After removing rear element, new rear becomes: "+dq.getRear());
        dq.deque();
        System.out.println("The size of the deque is "+dq.size);
        System.out.println("To check if the deque is empty.");
        dq.isEmpty1();
    }

}
	