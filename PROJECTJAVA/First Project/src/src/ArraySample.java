import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class ArraySample {


    private static int[] arr = {0, 20, 30, 40, 0, 78};

    public static void Traverse() {
        for(int x=0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
    public static void Insert() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Array Values are: ");
        System.out.println(numbers);
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a value: ");
        int newNumber = scan.nextInt();
        numbers.add(newNumber);
        System.out.println("New Array Values are: ");
        System.out.println(numbers);
    }
    public static void Delete() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Array Values are: ");
        System.out.println(numbers);
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an index to delete: ");
        int newNumber = scan.nextInt();
        numbers.remove(newNumber);
        System.out.println("New Array Values are: ");
        System.out.println(numbers);

    }
    public static void Search(int[] arr, int key) {
        int arr1[] = {0, 10, 20, 30, 40};
        int key1 = 0;
        boolean flag = false;
        for (int element : arr) {
            if (element == key1){
                flag = true;
                System.out.println("Array:" + Arrays.toString(arr1));
                System.out.println("Element found");
                break;
            }else {
                flag = false;
                System.out.println("Array:" + Arrays.toString(arr1));
                System.out.println("Element not found");
                break;
            }
        }
    }
    public static void Update()	{
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Array Values are: ");
        System.out.println(numbers);
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an index to update: ");
        int newNumber = scan.nextInt();
        System.out.print("Input a value: ");
        Scanner scan1 = new Scanner(System.in);
        int newValue = scan1.nextInt();
        numbers.set(newNumber , newValue);
        System.out.println("New Array Values are: ");
        System.out.println(numbers);
    }
    public static void main(String[] args) {
        try (// TODO Auto-generated method stub
             Scanner in = new Scanner(System.in)) {
            System.out.println("Array Basic Operations");
            System.out.println("[1] Array Traversion");
            System.out.println("[2] Array Insertion");
            System.out.println("[3] Array Deletion");
            System.out.println("[4] Array Search");
            System.out.println("[5] Array Update");
            System.out.println("[6] Exit Program");
            System.out.print("Select operation from (1-6): ");
            int ch = in.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Array values are: ");
                    Traverse();
                    break;
                case 2:
                    Insert();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    int key = 0;
                    Search(arr, key);
                    break;
                case 5:
                    Update();
                    break;
                case 6:
                    System.out.println("Array program terminate ");
                    System.exit(0);
                    break;
            }
        }
    }
}