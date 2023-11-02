import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Stage1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().scale( 600, 400 );
        addObject( new s1(), 30, 20 );
        addObject( new h1(), 300, 200 );
    }
    public void act(){
        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new Stage2();
            Greenfoot.setWorld( game );
        }
        Greenfoot.playSound("Blue Skies.mp3");
        if( Greenfoot.isKeyDown( "a" ) ){
            Greenfoot.playSound("女　あーん.wav");
        }
        if( Greenfoot.isKeyDown( "b" ) ){
            Greenfoot.playSound("Gymnopedie no1.mp3");
        }
        if( Greenfoot.isKeyDown( "c" ) ){
            Greenfoot.playSound("銃　素材.wav");
        }
    }
}
