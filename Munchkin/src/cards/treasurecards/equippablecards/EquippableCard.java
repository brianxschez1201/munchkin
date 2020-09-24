package cards.treasurecards.equippablecards;

import cards.Card;

/**
 * This class simulates an equippable card within the game of Munchkin.
 * @author Brian Sanchez
 */
public class EquippableCard extends Card
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The bonus the equippable card provides to the player's level.
    private final byte levelBonus;

    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs an EquippableCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door" pile.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     * @param levelBonus The bonus the equippable card provides to the player's
     * level.
     */
    public EquippableCard(String name, String pile, String type, 
                                                                byte levelBonus) 
    {
        super(name, pile, type);
        this.levelBonus = levelBonus;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method gets the level bonus provided by the equippable item.
     * @return The level bonus provided by the equippable item.
     */
    public byte getLevelBonus()
    {
        return levelBonus;
    }
    
} // End of EquippablCard class.
