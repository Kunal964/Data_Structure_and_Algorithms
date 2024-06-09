package StringsBasics;

public class GetShortestPath {
        public  static  float shortestpath(String path){
            int x =0 , y =0;
            for (int i = 0; i<path.length(); i++){
                int dir = path.charAt(i);
                // West
                if (dir =='W'){
                    x--;
                }
                // South
                else if (dir == 'S') {
                    y--;
                }
                // North
                else if (dir == 'N'){
                    y++;
                }
                // East
                else {
                    x++;
                }
            }
            // Shortest distance formula Root{(x2-x1)**2 + (y2-y1)**2}
            // x1 = 0, x2 = 0
            int X2 = x*x;
            int Y2 = y*y;

            return (float)Math.sqrt(X2 + Y2); // type casting into float
        }

        public static void main(String[] args) {
            String path = "WNEENNN";
            System.out.println(shortestpath(path));
        }
    }

