public class TypeB extends Thing {

    private int timeSinceLast = 0;
    
    public TypeB(int row, int col, char c){
        super(row, col, c);
    }

    public void maybeTurn(){
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
