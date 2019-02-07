package main;

public class Piece {
    public Position position;

    public Piece() {
        this.position = new Position(1, 1);
    }

    public boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0
        && newPosition.row < 9 && newPosition.column < 9) {
            return true;
        } else {
            return false;
        }
    }
}