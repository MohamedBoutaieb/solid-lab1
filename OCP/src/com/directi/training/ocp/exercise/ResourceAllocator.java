package com.directi.training.ocp.exercise;

public class ResourceAllocator {

    public int allocate(Resource res) {
        return res.allocate();
    }

    public void free(Resource res) {
        res.free();
    }
}
