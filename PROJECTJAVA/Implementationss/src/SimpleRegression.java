import java.util.Arrays;
import java.util.Comparator;

public class SimpleRegression {
    int higher;
    int lower;

    static void sortingData(int arr[][], int columnn) {
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] firsts, int[] seconds) {
                if(firsts[columnn-1] > seconds[columnn-1]) {
                        return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public SimpleRegression(int [][] dataPoints) {

        sortingData(dataPoints,1);

        for (int i = 0, j = 1; j < dataPoints.length; i++, j++) {
            if ((dataPoints[i][1] - dataPoints[j][1]) > 0) {
                System.out.println("First : " + dataPoints[i][1]);
                System.out.println("Second : " + dataPoints[j][1]);

                higher += (dataPoints[i][1] - dataPoints[j][1]);
            } else {
                System.out.println("First2 : " + dataPoints[i][1]);
                System.out.println("Second2 : " + dataPoints[j][1]);
                lower += (dataPoints[j][1] - dataPoints[i][1]);
            }
        }

        if (higher > lower) {
            System.out.println("Positive slope");
        } else if (lower > higher) {
            System.out.println("Negative slope");
        } else {
            System.out.println("Equal");
        }

    }


    public static void main(String[] args) {

        int[][] reg = new int[][] {{1,12},{2,10},{3,9},{4,4},{5,1}};
        int[][] reg2 = new int[][] {{1,12}, {2,5}, {3,1}, {5,11}, {6,10}};

        SimpleRegression sr = new SimpleRegression(reg2);
    }


}