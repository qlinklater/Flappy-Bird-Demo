import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    private GreenfootImage image1 = new GreenfootImage("flappybird1.png");
    private GreenfootImage image2 = new GreenfootImage("flappybird2.png");
    private GreenfootImage image3 = new GreenfootImage("flappybird3.png");
    
    private double dy = 0;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        final double GRAVITY = 0.9;
        
        if( getImage().equals(image2) )
        {
            setImage( image3 );
        }
<<<<<<< HEAD
        else if( getImage().equals( image3) )
=======
        else if( getImage().equals(image3) )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            setImage( image1 );
        }
        
        setFlappyRotation();
        
        setLocation( getX(), (int)( getY() + dy ) );
        
        checkKeyPress();
        
        dy += GRAVITY;
        
<<<<<<< HEAD
        checkGameOver();
    }
    
    /**
     * setFlappyRotation changes the rotation of Flappy Bird due to the effects of Gravity
     * 
     * @param there are no parameters
=======
        //checkGameOver();
    }    
    
    /**
     * setFlappyRotation changes the rotation of Flappy Bird
     * due to the effects of gravity
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void setFlappyRotation()
    {
        if( dy > -5 && dy < 5 )
        {
            setRotation( 10 );
        }
        else if( dy > 5 && dy < 10 )
        {
            setRotation( 25 );
        }
<<<<<<< HEAD
        
=======
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        else if( dy > 10 && dy < 13 )
        {
            setRotation( 45 );
        }
        else if( dy > 13 && dy < 15 )
        {
            setRotation( 65 );
        }
        else if( dy > 15 )
        {
            setRotation( 90 );
        }
    }
    
    /**
<<<<<<< HEAD
     * checkKeyPress checks whether the user has pressed the space bar which will make the Flappy Bird "jump"
     * 
     * @param theere are no parameters
=======
     * checkKeyPress checks whether the user has pressed the space bar
     * which will make Flappy Bird "jump"
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void checkKeyPress()
    {
        final int BOOST_SPEED = -7;
        
        if( Greenfoot.isKeyDown("space") )
        {
            dy = BOOST_SPEED;
            setRotation( -15 );
            setImage( image2 );
        }
    }
    
    /**
<<<<<<< HEAD
     * checkGameOver checks if the user has hit a Pipe or the bottom of the world
     * 
     * @param there are no parameters
=======
     * checkGameOver checks if the user has hit a pipe or the bottom
     * of the world
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void checkGameOver()
    {
<<<<<<< HEAD
        FlappyWorld world = (FlappyWorld)getWorld();
        Pipe hitting = (Pipe)getOneIntersectingObject(Pipe.class);
        
        if( getY() >= world.getHeight() -1 || hitting != null )
=======
        //Get a reference to your world
        FlappyWorld world = (FlappyWorld)getWorld();
        Pipe hitting = (Pipe)getOneIntersectingObject(Pipe.class);
        
        if( getY() >= world.getHeight() - 1 || hitting != null )
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        {
            world.addObject( new GameOver(), world.getWidth()/2, world.getHeight()/2 );
            losingAnimation();
            world.updateLeaderBoard();
        }
    }
    
    /**
<<<<<<< HEAD
     * losingAnimation animates Flappy Bird to the ground when the user loses
     * 
     * @param there are no parameters
=======
     * losingAnimation animates Flappy Bird falling to the ground
     * when the user loses
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void losingAnimation()
    {
        while( getY() <= getWorld().getHeight() - 5 )
        {
            setLocation( getX(), getY() + 5 );
            Greenfoot.delay(2);
        }
        
        getWorld().removeObject( this );
    }
<<<<<<< HEAD
=======
    
    
    
    
    
    
    
    
    
    
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
}
