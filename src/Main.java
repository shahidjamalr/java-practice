public class Main {
    public static void main(String[] args) {
        int[][] grid  = {
                {23, 4, 32},
                {12, 34, 11},
                {23, 45, 109}
        };
        int max = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > max) max = grid[i][j];
            }
        }
        System.out.println(max);
    }
}
