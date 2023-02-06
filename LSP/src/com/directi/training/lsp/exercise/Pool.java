package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        DuckI donaldDuck = new Duck();
        DuckI electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckI... ducks)
    {
        for (DuckI duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckI... ducks)
    {
        for (DuckI duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
