import java.util.*;

public abstract class Thing {      
    public static Random rand = new Random(System.currentTimeMillis());

    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';

    public Thing(int row, int col, char lab){
        this.row = row;
        this.col = col;
        this.lab = lab;
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }
      
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }
    
    //abstract class so Type classes use and change it
    public abstract void maybeTurn();
      
    public void step() {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        row += dr[dir];
        col += dc[dir];
    }

}
