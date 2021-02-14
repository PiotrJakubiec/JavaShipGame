package ship.game;

public class Position {
    private int horizontal;

    private int vertical;

    public Position(int horizontal,int vertical ) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }


    public void addHorizontal(){
        horizontal++;
    }
    public void addVertical(){
        vertical++;
    }

    public void subtractionHorizontal(){
        horizontal--;
    }
    public void subtractionVertical(){
        vertical--;
    }




    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }


}
