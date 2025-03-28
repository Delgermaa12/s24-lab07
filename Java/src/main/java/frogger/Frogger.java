package frogger;

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

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

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
