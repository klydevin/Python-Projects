import java.util.Arrays;

public class DequeingImplement {
    static final int Max = 5;
    int arr[];
    int front;
    int rear;
    int size;

    public DequeingImplement(int size)
    {
        arr = new int[Max];
        front = -1;
        rear = -1;
        this.size = size;
    }

    boolean isFull()
    {
        return ((front == 0 && rear == size - 1) || front == rear-1);
    }

    boolean isEmpty()
    {
        return (front == -1);
    }

    void deque()
    {
        System.out.println(Arrays.toString(arr));
    }

    int getFront()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\n");
            return -1;
        }
        return arr[front];
    }

    int getRear()
    {
        if (isEmpty() || rear < 0)
        {
            System.out.println("Underflow\n");
            return -1;
        }
        return arr[rear];
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
        else if (rear == Max-1)
            rear = 0;
        else
            rear = rear+1;
        arr[rear]= key;
    }

    void removeFrontTest()
    {
        if (isEmpty()) {
            System.out.println("Underflow \n");
            return;
        }
    }


    void removeFront()
    {
        if (isEmpty())
        {
            System.out.println("Underflow \n");
            return;
        }
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            if (front == Max-1)
            {
                front = 0;
            }
            else
            {
                front = front + 1;
            }
        }
    }

    void removeRear()
    {
        if (isEmpty())
        {
            System.out.println("Underflow \n");
            return;
        }
        if (front == rear)
        {
            front = 0;
            rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else
        {
            rear = rear - 1;
        }
    }

    public static void main(String[] args)
    {
        DequeingImplement deq = new DequeingImplement(5);
        System.out.println("Deque");
        deq.deque();
        System.out.println();

        System.out.println("AddFront");
        deq.addFront(10);
        deq.deque();
        System.out.println();

        System.out.println("Add Front");
        deq.addFront(9);
        deq.deque();
        System.out.println();

        System.out.println("Add Rear");
        deq.addRear(40);
        deq.deque();
        System.out.println();


        System.out.println("Add Rear");
        deq.addRear(39);
        deq.deque();
        System.out.println();

        System.out.println("Remove Front");
        deq.removeFront();
        deq.deque();
        System.out.println();


        System.out.println("Remove Front");
        deq.removeFront();
        deq.deque();
        System.out.println();


        System.out.println("Add Front");
        deq.addFront(29);
        deq.deque();
        System.out.println();


        System.out.println("Remove Rear");
        deq.removeRear();
        deq.deque();
        System.out.println();


        System.out.println("Remove Rear");
        deq.removeRear();
        deq.deque();
        System.out.println();



        System.out.println("AddRear");
        deq.addRear(10231);
        deq.deque();
        System.out.println();

    }

}
