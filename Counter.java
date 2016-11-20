import greenfoot.*;
import java.awt.Color;
public class Counter extends Actor
{
    int score = 0;
    private static final Color transparent = new Color(0,0,0,0);
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(new GreenfootImage("Score : "+score, 30, Color.BLACK, transparent));
    }    
    public void addScore()
    {
        score = score + 10;
    }
}
