// this implies tha how we can implements the multiple inheritance in java.

public class Interfaces {

    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
        Rook r1 = new Rook();
        r1.moves();
        pawn p1 = new pawn();
        p1.moves();
    }
}

interface ChessPlayer {

    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all ways)");
    }
}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class pawn implements ChessPlayer {

    public void moves() {
        System.out.println("up,down,diagonal");
    }
}
