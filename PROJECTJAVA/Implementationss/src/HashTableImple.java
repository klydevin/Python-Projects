import java.util.Arrays;

public class HashTableImple {
    int[] arr;
    int size;
    int count;

    public HashTableImple(int initialSize) {
        arr = new int[initialSize];
        size = initialSize;
    }

    void addHash(int key) {
        int hashkey = key;
        boolean hashed = false;
        while (!hashed) {
            int hash = hashkey % size;
            if (arr[hash] == 0) {
                arr[hash] = key;
                count++;
                hashed = true;
            } else {
                hashkey += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void removeHash(int index) {
        arr[index] = 0;
        System.out.println(Arrays.toString(arr));
    }

    void clearHash() {
        arr = new int[size];
        System.out.println(Arrays.toString(arr));
    }

    void size() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        //TEST HERE
    }

}
