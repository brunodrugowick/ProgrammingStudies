package main;

public class Rock extends Piece {
    @Override
    public boolean isValidMove (Position newPosition) {
        if ((super.isValidMove(newPosition)) &&
        (newPosition.column == this.position.column || newPosition.row == this.position.row)) {
            return true;
        } else {
            return false;
        }
    }
}
