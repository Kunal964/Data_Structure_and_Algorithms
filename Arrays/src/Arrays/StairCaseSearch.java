package Arrays;

public class StairCaseSearch {
        public  static  boolean staircasesearch(int[][] matrix, int key){
            int row = 0, col = matrix[0].length-1;
            while( row< matrix.length && col>=0){
                if (matrix[row][col] == key){
                    System.out.println("Key Found at index (" + row + "," + col + ")");
                    return true;
                }
                // if key is less than matrix[row][col] then we go on the left side of the cell value
                // left of the cell value
                else if (key< matrix[row][col]) {
                    col--;
                }
                // Bottom of the cell value
                else{
                    row++;
                }
            }

            System.out.println("Key Not Found");
            return false;
        }

        public static void main(String[] args) {
            int key = 37;
            int[][] matrix = { {10,20,30,40},
                              {15,25,35,45,},
                              {27,29,37,48},
                              {32,33,39,50},
            };
            System.out.println(staircasesearch(matrix , key));
        }


}
