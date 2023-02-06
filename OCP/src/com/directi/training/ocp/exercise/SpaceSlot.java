package com.directi.training.ocp.exercise;

public class SpaceSlot extends Resource {

    public SpaceSlot(int id) {
        super(id);

    }

    @Override
    public int allocate() {
        markSlotBusy(this.id);
        return id;
    }

    @Override
    public void free() {
        markSlotFree(id);
    }

    @Override
    public void markSlotFree(int resourceId) {

    }

    @Override
    public void markSlotBusy(int resourceId) {

    }

    @Override
    public int findFreeSlot() {
        return 0;
    }

}
