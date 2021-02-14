package ship.game;

import java.util.Random;

public class Board {

    private static int length;
    private int[][] Board;


    public Board(int size) {
        initBoard(size);
    }

    public void addVisitedPosition(Position position) {
        Board[position.getHorizontal()][position.getVertical()]++;
    }

    public void printBoard() {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }


    private void initBoard(int size) {
        Board = new int[size][size];
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                Board[i][j] = 0;
            }
        }


    }
    public static boolean shipOutside(Position ship,int size){
        return ship.getHorizontal() < 0 || ship.getVertical() > size-1 || ship.getHorizontal() > size-1 || ship.getVertical() < 0;
    }

    public boolean shipInSamePlace(){
        for (int i = 0; i <Board.length; i++) {
            for (int j = 0; j <Board.length; j++) {
                if (Board[i][j]> 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static Position getTreasure(int startPosition, int size){
        int treasureHorizontal = new Random().nextInt(size-1) + 1;
        int treasureVertical = new Random().nextInt(size-1) + 1;
        while (treasureHorizontal == startPosition && treasureVertical == startPosition) {
            treasureHorizontal = new Random().nextInt(size) + 1;
            treasureVertical = new Random().nextInt(size) + 1;
        }
        return new Position(treasureHorizontal, treasureVertical);
    }


}