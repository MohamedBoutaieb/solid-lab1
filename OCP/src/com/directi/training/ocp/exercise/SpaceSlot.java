package com.directi.training.ocp.exercise;

public class SpaceSlot extends Resource {

    public SpaceSlot(int id) {
        super(id);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int allocate() {
        markSlotBusy(this.id);
        return id;
    }

    @Override
    public void free() {
        // TODO Auto-generated method stub
        markSlotFree(id);

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
