import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(counter, 100, 40);
        addObject(new crab(), 300, 200);
        for(int i = 0; i<10; i++){
            int x = Greenfoot.getRandomNumber(getWidth()-1);
            int y = Greenfoot.getRandomNumber(getHeight()-1);
            addObject(new worm(), x, y);
    }
}
}
