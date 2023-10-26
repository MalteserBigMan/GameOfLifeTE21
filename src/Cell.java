public class Cell {
    boolean isAlive = true;
    int x = 0;
    int y = 0;

    public Cell(boolean isAlive, int x, int y) {
        this.isAlive = isAlive;
        this.x = x;
        this.y = y;
    }

    public boolean isAlive(int x, int y) {
        return isAlive;
    }

}
