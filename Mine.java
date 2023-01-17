import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Actor
{
    GreenfootImage M = new GreenfootImage("images/Mine.png");
    int gravity = 2;
    /**
     * Act - do whatever the Mine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mine()
    {
        M.scale(40, 40);
        setImage(M);
    }
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x + gravity, y);
        int side = getWorld().getWidth();
        side -= 600;
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() == side){
            world.removeObject(this);
            world.spawnMine();
        }
        if(isTouching(Bullet.class)){
            removeTouching(Bullet.class);
            world.youDied();
        }
    }
}
