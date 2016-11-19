import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends lobster implements Freeze
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    
    public turtle(){
        counter = 100;
    }
    public void act()
    {
         lookForLobster();
        if(counter <= 0 )
        super.act();
        else
        counter--;
    }
    public void freeze(int count){
        counter = count;
    }

      public void lookForLobster()
        {
    
        if(canSee(lobster.class))
        {
           eat(lobster.class);
}
}
}


       
    
