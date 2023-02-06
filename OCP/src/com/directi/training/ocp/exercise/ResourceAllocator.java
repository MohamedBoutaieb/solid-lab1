package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource res) {

        return res.allocate();
    }

    public void free(Resource res) {
        res.free();
    }
}
