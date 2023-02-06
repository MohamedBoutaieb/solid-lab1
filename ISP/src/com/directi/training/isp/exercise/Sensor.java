package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ISensor door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
