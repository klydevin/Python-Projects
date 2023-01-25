import java.util.Arrays;

public class ImplementationDeque {
    int[] nums;
    int front, rear;
    int initialSize;

    //Creates an array
    public ImplementationDeque() {
        this.nums = new int[initialSize];
        this.front = this.rear = -1;
    }

    //Prints the Deque Array
    void deque() {
        System.out.println(Arrays.toString(nums));
    }


    //Adding data from the front
    void addFront(int data) {
        if (rear == -1) { rear++; }
        int[] tempArr = new int[initialSize + 1]; // Creates temporary Array
        ++front;

        for (int i = 0; i < initialSize; i++) {
            tempArr[i] = nums[i]; // Copies datas from the main array to temporary array
        }
        tempArr[front] = data;
        nums = tempArr; // Putting data from temporary array to main array
        initialSize = nums.length; // Update array size
        System.out.println(Arrays.toString(nums));
    }


    //Removing data from the front
    void removeFront() {
        if (initialSize == 0) {
            System.out.println("Underflow"); // Determine if the array has data or not
        }
        int[] tempArr = new int[initialSize - 1]; // Temporary Array
        --front;

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = nums[i]; //Copies Array
        }
        nums = tempArr; // Pasted Array to main
        initialSize = nums.length; // Updates array size
        System.out.println(Arrays.toString(nums));
    }


    //Adding new data to the rear
    void addRear(int data) {
        if (rear == -1) { ++rear; }
        int[] tempArr = new int[initialSize + 1];
        ++front;

        for (int i = 0, j = 1; i < initialSize; i++, j++) {
            tempArr[j] = nums[i];
        }
        tempArr[rear] = data;
        nums = tempArr;
        initialSize = nums.length;
        System.out.println(Arrays.toString(nums));
    }

    //Removing data from the rear
    void removeRear() {
        int[] tempArr = new int[initialSize - 1];
        --front;

        for (int i=0, j = 1; i<tempArr.length; i++, j++) {
            tempArr[i] = nums[j];
        }
        nums = tempArr;
        initialSize = nums.length;
        System.out.println(Arrays.toString(nums));
    }

    //Returns boolean value if array is empty or not
    boolean isEmpty() {
        System.out.println(front == -1);
        return (front == -1);
    }

    //Initiate Size Of Array
    void size() {
        System.out.println(initialSize);
    }

    public static void main(String[] args) {
        //TEST HERE
        ImplementationDeque dq = new ImplementationDeque();
        dq.addFront(123);
    }

}