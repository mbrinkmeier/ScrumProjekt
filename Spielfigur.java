import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spielfigur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spielfigur extends Actor
{
    /**
     * Act - do whatever the Spielfigur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spielfigur(){
        this.getImage().scale(10,10);
    }    
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY()-1);
        }
        
        if(Greenfoot.isKeyDown("down")) {
            this.setLocation(this.getX(), this.getY()+1);
        }
        
        if(Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX()-1, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX()+1, this.getY());
        }
        
    } 
}
