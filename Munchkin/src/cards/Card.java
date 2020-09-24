package cards;

/**
 * This class simulates a card within the game of Munchkin.
 * @author Brian Sanchez
 */
public class Card 
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The name of the card.
    private final String name;
    
    // The pile of the card, "treasure" or "door" pile.
    private final String pile;
    
    // The type of the card, "GUAL", "Equippable", "UsableOnceOnly", "Monster",
    // "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" card.
    private final String type;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a Card object.
     * @param name The bane of the card.
     * @param pile The pile of the card, "treasure" or "door" pile.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     */
    public Card(String name, String pile, String type)
    {
        this.name = name;
        this.pile = pile;
        this.type = type;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method gets the name of the card.
     * @return The name of the card.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This method gets the pile of the card, "treasure" or "door" pile.
     * @return The pile of the card.
     */
    public String getPile()
    {
        return pile;
    }
    
    /**
     * This method gets the type of the card, "GUAL", "Equippable", 
     * "UsableOnceOnly", "Monster", "Curse", "Race", "Class" "MonsterEnhancer", 
     * or "SpecialDoor" card.
     * @return The type of the card.
     */
    public String getType()
    {
        return type;
    }

} // End of Card class.
