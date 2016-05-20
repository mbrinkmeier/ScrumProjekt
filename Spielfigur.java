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
        this.getImage().scale(40,40);
    }    
    public void act() 
    {
        movement();
    } 
    // Klasse movement steuert die Figur und prüft Kollision mit Klasse Bloecke
    public void movement(){
        Actor ObenRechts = getOneObjectAtOffset(1, -2, Bloecke.class);
        Actor ObenLinks = getOneObjectAtOffset(-1, -2, Bloecke.class);
        Actor UntenRechts = getOneObjectAtOffset(1, 2, Bloecke.class);
        Actor UntenLinks = getOneObjectAtOffset(-1, 2, Bloecke.class);
        Actor LinksOben = getOneObjectAtOffset(-2, -1, Bloecke.class);
        Actor LinksUnten = getOneObjectAtOffset(-2, 1, Bloecke.class);
        Actor RechtsOben = getOneObjectAtOffset(2, -1, Bloecke.class);
        Actor RechtsUnten = getOneObjectAtOffset(2, 1, Bloecke.class);
    
      if(Greenfoot.isKeyDown("up") && ObenRechts == null && ObenLinks == null) {
            this.setLocation(this.getX(), this.getY()-1);
        }
        
        if(Greenfoot.isKeyDown("down") && UntenRechts == null && UntenLinks == null) {
            this.setLocation(this.getX(), this.getY()+1);
        }
        
        if(Greenfoot.isKeyDown("left") && LinksOben == null && LinksUnten == null) {
            this.setLocation(this.getX()-1, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right") && RechtsOben == null && RechtsUnten == null) {
            this.setLocation(this.getX()+1, this.getY());
        }
        
        if(Greenfoot.isKeyDown("space")){
            this.getWorld().addObject(new Bombe(), this.getX(), this.getY());
        }
    }
}    
