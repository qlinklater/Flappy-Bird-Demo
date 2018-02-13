import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    private String name;
    private boolean scoreChanged;
    
    /**
<<<<<<< HEAD
     * Score is the contrctor of objects of type Score
     * 
     * @param there are no parameters
=======
     * Score is the constructor of objects of type Score
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return an object of type Score
     */
    public Score()
    {
        GreenfootImage scoreImage;
        
        score = 0;
<<<<<<< HEAD
        name ="";
        scoreChanged = false;
        
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score ), 30, Color.BLACK, Color.WHITE );
=======
        name = "";
        scoreChanged = false;
        
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        setImage( scoreImage );
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
<<<<<<< HEAD
     * @param there are no parameters
=======
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
        {
            display();
        }
<<<<<<< HEAD
    }   
    
    /**
     * countScore inceases the score
     * 
     * @param there are no parameters
=======
    } 
    
    /**
     * countScore increases the score
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    public void countScore()
    {
        score++;
        scoreChanged = true;
    }
    
    /**
     * setPlayerName changes the name displayed on the leaderboard
     * 
     * @param playerName is the new player's name
     * @return Nothing is returned
     */
    public void setPlayerName( String playerName )
    {
        name = playerName;
        scoreChanged = true;
    }
    
    /**
     * getScore gets the current score for the player
     * 
<<<<<<< HEAD
     * @param there are no parameters
     * @return an integer repersenting the player's score
=======
     * @param There are no parameters
     * @return an integer representing the player's score
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     */
    public int getScore()
    {
        return score;
    }
    
    /**
<<<<<<< HEAD
     * display displays the Scoreboard's image 
     * 
     * @param there are no parameters
=======
     * display displays the Scoreboard's image
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void display()
    {
<<<<<<< HEAD
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score ), 30, Color.BLACK, Color.WHITE );
        setImage( newImage );
        scoreChanged = false;
    }
=======
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( newImage );
        scoreChanged = false;
    }
    
    
    
    
    
    
    
    
    
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
}
