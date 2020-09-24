package cards.treasurecards.gualcards;

import cards.Card;
import munchkin.Player;

/**
 * This class simulates the "Steal A Level" card within the game of Munchkin.
 * @author Brian Sanchez
 */
public class StealALevelCard extends Card
{
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a StealALevelCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door" pile.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     */
    public StealALevelCard(String name, String pile, String type) 
    {
        super(name, pile, type);
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    public Player[] stealALevel(Player stealingPlayer, Player playerStolenFrom)
    {
        byte stealingPlayerLevel = stealingPlayer.getLevel();
        
        if(stealingPlayerLevel < 9)
        {
            stealingPlayer.increaseOrDecreaseLevel((byte)(1));
            
            byte playerStolenFromLevel = playerStolenFrom.getLevel();
            
            if(playerStolenFromLevel > 1)
            {
                playerStolenFrom.increaseOrDecreaseLevel((byte)(-1));
            }
        }
        else
        { 
            System.out.println("Can't use this card for the winning level!");
        }
        
        Player[] players = {stealingPlayer, playerStolenFrom};
            
        return players;
        
    } // End of stealALevel method.
    
} // End of StealALevelCard class.
