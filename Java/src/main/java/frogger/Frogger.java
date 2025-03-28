package frogger;

public class Frogger {
    private final Road road;
    private int position;

    public Frogger(Road road, int initialPosition) {
        this.road = road;
        if (!road.isValid(initialPosition)) {
            throw new IllegalArgumentException("Initial position is invalid.");
        }
        this.position = initialPosition;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public int getPosition() {
        return this.position;
    }
}
