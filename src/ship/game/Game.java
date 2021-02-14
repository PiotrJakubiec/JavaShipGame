package ship.game;

public class Game {
    public static void main(String[] args) {
    int size = Comm.getSizeFromScanner();
    Board Board = new Board(size);
    Position ship = new Position(size / 2, size / 2);
    Position treasure = Board.getTreasure(ship.getHorizontal(), size);
    Movement movement = new Movement();

    while (true) {
        Board.addVisitedPosition(ship);
        Board.printBoard();
        if (Board.shipOutside(ship, size)) {
            System.out.println("Statek poza planszą");
            System.out.println("Koniec gry !!!");
            break;
        }
        else if (Board.shipInSamePlace()) {
            System.out.println("Statek na tym smamym polu");
            System.out.println("Koniec gry !!!");
            break;
        }
        else if
        (ship.getHorizontal() == treasure.getHorizontal() && ship.getVertical() == treasure.getVertical()){
            System.out.println("Znalazłeś skarb !!!");
            System.out.println("Koniec gry!!!");
            break;
        }

        movement.moveShip(ship);
    }


}
}
