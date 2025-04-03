//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//
//public class Flood_Fill {
//
//    public static void main(String[] args) throws Exception {
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      int m = sc.nextInt();
//      int[][] arr = new int[n][m];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        boolean[][] visited = new boolean[n][m];
//        floodfill(arr, 0,0, "", visited);
//    }
//
//
//    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {
//
//        // Negative BaseCase => Bahar jane se bachayega
//        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true ){
//            return;
//        }
//
//
//        if (row == maze.length - 1 && col == maze[0].length - 1){
//            System.out.println(psf);
//            return;
//        }
//
//
//
//        visited[row][col] = true;
//        floodfill(maze, row - 1, col, psf + "t", visited);  // top
//        floodfill(maze, row, col - 1, psf + "l", visited);  // left
//        floodfill(maze, row + 1, col, psf + "d", visited);  // down
//        floodfill(maze, row, col + 1, psf + "r", visited);  // right      -> topleft to downright
//
//
//
//
//
//
//
//
//
//
//    }
//
//}










// Properly commented Code



package Recursion;

import java.util.*;

public class Flood_Fill {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the maze (n x m)
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];  // Creating a 2D array to store the maze

        // Taking input for the maze grid
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close(); // Closing the Scanner to prevent memory leaks

        // Creating a 2D boolean array to track visited cells
        boolean[][] visited = new boolean[n][m];

        // Calling the floodfill function starting from (0,0)
        floodfill(arr, 0, 0, "", visited);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {

        // **Base Case: If the current position is out of bounds or is a wall (1) or already visited**
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length ||
                maze[row][col] == 1 || visited[row][col]) {
            return;
        }

        // **Success Condition: If the destination (bottom-right corner) is reached, print the path**
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf); // Printing the path string
            return;
        }

        // **Marking the current cell as visited**
        visited[row][col] = true;

        // **Recursive calls for all four directions**
        floodfill(maze, row - 1, col, psf + "t", visited);  // Move Up (Top)
        floodfill(maze, row, col - 1, psf + "l", visited);  // Move Left
        floodfill(maze, row + 1, col, psf + "d", visited);  // Move Down
        floodfill(maze, row, col + 1, psf + "r", visited);  // Move Right

        // **Backtracking: Unmark the current cell after exploring all paths**
        visited[row][col] = false;
    }
}














