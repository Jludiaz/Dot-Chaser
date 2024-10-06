import java.util.*;

public class ThingList {
    public Random rand = new Random(System.currentTimeMillis());

    ArrayList<Thing>listThings = new ArrayList<>();
    private Thing thing;
    
    public void addThing(Thing t){
        listThings.add(t);
    }

    public void printAll(){
        for (Thing t : listThings) {
            System.out.println(t);
        }
    }

    public void moveAll(Random r){

        for (Thing t : listThings){
            t.maybeTurn(r);
            t.step();
        }
    }

    //getter and setter for private variable thing
    public Thing getThing(){
        return thing;
    }

    public void setThing(Thing thing){
        this.thing = thing;
    }

    //not used but test case asks me to have it in file
    private class Node {
        Thing data;
        Node next;
    }
    
}
