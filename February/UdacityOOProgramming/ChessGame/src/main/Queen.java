package main;

public class Queen extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition))
            return false;
        if ((Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row))
            || (newPosition.column == this.position.column || newPosition.row == this.position.row)){
            return true;
        } else {
            return false;
        }

    }
}
