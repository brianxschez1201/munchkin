package cards.treasurecards.gualcards;

import cards.Card;
import munchkin.PlayedCards;

/**
 * This class simulates the "Kill The Hireling" GUAL card within the game of
 * Munchkin.
 * @author Brian Sanchez
 */
public class KillTheHirelingCard extends BasicGUALCard
{
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a KillTheHirelingCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door" card.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     */
    public KillTheHirelingCard(String name, String pile, String type) 
    {
        super(name, pile, type);
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method checks to see if the player has a Hireling in their played
     * cards; if there is one, kill it (discarding it).
     * @param playedCards The player's played cards.
     * @return The Hireling card if found, null if it is not found.
     */
    public Card checkForHirelingAndKill(PlayedCards playedCards)
    {
        byte numOfPlayedCards = playedCards.getCount();
        
        for(byte i = 0; i < numOfPlayedCards; i++)
        {
            Card currentCard = playedCards.getCard(i);
            String cardName = currentCard.getName();
            
            if(cardName.equals("Hireling"))
            {
                return playedCards.discardCard(i);
            }
        }
        
        return null;
        
    } // End of checkForHirelingAndKill method.
    
} // End of KillTheHirelingCard class.
