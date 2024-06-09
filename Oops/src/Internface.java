public class Internface {
    public static void main(String[] args) {
        Rook obj = new Rook();
        obj.moves();
    }
}

interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    @Override
    public void moves() {
        System.out.println("left , Right , Up , Down , Diagonal in all 4 directions");
    }
}
class King implements chessplayer{
    @Override
    public void moves() {
        System.out.println("up . left , right , Down and diagonal only one move ");
    }
}
class Rook implements chessplayer{
    @Override
    public void moves() {
        System.out.println("up, down, left ,right");
    }
}