import greenfoot.*;
public class crab extends Animal
{
    private int deadWorm = 0;
    public void act() 
    {
        lookForWorm();
        move(4);
       if(Greenfoot.isKeyDown("left")){
            turn(-4);
       }    
       if(Greenfoot.isKeyDown("right")){
            turn(4);
       }
    }    
    public void lookForWorm()
    {
        if(canSee(worm.class))
        {
          eat(worm.class);
          MyWorld world = (MyWorld)getWorld();
          Counter cou = world.getCounter();
          cou.addScore();
          deadWorm = deadWorm + 1;
          if (deadWorm % 10 == 0)
            {
                nextStage();
            }
        }
    }
    public void nextStage()
        {
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new worm(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
          getWorld().addObject( new lobster(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
}

