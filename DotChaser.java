import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

/*
* A "Thing" moves in a grid world. A TypeA Thing randomly
* decides to turn left or right (or not turn) every "round",
* and, afterward, takes a step forward.  A TypeB Thing
* only considers making a random turn every 10th round.
*
*/
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 ) {
      N = Integer.parseInt(args[0]);
    }

      // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY
      int count = 0;
      ThingList thingList = new ThingList();

      while( true ) {
        // Every N rounds, add another typeA and typeB Thing.
        if( count % N == 0 ) {
          //THING A
          TypeA tA = new TypeA(45, 50, 'r');
          thingList.addThing(tA);

          //THING B
          TypeB tB = new TypeB(55,50,'b');
          thingList.addThing(tB);
        }
        // Print out each thing.
        // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
        // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
        thingList.printAll();
        
        // Move each thing.
        // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
        thingList.moveAll(rand);
   
        count++;
      }
  }
}
