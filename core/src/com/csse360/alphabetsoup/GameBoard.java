package com.csse360.alphabetsoup;

public class GameBoard {
    private GameTile[][] board;
    private final int startingTiles = 2;

    public static final int ROWS = 9;
    public static final int COLUMNS = 9;

    public int score = 0;

    /**
     * Constructor for the board
     * Sets up a 9x9 board
     */
    public GameBoard() {
        board = new GameTile[ROWS][COLUMNS]; // Creates the 9x9

        spawn();
        spawn();

    }

    /**
     * Getter method for the game board
     * @return board
     */
    public GameTile[][] getBoard() {
        return board;
    }

    /**
     * Getter method for game score
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Spawning either an "A" (value 2) or a "B" (value 4) if a move is made
     * Finds the empty tiles on the game board
     */
    public void spawn() {
        boolean emptyTile = true;

        while(emptyTile) {
            // Getting random row and column for placement
            int row = (int)(Math.random() * 9);
            int column = (int)(Math.random() * 9);

            double decideSpawnNum = Math.random();

            if(board[row][column].getValue() == 0) {
                if(decideSpawnNum < 1) {
                    board[row][column] = new GameTile(2);
                    emptyTile = false;
                } else {
                    board[row][column] = new GameTile(4);
                    emptyTile = false;
                }
            }
        }
    }

    public void print() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                String s = board[i][j].toString() + " ";
                System.out.println(s);
            }
            System.out.println("");
        }
        System.out.println("Score: " + score);
    }
}
