package cards.doors.monstercards;

import cards.Card;

/**
 * This class simulates a monster card within the game of Munchkin.
 * @author Brian Sanchez
 */
public class MonsterCard extends Card
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The level of the monster.
    private byte level;
    
    // The level bonuses on the monster.
    private byte levelBonuses;
    
    // The number of treasures the monster drops.
    private byte numOfTreasures;
    
    // The levels the player gains if the monster is defeated.
    private byte levelsToGain;
    
    // The level or below of player that the monster will not pursue.
    private byte willNotPursueOrBelowLevel;
    
    // Whether or not the monster is undead.
    private boolean undeadStatus;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...

    /**
     * This method constructs a MonsterCard object.
     * @param name The name of the card.
     * @param pile The pile the card belongs to, "treasure" or "door" pile.
     * @param type The type of the card, "GUAL", "Equippable", "UsableOnceOnly", 
     * "Monster", "Curse", "Race", "Class" "MonsterEnhancer", or "SpecialDoor" 
     * card.
     * @param level The level of the monster.
     * @param numOfTreasures The number of treasures the monster drops.
     * @param levelsToGain The levels the player gains if the monster is 
     * defeated.
     * @param willNotPursueOrBelowLevel The level or below of player that the
     * monster will not pursue.
     * @param undeadStatus Whether or not the monster is classified as undead.
     */
    public MonsterCard(String name, String pile, String type, byte level, 
         byte numOfTreasures, byte levelsToGain, byte willNotPursueOrBelowLevel,
                                                           boolean undeadStatus) 
    {
        super(name, pile, type);
        this.level = level;
        levelBonuses = 0;
        this.numOfTreasures = numOfTreasures;
        this.levelsToGain = levelsToGain;
        this.willNotPursueOrBelowLevel = willNotPursueOrBelowLevel;
        this.undeadStatus = undeadStatus;
    }
    
    public byte getLevel()
    {
        return level;
    }
    
    public byte getLevelBonuses()
    {
        return levelBonuses;
    }
    
    public void addBonus(byte bonus)
    {
        levelBonuses = (byte)(levelBonuses + bonus);
    }
    
    public byte getStrength()
    {
        return (byte)(level + levelBonuses);
    }
    
    
} // End of MonsterCard class.
