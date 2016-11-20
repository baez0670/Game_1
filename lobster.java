import greenfoot.*;
public class lobster extends Animal
{
    public void act() 
    {
        turnAtEdge();
        randomTurn();
        move(2);
        lookForCrab();
    }
     public void turnAtEdge()
    {
        if (isAtEdge()) 
        {
            turn(17);
        }
    }
     public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    public void lookForCrab()
    {
        if ( isTouching(crab.class) ) 
        {
            removeTouching(crab.class);
            Greenfoot.stop();
        }
    }
}
