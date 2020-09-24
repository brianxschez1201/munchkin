package cards.treasurecards.gualcards;

import munchkin.Player;

/**
 * This class simulates the "Mutilate the Bodies" card within the game of 
 * Munchkin.
 * @author Brian Sanchez
 */
public class MutilateTheBodiesCard 
{
    public Player mutilateTheBodies(Player levelingPlayer, String phase)
    {
        if(phase.equals("victory"))
        {
            byte level = levelingPlayer.getLevel();
            
             if(level < 9)
            {
                levelingPlayer.increaseOrDecreaseLevel((byte)(1));
            }
            else
            {
                System.out.println("Can't use this card for the winning "
                                                                    + "level!");
            }
        }
        else
        {
            System.out.println("Card can only be used after defeating a "
                                                                  + "monster.");
        }
        
        return levelingPlayer;
        
    } // End of mutilateTheBodies method.
    
} // End of MutilateTheBodiesCard class.
