import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/**
 * Dies ist nur ein Test (MB)
 * Noch ein Test (MB)
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 50x50 cells with a cell size of 10x10 pixels.
        super(50, 50, 10); 
        
        Stein[] steine = new Stein[36];
        
        // erste Reihe setzen
        for(int i=0; i<10; i++){
            steine[i] = new Stein();
            this.addObject(steine[i], i*5+2, 2);
        }
        
        //letzte Reihe setzen
        for(int i=10; i<20; i++){
            steine[i] = new Stein();
            this.addObject(steine[i], (i-10)*5+2, 47);
        }
        
        //linke Reihe
        for(int i=20; i<28; i++){
            steine[i] = new Stein();
            this.addObject(steine[i], 2, (i-20)*5+7);
        }
        
        //rechte Reihe
        for(int i=28; i<36; i++){
            steine[i] = new Stein();
            this.addObject(steine[i], 47, (i-28)*5+7);
        }
              
        Spielfigur spielfigur = new Spielfigur();
        addObject(spielfigur, 25, 25);
    }
}
