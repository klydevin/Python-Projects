import java.util.Arrays;

public class implementDeques {
    public int maxValue = 5;
    int arr[];
    int front;
    int rear;
    int size;

    public implementDeques(int size) {
        arr = new int[maxValue];
        front = -1;
        rear = -1;
        this.size = size;
    }

    void Addfront(int key) {
        if ((front == 0 && rear == size - 1) || (front == rear + 1)) {
            System.out.println("Overflowing queue");
        } else if ((front == -1) && (rear == -1)) {
            front = 0;
            rear = 0;
            arr[front] = key;
        } else if (front == 0) {
            front = size - 1;
            arr[front] = key;
        } else {
            front = front - 1;
            arr[front] = key;
        }
    }

    void AddRear(int key){
        if ((front == 0 && rear == size) || (front == rear + 1))
        {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            rear = 0;
            arr[rear] = key;
        } else if (rear == size - 1) {
            rear = 0;
            arr[rear] = key;
        } else {
            rear++;
            arr[rear] = key;
        }
    }

    void removeFront()
    {
        if ((front == -1) && (rear == -1)) {
            System.out.println("Underflow");
        } else if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size-1) {
            System.out.println("deleted element from front is %d" + arr[front]);
        }

    }



}




