public class TypeB extends Thing {

    private int timeSinceLast = 0;
    
    public TypeB(){
        
    }

    public maybeTurn(){
        int i = rand.nextInt(3); 
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
