import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Actor
{
    int gravity = 2;
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mine()
    {
        
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y + gravity);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Bullet.class)){
            removeTouching(Bullet.class);
            world.youDied();
        }
    }
}
