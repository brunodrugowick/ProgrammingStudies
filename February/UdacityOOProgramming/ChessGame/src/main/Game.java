package main;

public class Game {
    public Piece[][] board;

    public Game() {
        board = new Piece[8][8];
    }

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Queen queen = new Queen();
        System.out.println(queen.isValidMove(new Position(2, 1)));
    }
}