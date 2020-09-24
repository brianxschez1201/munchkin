package cards.treasurecards.equippablecards;

import cards.Card;

/**
 * This class simulates an equippable item card within the game of Munchkin.
 * @author Brian Sanchez
 */
public class EquippableItemCard extends Card
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The original level bonus of the equippable item printed on the card.
    private byte originalLevelBonus;
    
    // The current level bonus of the equippable item (may or may not be
    // affected by the "Cursed Thingy" curse.
    private byte currentLevelBonus;
    
    // The original Runaway bonus of the equippable item printed on the card.
    private final byte originalRunawayBonus;
    
    // The current Runaway bonus of the equippable item (may or may not be
    // affected by the "Cursed Thingy" curse.
    private byte currentRunawayBonus;
    
    // Indicates what race/class/gender the equippable item might be exclusive 
    //to ("elf", "dwarf", "thief", "female", "any", etc.)
    private final String usableOnlyBy;
    
    // The classification of the equippable item ("headgear", "armor", 
    // "footgear", or "other".
    private final String classification;
    
    // A boolean indicating whether or not the equippable item is big.
    private final boolean bigStatus;
    
    // A boolean indicating whether or not the equippable item is discardable.
    private boolean discardable;
    
    // The equippable item's gold value.
    private final short goldValue;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...

    /**
     * This method constructs an EquippableItemCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door".
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     * @param originalLevelBonus The original level bonus of the equippable item 
     * printed on the card.
     * @param originalRunawayBonus The original Runaway bonus of the equippable 
     * item printed on the card.
     * @param usableOnlyBy Indicates what race/class/gender the equippable item 
     * might be exclusive to ("elf", "dwarf", "thief", "female", "any", etc.)
     * @param classification The classification of the equippable item 
     * ("headgear", "armor", "footgear", or "other".
     * @param bigStatus  A boolean indicating whether or not the equippable item 
     * is big.
     * @param goldValue The equippable item's gold value.
     */
    public EquippableItemCard(String name, String pile, String type, 
        byte originalLevelBonus, byte originalRunawayBonus, String usableOnlyBy,
                      String classification, boolean bigStatus, short goldValue)
    {
        super(name, pile, type);
        this.originalLevelBonus = originalLevelBonus;
        currentLevelBonus = originalLevelBonus;
        this.originalRunawayBonus = originalRunawayBonus;
        currentRunawayBonus = originalRunawayBonus;
        this.usableOnlyBy = usableOnlyBy;
        this.classification = classification;
        this.bigStatus = bigStatus;
        this.discardable = true;
        this.goldValue = goldValue;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method gets the current level bonus of the equippable item.
     * @return The current level bonus of the equippable item.
     */
    public byte getLevelBonus()
    {
        return currentLevelBonus;
    }
    
    public void setLevelBonus(byte newBonus)
    {
        originalLevelBonus = newBonus;
        currentLevelBonus = originalLevelBonus;
    }
    
    /**
     * This method gets the current Runaway bonus of the equippable item.
     * @return The current Runaway bonus of the equippable item.
     */
    public byte getRunawayBonus()
    {
        return currentRunawayBonus;
    }
    
    /**
     * This method gets whether or not the equippable item is discardable.
     * @return True, if discardable, false if not discardable.
     */
    public boolean getWhetherDiscardableOrNot()
    {
        return discardable;
    }
    
    /**
     * This method adds the effects of the "Cursed Thingy" curse to the
     * equippable item, making its current bonuses equal to 0 and making it
     * undiscardable.
     */
    public void addCursedThingy()
    {
        currentLevelBonus = 0;
        currentRunawayBonus = 0;
        discardable = false;
    }
    
    /**
     * This method removes the effects of the "Cursed Thingy" curse from the
     * equippable item, resetting its current bonuses to their original values
     * and making it discardable again.
     */
    public void removeCursedThingy()
    {
        currentLevelBonus = originalLevelBonus;
        currentRunawayBonus = originalRunawayBonus;
        discardable = true;
    }
    
    /**
     * This methods gets whom the equippable item is usable only by ("elf", 
     * "dwarf", "thief", "female", "any", etc.)
     * @return Whom the equippable item is usable only by.
     */
    public String getUsableOnlyBy()
    {
        return usableOnlyBy;
    }
    
    /**
     * This method gets the classification of the equippable item ("headgear", 
     * "armor", "footgear", or "other".
     * @return the classification of the equippable item.
     */
    public String getClassification()
    {
        return classification;
    }
    
    /**
     * This method gets whether the equippable item is big or not.
     * @return True if big, false if small.
     */
    public boolean getBigStatus()
    {
        return bigStatus;
    }
    
    /**
     * This method gets the gold value of the equippable item.
     * @return The gold value of the equippable item.
     */
    public short getGoldValue()
    {
        return goldValue;
    }
    
} // End of EquippableItemCard class.
