package com.directi.training.ocp.exercise;

public class TimeSlot extends Resource {

    public TimeSlot(int id) {
        super(id);
    }

    @Override
    public int allocate() {
        markSlotBusy(this.id);
        return this.id;
    }

    @Override
    public void free() {
        markSlotFree(this.id);

    }

    @Override
    public void markSlotFree(int resourceId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void markSlotBusy(int resourceId) {
        // TODO Auto-generated method stub

    }

}
