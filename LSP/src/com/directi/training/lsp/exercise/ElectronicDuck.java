package com.directi.training.lsp.exercise;

public class ElectronicDuck implements DuckI
{
    private boolean _on = false;

    @Override
    public void quack()
    { 
        this.turnOn();
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {   
        this.turnOn();
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }
    

    public void turnOff()
    {
        _on = false;
    }
}
