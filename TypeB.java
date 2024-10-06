import java.util.*;

public class TypeB extends Thing {


    // private int Random = rand.nextInt(3); 
    private int timeSinceLast = 0;
    
    public TypeB(int row, int col, char c){
        super(row, col, c);
    }

    public void maybeTurn(Random r){
        int i = r.nextInt(3);
        timeSinceLast++;

        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            if (i == 1) {
                rightTurn();
            }
            if (i == 2) {
                leftTurn();
            }
        }
    }

}
