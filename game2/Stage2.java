import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{

    /**
     * Constructor for objects of class stage2.
     * 
     */
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().scale( 600, 400 );
        addObject( new s2(), 570, 380 );
        addObject( new h2(), 300, 200 );
    }
    public void act(){
        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new Stage3();
            Greenfoot.setWorld( game );
        }
        Greenfoot.playSound("春のキッチン.mp3");
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
