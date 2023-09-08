package ch009.examples;

public class Main {
    public static void main(String[] args) {
        int[][] multi = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        print2DIntArray(multi);

        int[][] triangle = new int [16][];
        fillMyRaggedArray(triangle);
        print2DIntArray(triangle);
    }
    
    public static int[][] fillMyRaggedArray(int[][] triangle) {
        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new int[row + 1];
            for (int elem = 0; elem < (row + 1); elem++) {
                triangle[row][elem] = elem;
            }
        }
        return triangle;
    }
    public static void print2DIntArray(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
            System.out.println();
        }
    }
}
