import java.util.Iterator;
import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<String>();
        list.add("Steve");
        list.addLast("Rick");
        list.add(2, "Glenn");
        list.remove(0);
        list.addLast("Josh");
        list.removeFirst();

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}
