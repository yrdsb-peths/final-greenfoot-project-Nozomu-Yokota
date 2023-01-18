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
    int speed = 1;
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
        int x = getX() + speed;
        int y = getY();
        setLocation(x + gravity, y);
        int side = getWorld().getWidth();
        
        MyWorld world = (MyWorld) getWorld();
        if(x >= side){
            world.removeObject(this);
            world.spawnTomato();
        }
        else if(isTouching(Bullet.class)){
            world.removeObject(this);
            world.spawnTomato();
            world.increaseScore();
        }
    }
    
        public void setSpeed(int sped){
        speed = sped;
    }
}
