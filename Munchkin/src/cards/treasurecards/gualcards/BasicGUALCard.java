package cards.treasurecards.gualcards;

import cards.Card;
import munchkin.Player;

/**
 * This class simulates a basic "Go Up A Level" card within the game of 
 * Munchkin.
 * @author Brian Sanchez
 */
public class BasicGUALCard extends Card
{
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a BasicGUALCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door" pile.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     */
    public BasicGUALCard(String name, String pile, String type) 
    {
        super(name, pile, type);
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method is used to level up the player by 1 level if they use the 
     * GUAL card.
     * @param levelingPlayer The leveling player.
     * @return The player with a +1 level increase.
     */
    public Player goUpALevel(Player levelingPlayer)
    {
        byte level = levelingPlayer.getLevel();
        
        if(level < 9)
        {
            levelingPlayer.increaseOrDecreaseLevel((byte)(1));
        }
        else
        {
            System.out.println("Can't use this card for the winning level!");
        }
        
        return levelingPlayer;
    }
    
} // End of BasicGUALCard class.
