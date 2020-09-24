package cards.treasurecards.usableonlyoncecards;

import cards.Card;

/**
 * This class simulates a simple usable only item within the game of Munchkin.
 * @author Brian Sanchez
 */
public class UsableOnlyItem extends Card
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The level bonus the usable only item provides to the player or monster.
    private final byte levelBonus;
    
    // The gold value of the usable only item.
    private final short goldValue;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...

    /**
     * This method constructs a SimpleUsableOnlyItem object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "monster".
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     * @param levelBonus The level bonus the usable only item provides to the 
     * player or monster.
     * @param goldValue The gold value of the usable only item.
     */
    public UsableOnlyItem(String name, String pile, String type, 
                                               byte levelBonus, short goldValue) 
    {
        super(name, pile, type);
        this.levelBonus = levelBonus;
        this.goldValue = goldValue;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method gets the level bonus provided by the usable only once item.
     * @return The level bonus provided by the usable only once item.
     */
    public byte getLevelBonus()
    {
        return levelBonus;
    }
    
    /**
     * This method gets the gold value of the usable only once item
     * @return The gold value of the usable only once item.
     */
    public short getGoldValue()
    {
        return goldValue;
    }
    
} // End of SimpleUsableOnlyItem card,
