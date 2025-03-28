package frogger;

  /**
  * Refactor Task 1 & 2: Frogger
  *
  * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
  */

public class Frogger {
    private final Road road;
    private int position;
    private final FroggerID froggerID;

    public Frogger(Road road, int initialPosition, FroggerID froggerID) {
        this.road = road;
        if (!road.isValid(initialPosition)) {
            throw new IllegalArgumentException("Initial position is invalid.");
        }
        this.position = initialPosition;
        this.froggerID = froggerID;
    }

    /**
      * Moves Frogger.
      *
      * @param forward true is move forward, else false.
      * @return true if move successful, else false.
      */

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    /**
      * Records Frogger to the list of records.
      * 
      * @return true if record successful, else false.
      */

    public boolean recordMyself(Records records) {
        return records.addRecord(froggerID);
    }

    public int getPosition() {
        return this.position;
    }

    public FroggerID getFroggerID() {
        return this.froggerID;
    }
}
