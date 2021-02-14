package ship.game;

public class Movement {
    private final Comm comm = new Comm();

    public void moveShip(Position ship) {
        switch (Comm.getDirectionFromScanner()) {
            case "góra":
            case "g":
                ship.subtractionHorizontal();
                break;
            case "lewo":
            case "l":
                ship.subtractionVertical();
                break;
            case "prawo":
            case "p":
                ship.addVertical();
                break;
            case "dół":
            case "d":
                ship.addHorizontal();
                break;
            default:
                System.out.println("niepoprawny kierunek");
        }

    }

}
