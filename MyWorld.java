import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    public int life = 3;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void spawnBullet()
    {
        Bullet B = new Bullet();
        int y = 350;
        int x = 300;
        addObject(B, x, y);
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        BackGround back = new BackGround();
        addObject(back, 300, 200);
        Bullet b = new Bullet();
        addObject(b, 300, 350);
        Mine m = new Mine();
        Spike s = new Spike();
        Gun g = new Gun();
        addObject(g, 300, 350);
    }
    
    public void increaseScore()
    {
        
    }
}
