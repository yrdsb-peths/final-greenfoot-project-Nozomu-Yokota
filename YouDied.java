import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouDied here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouDied extends World
{
    int total = 0;
    Label died = new Label("You Died", 50);
    Label re = new Label("Restart?", 40);
    /**
     * Constructor for objects of class YouDied.
     * 
     */
    public YouDied()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(died, 100, 200);
        addObject(re, 100, 250);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(re)){
            MyWorld my = new MyWorld();
            Greenfoot.setWorld(my);
        }
    }
}
