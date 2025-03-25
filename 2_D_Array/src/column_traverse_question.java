public class column_traverse_question {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        // arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = n;
                System.out.print(arr[i][j] + " ");
                n++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        traverse(arr);
    }

    public static void traverse(int[][] arr) {
        for (int column = 0; column < arr[0].length; column++) {
            if (column % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][column] + " ");
                }
//               System.out.println();
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][column] + " ");
                }
                // System.out.println();
            }

        }
    }
}
