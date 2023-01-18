import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    Label titleLabel = new Label("shoot Tomato", 75);
    Label start = new Label("Start", 50);
    Label how = new Label("How To Play", 50);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 260, 90);
        prepare();
        addObject(start, 300, 200);
        addObject(how, 300, 250);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(start))
        {
            MyWorld gameWorld =new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.mouseClicked(how)){
            HowToPlay howTo = new HowToPlay();
            Greenfoot.setWorld(howTo);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Gun gun = new Gun();
        addObject(gun,539,105);
        gun.setLocation(538,118);
        
    }
}
