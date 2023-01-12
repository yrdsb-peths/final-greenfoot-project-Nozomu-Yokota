import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    GreenfootImage b = new GreenfootImage("images/bullet.png");
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet()
    {
        b.scale(50, 50);
        setImage(b);
    }
    public void move()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("A"))
        {
            x-= 5;
        }
        if(Greenfoot.isKeyDown("D")){
            x+= 5;
        }
        if(Greenfoot.isKeyDown("space"))
        {
            y -= 5;
        }
        setLocation(x, y);
    }
    public void act()
    {
        move();
        int top = getWorld().getHeight();
        top -=400;
        
        MyWorld world = (MyWorld) getWorld();
        if(getY()<= top){
            world.removeObject(this);   
        }
    }
}
