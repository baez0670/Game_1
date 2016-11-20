import greenfoot.*;
public class turtle extends lobster
{ 
    private int counter;
    public turtle(){
        counter = 100;
    }
    public void act()
    {
        lookForLobster();
       freeze();
    }
    public void lookForLobster()
    {
        if(canSee(lobster.class))
        {
           eat(lobster.class);
        }
    }
    public void freeze()
    {
        if (counter > 0)
        {
            super.act();
            counter--;
        }
        else if(counter<=0)
        {
            if(counter == -100)
            {
                counter = counter + 200;
            }
            else
            {
                counter = counter - 1;
            }
        }
    }
    public void lookForCrab()
    {
    }
}


       
    
