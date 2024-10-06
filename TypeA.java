import java.util.*;

public class TypeA extends Thing {
    
    public TypeA(){

    }

    public maybeTurn(){
        int i = rand.nextInt(3);

        if (i == 1) {
            rightTurn();
        }
        
        if (i == 2) {
            leftTurn();
        }
    }
}
