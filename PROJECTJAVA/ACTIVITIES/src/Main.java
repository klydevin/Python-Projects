import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        int[] newNumbers = new int[6];



        for (int i=0; i<Arrays.toString(numbers).length(); i++) {
            System.out.println(i);
        }

        System.out.println("New Number : " + Arrays.toString(newNumbers));
        System.out.println("Past Number : " + Arrays.toString(numbers));


    }
}



/*

import java.util.Arrays;
import java.util.Scanner;

public class ArraySample {
    private static int[] arr = {0, 20, 30, 40, 0, 78};

    public static void Traverse() {
        for(int x=0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }
    }

    /*public static void Insertion() {
        Scanner numberArrayInput = new Scanner(System.in);
        System.out.print("Enter number of arrays to add : ");
        int numberArray = numberArrayInput.nextInt();

        int[] newarr = new int[arr.length + numberArray];

        for (int i = 0; i < numberArray; i++) {
            System.out.println(i);
            System.out.print("Enter Value in array #"+ arr.length + ":");
            Scanner inputedValue = new Scanner(System.in);

            for (int z=0; z<(arr.length); z++) {
                newarr[z] = arr[z];
            }

            System.out.println(Arrays.toString(newarr));

            newarr[arr.length + 1] = inputedValue.nextInt();

            System.out.println(Arrays.toString(newarr));




            for (int x=0; x<arr.length; x++) {
                System.out.println(x);
            }

            System.out.println("Start Of Array");
            Traverse();
            System.out.println("End Of Array");
        }

    }*/
/*
    public static void Insertion() {
        Scanner numberArrayInput = new Scanner(System.in);
        System.out.print("Enter number of arrays to add : ");
        int numberArray = numberArrayInput.nextInt();

        for (int i=0; i<numberArray; i++) {
            Scanner newElement = new Scanner(System.in);
            arr = AddElement(arr.length, arr, newElement.nextInt());
        }
    }

    public static int[] AddElement(int arrayNumber, int arr[], int x) {

        int newarr[] = new int[arrayNumber + 1];

        for (int i=0; i<arrayNumber; i++) {
            newarr[i] = arr[i];
        }
        newarr[arrayNumber] = x;
        return newarr;
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

        switch (ch){
            case 1:
                System.out.println("Array values are: ");
                Traverse();
                break;

            case 2:
                System.out.println("Array Insertion");
                Insertion();
                break;

            case 6:

                System.out.println("Array program terminate ");
                System.exit(0);
                break;

        }

    }
}


*/