import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class s1 extends Actor
{
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 120, 60 );
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-3,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+3,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-3 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+3 );
        }
        // Add your action code here.
    }    
}
