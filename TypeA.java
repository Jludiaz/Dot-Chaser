public class TypeA extends Thing {
    
    public TypeA(int row, int col, char c){
        super(row, col, c);
    }

    public void maybeTurn(){
        int i = rand.nextInt(3);

        if (i == 1) {
            rightTurn();
        }
        
        if (i == 2) {
            leftTurn();
        }
    }
}
