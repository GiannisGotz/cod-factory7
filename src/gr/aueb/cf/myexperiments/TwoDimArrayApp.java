package gr.aueb.cf.myexperiments;

public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] grid = new int[2][2];


        grid [0][0]= 0;
        grid [0][1]= 1;
        grid [1][0]= 2;
        grid [1][1]= 3;
//
//        int[][] grid = {{0,1},{2,3}};

        for (int[] row : grid) {
            for ( int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        for ( int i = 0; i < grid.length; i++ ){
            for ( int j = 0; j < grid[i].length; j++ ) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
