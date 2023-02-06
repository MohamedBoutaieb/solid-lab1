package com.directi.training.ocp.exercise;

public abstract class Resource {
    public int id;

    public Resource(int id) {
        this.id = id;
    }

    public abstract int allocate();

    public abstract void free();

    public abstract void markSlotFree(int resourceId);

    public abstract void markSlotBusy(int resourceId);

    public abstract int findFreeSlot();
}
