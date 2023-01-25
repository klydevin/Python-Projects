package midtermAct;
import java.util.Scanner;

public class UnorderedList implements UnorderedListADT{
    private static Scanner in = new Scanner (System.in);
    private static int size;
    private static int [] DataList;
    private static int initial =0;

    public static void setListToZero(int n) {
        size=n;
        DataList = new int[size];
        for(int a = 0; a<n; a++) {
            DataList[a]=0;
        }
    }
    public static void displayList() {
        System.out.println();
        for(int a = 0; a<size; a++) {
            System.out.print("["+ DataList[a]+"] ");
        }
        System.out.println();
    }
    @Override
    public void List(int number) {
        setListToZero(number);
        displayList();
    }
    @Override
    public void add(int datas) {
        if(DataList[0]==0) {
            DataList[0]=datas;
            initial++;
        }else {
            for(int a = initial; a>0; a--) {
                DataList[a]= DataList[a-1];
            }
            DataList[0]=datas;
            initial++;
        }
        displayList();
    }
    @Override
    public void remove(int data) {
        for (int x = 0; x< initial; x++) {
            if (DataList[x] == data) {
                System.out.println("Number " + data + " was removed.");
                DataList[x] = 0;
                for(int a = x; a< initial; a++) {
                    DataList[a]= DataList[a+1];
                }
                initial--;
                displayList();
                return;
            }
        }
        System.out.print("No item found in the list.");
    }
    @Override
    public boolean isEmpty() {
        if(DataList[0]==0) {
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void size() {
        int size = 0;
        for(int i = 0; i< DataList.length; i++) {
            if(DataList[i] !=0) {
                size +=1;
            }
        }
        System.out.println("The size of the list is:" + size);
    }
    @Override
    public void append(int data) {
        if(DataList.length == initial) {
            System.out.print("No more available space.");
            displayList();
        }
        else {
            DataList[initial] = data;
            initial++;
            displayList();
        }
    }
    @Override
    public void index(int data) {
        for(int i = 0; i< initial; i++) {
            if (DataList[i] == data) {
                System.out.println("The item " + data + " is in the position " + i + " of the list.");
                return;
            }
        }
        System.out.println("Item " + data + " was not found in the list");
    }
    @Override
    public void insert(int index, int data) {
        if (DataList.length == initial) {
            System.out.println("No more spaces!");
            displayList();
            return;
        }
        else {
            for (int i = initial; i>index; i-- ) {
                DataList[i] = DataList[i - 1];
            }
        }
        DataList[index] = data;
        displayList();
        initial++;
    }
    @Override
    public void search(int data) {
        for (int i = 0; i< initial; i++) {
            if (DataList[i] == data) {
                System.out.println("Number " + data + " found.");
                DataList[i] = data;
                for(int ii = i; ii< initial; ii++) {
                    DataList[ii]= DataList[ii];
                }
                initial--;
                displayList();
                return;
            }
        }
        System.out.print("No item found in the list.");
    }
    @Override
    public void pop() {
        if(initial >0) {
            int tmp = DataList[initial -1];
            DataList[initial -1]=0;
            System.out.println(tmp +" was removed from the unordered list");
            initial--;
        }
        displayList();
    }
    @Override
    public void pop(int index) {
        for (int i = 0; i< initial; i++) {
            if (i == index - 1) {
                System.out.println("position " + index + "was removed from the list.");
                DataList[i] = 0;
                initial--;
                for(int a = i; a< initial; a++) {
                    DataList[a]= DataList[a+1];
                }
                DataList[initial] = 0;
                displayList();
                return;
            }
        }
        System.out.print("No item found in the list.");
    }
}
