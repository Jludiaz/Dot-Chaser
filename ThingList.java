import java.util.*;

public class ThingList {

    ArrayList<Thing>listThings = new ArrayList<>();
    private Thing thing;
    
    public void addThing(Thing t){
        listThings.add(t);
    }

    public Thing getThing(){
        return thing;
    }

    public void setThing(Thing thing){
        this.thing = thing;
    }

    public void printAll(){
        for (Thing t : listThings) {
            t.toString();
        }
    }

    public String toString(){
        return "Thing: " + thing.row + " " + thing.col + " " + thing.lab;
    }

    public void moveAll(){
        for (Thing t : listThings){
            t.maybeTurn();
            t.step();
        }
    }

    
}
