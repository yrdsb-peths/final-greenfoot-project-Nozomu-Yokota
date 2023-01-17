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
    Label scoreLabel;
    public int life = 3;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void spawnBullet()
    {
        Bullet B = new Bullet();
        int y = 350;
        int x = 280;
        addObject(B, x, y);
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        BackGround back = new BackGround();
        addObject(back, 300, 200);
        Bullet b = new Bullet();
        addObject(b, 280, 350);
        Gun g = new Gun();
        addObject(g, 300, 350);
        spawnMine();
        spawnTomato();
    }
    
    public void youDied(){
        Label youDiedLabel = new Label("You Died", 100);
        addObject(youDiedLabel, 300, 200);
    }
    
    public void spawnTomato(){
        Tomato T = new Tomato();
        int y = Greenfoot.getRandomNumber(200);
        int x = 0;
        addObject(T, x, y);
    }
    
    public void spawnMine(){
        Mine M = new Mine();
        int y = Greenfoot.getRandomNumber(100);
        int x = 0;
        addObject(M, x, y);
    }
    
    public void increaseScore()
    {
        score++;
    }
}
