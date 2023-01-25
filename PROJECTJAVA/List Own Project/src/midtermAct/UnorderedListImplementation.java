package midtermAct;

public class UnorderedListImplementation extends UnorderedList {

    public static void main(String[] args) {

        UnorderedListImplementation test = new UnorderedListImplementation();
        test.List(4);
        test.add(70);
        System.out.println(test.isEmpty());
        test.add(40);
        test.size();
        test.remove(20);
        System.out.println(test.isEmpty());;
        test.search(40);
        test.append(3123120);
        test.index(2);
        test.insert(2, 15);
        test.pop();
        test.pop(3);
        UnorderedListImplementation unorderedList = new UnorderedListImplementation();
        unorderedList.size();
    }
}
