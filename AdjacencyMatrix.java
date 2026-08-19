public class AdjacencyMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 0 }
        };

        System.out.println("   A B C D E");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print((char) ('A' + i) + "  ");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}