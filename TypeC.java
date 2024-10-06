public class TypeC extends Thing{
    public TypeC(int row, int col, char c){
        super(row, col, c);
    }

    public void maybeTurn(){
        int i = rand.nextInt(3); 

        if (i == 3) {
            rightTurn();
            leftTurn();
            rightTurn();
            rightTurn();
            leftTurn();
        }
    }

}
