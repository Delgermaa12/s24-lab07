package frogger;

import java.util.HashSet;
import java.util.Set;

public class Records {
    private final Set<FroggerID> recordSet;

    public Records() {
        this.recordSet = new HashSet<>();
    }

    public boolean addRecord(FroggerID froggerID) {
        return this.recordSet.add(froggerID);
    }

    public boolean hasRecord(FroggerID froggerID) {
        return this.recordSet.contains(froggerID);
    }
}
