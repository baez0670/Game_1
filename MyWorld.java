import greenfoot.*;
public class MyWorld extends World
{
  Counter counter = new Counter(); 
  int x1 = Greenfoot.getRandomNumber(600);
  int y1 = Greenfoot.getRandomNumber(400);
  int x2 = Greenfoot.getRandomNumber(600);
  int y2 = Greenfoot.getRandomNumber(400);
  int x3 = Greenfoot.getRandomNumber(600);
  int y3 = Greenfoot.getRandomNumber(400);
  int x4 = Greenfoot.getRandomNumber(600);
  int y4 = Greenfoot.getRandomNumber(400);
  int x5 = Greenfoot.getRandomNumber(600);
  int y5 = Greenfoot.getRandomNumber(400);
  int x6 = Greenfoot.getRandomNumber(600);
  int y6 = Greenfoot.getRandomNumber(400);
  int x7 = Greenfoot.getRandomNumber(600);
  int y7 = Greenfoot.getRandomNumber(400);
  int x8 = Greenfoot.getRandomNumber(600);
  int y8 = Greenfoot.getRandomNumber(400);
  int x9 = Greenfoot.getRandomNumber(600);
  int y9 = Greenfoot.getRandomNumber(400);
  int x10 = Greenfoot.getRandomNumber(600);
  int y10 = Greenfoot.getRandomNumber(400);
  int tx = Greenfoot.getRandomNumber(600);
  int ty = Greenfoot.getRandomNumber(400);
    public MyWorld()
    {
        super(600, 400, 1);
        addObject(counter, 60, 10);
        addObject(new crab(), 300, 200);
        addObject(new lobster(), 0, 0);
        addObject(new worm(), x10, y10);
        addObject(new worm(), x1, y9);
        addObject(new worm(), x2, y8);
        addObject(new worm(), x3, y7);
        addObject(new worm(), x4, y6);
        addObject(new worm(), x5, y5);
        addObject(new worm(), x6, y4);
        addObject(new worm(), x7, y3);
        addObject(new worm(), x8, y2);
        addObject(new worm(), x9, y1);
        addObject(new turtle(), tx, ty);
  }
    public Counter getCounter()
  {
    return counter;
  }
}
