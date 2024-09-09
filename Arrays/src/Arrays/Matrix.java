package Arrays;

public class Matrix {
    public  static  void Printmatrix(int[][] matrix){
        int sum  =  0;
        int temp = 0;

        // This Approach is brute force Approach it take O(n^2) time complexity
        for (int i = 0; i<matrix.length; i++){
            for (int j= 0; j< matrix[0].length; j++){
                // Primary Diagonal
                if (i==j){
                    sum+= matrix[i][j];
                }
                // Secondary Diagonal
                else if (i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum With O(n^2) Time Complexity: " + sum);

        // Here I'm using One Linear loop
        for (int i =0; i< matrix.length;i++){

            // Primary Diagonal
            temp+= matrix[i][i];

            // Secondary Diagonal
            // Matrix.length-i-1 means column got decreased by one value after every iteration and row got increased by one value
            if (i!= matrix.length-1-i){
                temp+= matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Diagonal Sum With O(n) Time Complexity: " + temp);
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        Printmatrix(matrix);
    }

}

