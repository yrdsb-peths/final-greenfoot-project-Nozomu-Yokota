import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{
    Label back = new Label("Back to Title", 35);   
    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        addObject(back, 100, 375);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(back))
        {
            Title title =new Title();
            Greenfoot.setWorld(title);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("How To Play?", 75);
        addObject(label,297,63);
        label.setLocation(312,65);
        Label label2 = new Label("Press [space] to shoot Bullet", 25);
        addObject(label2,286,172);
        label2.setLocation(297,159);
        Label label3 = new Label("If you hit Tomato u get 1 point but even the Bullet hits Tomato", 25);
        addObject(label3,294,208);
        label3.setLocation(300,192);
        Label label4 = new Label("the Bullet will penetrate the Tomato so there is a possibility", 25);
        addObject(label4,294,232);
        label4.setLocation(300,256);
        label3.setLocation(291,218);
        Label label5 = new Label("to hit bomb after u hit the Tomato", 25);
        addObject(label5,285,314);
        label5.setLocation(296,294);
        Label label6 = new Label("if you hit Tomato 10 times the mine and Tomato move faster", 25);
        addObject(label6,284,340);
        label6.setLocation(301,334);
    }
}
