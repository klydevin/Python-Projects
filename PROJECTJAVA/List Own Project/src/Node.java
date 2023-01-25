import java.util.ArrayList;
import java.util.Arrays;

public class Node<T> {
    private T datas;
    private ArrayList<Node> neighbors;

    public Node(T data) {
        datas = data;
        neighbors = new ArrayList<Node>();
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T data) {
        datas = data;
    }

    public Node[] getNeighbors() {
        return neighbors.toArray(new Node[0]);
    }

    public void setNeighbors(Node[] data) {
        for (int i = 0; i < data.length; i++) {
            neighbors.add(data[i]);
        }
    }

}
