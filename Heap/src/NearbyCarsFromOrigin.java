import java.util.PriorityQueue;

public class NearbyCarsFromOrigin {
    static class Point implements Comparable<Point> {
        int x, y;
        int distSquare;
        int idx;

        public Point(int x, int y, int distSquare, int idx) {
            this.x = x;
            this.y = y;
            this.distSquare = distSquare;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSquare - p2.distSquare;
        }
    }
    public static void main(String[] args) {
        int[][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++) {
            int distSquare = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSquare, i));
        }
        //nearest K cars from origin
        for(int i=0; i<k; i++) {
            System.out.println("Car: " + pq.remove().idx);
        }
        
    }

}
