import java.util.*;

public class TypeC extends Thing{

    public TypeC(int row, int col, char c){
        super(row, col, c);
    }

    public void maybeTurn(Random r){

        int i = r.nextInt(3);

        if (i == 3) {
            rightTurn();
            leftTurn();
            rightTurn();
            rightTurn();
            leftTurn();
        }
    }

}
