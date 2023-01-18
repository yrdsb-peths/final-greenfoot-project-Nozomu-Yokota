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
    int gravity = 1;
    int speed = 2;
    GreenfootSound explode = new GreenfootSound("explode.mp3");
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
        int x = getX() + speed;
        int y = getY();
        setLocation(x + gravity, y);
        int side = getWorld().getWidth();
        
        MyWorld world = (MyWorld) getWorld();
        if(x >= side){
            world.removeObject(this);
            world.spawnMine();
        }
        else if(isTouching(Bullet.class)){
            removeTouching(Bullet.class);
            YouDied die =new YouDied();
            Greenfoot.setWorld(die);
            explode.play();
        }
    }
    
    public void setSpeed(int sped){
        speed = sped;
    }
}
