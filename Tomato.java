import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tomato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tomato extends Actor
{
    GreenfootImage T = new GreenfootImage("images/Tomato.png");
    int gravity = 4;
    /**
     * Act - do whatever the Tomato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tomato(){
        T.scale(30, 30);
        setImage(T);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x + gravity, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Bullet.class)){
            world.increaseScore();
            world.removeObject(this);
        }
    }
}
