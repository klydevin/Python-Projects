import java.util.Arrays;
import java.util.Scanner;

public class ArraySample {
    private static int[] arr = {0, 20, 30, 40, 0, 78};

    public static void Traverse() {
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void Insertion() {
        Scanner numberArrayInput = new Scanner(System.in);
        System.out.print("Enter number of arrays to add : ");
        int numberArray = numberArrayInput.nextInt();

        for (int i=0; i<numberArray; i++) {
            Scanner newElement = new Scanner(System.in);
            System.out.print("Enter new Element : ");
            arr = AddElement(arr.length, arr, newElement.nextInt());

        }
        System.out.println("New array is " + Arrays.toString(arr));

    }

    public static int[] AddElement(int arrayNumber, int[] arr, int x) {
        int[] newArr = new int[arrayNumber + 1];

        if (arrayNumber >= 0) System.arraycopy(arr, 0, newArr, 0, arrayNumber);
        newArr[arrayNumber] = x;
        return newArr;
    }

    public static void Deletion() {
        System.out.println("Current Array :" + Arrays.toString(arr));
        Scanner numberArrayDelete = new Scanner(System.in);
        System.out.print("Number of arrays to delete : ");
        int numArrayDelete = numberArrayDelete.nextInt();

        for (int arrayDeleteInt = 0; arrayDeleteInt < numArrayDelete; arrayDeleteInt++) {
            Scanner indexNumberDelete = new Scanner(System.in);
            System.out.print("Enter Index Number of Array to delete : ");
            int indexNumDelete = indexNumberDelete.nextInt();

            if (indexNumDelete == -1) {
                break;
            } else if (indexNumDelete > arr.length - 1) {
                System.out.println("Invalid Index Number");
            } else {
                arr = RemoveElement(arr.length, arr, indexNumDelete);
            }
        }
    }


    public static int[] RemoveElement(int arrayNumber, int[] arr, int indexNumber) {

        int[] newArr = new int[arr.length - 1];

        for (int i=0, k=0; i<arrayNumber; i++) {
            if (i == indexNumber) {
            } else {
                newArr[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void Search () {

        System.out.println("[1] Index");
        System.out.println("[2] Value");
        System.out.println("[3] Exit");


        Scanner numberSearch = new Scanner(System.in);
        System.out.print("Enter search format : ");
        int searchFormat = numberSearch.nextInt();
        System.out.println();


        switch (searchFormat) {

            case 1:
                Scanner indexNum = new Scanner(System.in);
                System.out.print("Enter index you want to search : ");
                int intNumIndex = indexNum.nextInt();

                SearchElement(arr, intNumIndex, 1);
                break;

            case 2:
                Scanner indexNum2 = new Scanner(System.in);
                System.out.print("Enter value you want to search : ");
                int intNumIndex2 = indexNum2.nextInt();

                SearchElement(arr, intNumIndex2, 2);
                break;

            case 3:
        }



    }


    public static void SearchElement(int[] arr, int numIndex, int searchFormat) {
        switch (searchFormat) {
            case 1:
                System.out.println("Searched value of index is " + arr[numIndex]);

            case 2:
                int k=0;
                for (int i : arr) {
                    if (i == numIndex) {
                        System.out.println("Closest index value is " + k);
                    } else {
                        k++;
                    }
                }
        }

    }

    public static void Update() {
        Scanner index = new Scanner(System.in);
        System.out.print("Enter index you want to update : ");
        int indexNum = index.nextInt();

        if (indexNum>arr.length) {
            System.out.println("Invalid Index Number");
        } else {
            Scanner newIndex = new Scanner(System.in);
            System.out.print("Enter new index value : ");
            int newIndexVal = newIndex.nextInt();
            arr[indexNum] = newIndexVal;
        }
        System.out.println("New Array value are " + Arrays.toString(arr));
    }





    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Array Basic Operations");
        System.out.println("[1] Array Traversion");
        System.out.println("[2] Array Insertion");
        System.out.println("[3] Array Deletion");
        System.out.println("[4] Array Search");
        System.out.println("[5] Array Update");
        System.out.println("[6] Exit Program");
        System.out.print("Select operation from (1-6): ");
        int ch = in.nextInt();

        switch (ch) {
            case 1 -> {
                System.out.println("Array values are: ");
                Traverse();
            }
            case 2 -> {
                System.out.println("Array Insertion");
                Insertion();
            }
            case 3 -> {
                System.out.println("Array Deletion");
                Deletion();
            }
            case 4 -> {
                System.out.println("Array Search");
                Search();
            }
            case 5 -> {
                System.out.println("Array Update");
                Update();
            }
            case 6 -> {
                System.out.println("Array program terminate ");
                System.exit(0);
            }
        }
        }

    }

