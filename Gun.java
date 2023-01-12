import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    GreenfootImage g = new GreenfootImage("images/images-removebg-preview.png");
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gun()
    {
        g.scale(100, 100);
        setImage(g);
    }
    public void move(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("A"))
        {
            x-= 5;
        }
        if(Greenfoot.isKeyDown("D")){
            x+= 5;
        }
        setLocation(x, y);
    }   
    public void act()
    {
        move();
    }
}
