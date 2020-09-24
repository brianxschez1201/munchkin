package munchkin;

import cards.Card;

/**
 * This class simulates the player within the game of Munchkin.
 * @author Brian Sanchez
 */
public class Player 
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The level of the player.
    private byte level;
    
    // The bonuses to the player's level provided by items.
    private byte levelBonuses;
    
    // The bonuses to the player's Runaway provided by items.
    private byte runawayBonuses;
    
    // The gold the player has.
    private short gold;
    
    // The player's hand.
    private final Hand hand;
    
    // The player's played cards.
    private final PlayedCards playedCards;
    
    // Whether or not the player has headgear.
    private boolean hasHeadgear;
    
    // Whether or not the player has armor.
    private boolean hasArmor;
    
    // Whether or not the player has footgear.
    private boolean hasFootgear;
    
    // Whether or not the player has a race.
    private boolean hasRace;
    
    // Whether or not the player has a class.
    private boolean hasClass;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a Player object.
     */
    public Player()
    {
        level = 1;
        levelBonuses = 0;
        runawayBonuses = 0;
        gold = 0;
        hand = new Hand();
        playedCards = new PlayedCards();
        hasHeadgear = false;
        hasArmor = false;
        hasFootgear = false;
        hasRace = false;
        hasClass = false;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method gets the player's level.
     * @return The player's level.
     */
    public byte getLevel()
    {
        return level;
    }
    
    /**
     * This method is used to increase the player's level by a certain amount.
     * @param amount The amount by which the player's level is increased or
     * decreased (positive for increase, negative for decrease).
     */
    public void increaseOrDecreaseLevel(byte amount)
    {
        level = (byte)(level + amount);
    }
    
    /**
     * This method gets the player's level bonuses.
     * @return The player's level bonuses.
     */
    public byte getLevelBonuses()
    {
        return levelBonuses;
    }
    
    /**
     * This method gets the strength of the player (level + level bonuses).
     * @return The strength of the player.
     */
    public byte getStrength()
    {
        return (byte)(level + levelBonuses);
    }
    
    /**
     * This method adds or removes a level bonus provided by an item to the 
     * player.
     * @param bonus The level bonus provided by an item (positive if added, 
     * negative if removed).
     */
    public void addOrRemoveLevelBonus(byte bonus)
    {
        levelBonuses = (byte)(levelBonuses + bonus);
    }
    
    /**
     * This method gets the player's Runaway bonuses.
     * @return The player's Runaway bonuses.
     */
    public byte getRunawayBonuses()
    {
        return runawayBonuses;
    }
    
    /**
     * This method adds or removes a Runaway bonus provided by an item to the
     * player.
     * @param runawayBonus The Runaway bonus provided by an item (positive if
     * added, negative if removed).
     */
    public void addOrRemoveRunawayBonus(byte runawayBonus)
    {
        runawayBonuses = (byte)(runawayBonuses + runawayBonus);
    }
    
    /**
     * This method gets the amount of gold the player has.
     * @return The amount of gold the player has.
     */
    public short getGold()
    {
        return gold;
    }
    
    /**
     * This method adds additional gold to the player's gold balance.
     * @param goldAmount The amount being added.
     */
    public void addGold(short goldAmount)
    {
        gold = (short)(gold + goldAmount);
    }
    
    /**
     * This method is used to level the player once if he has 1000 gold or more.
     */
    public void levelWithGold()
    {
        // If the player has 1000 gold or more.
        if(gold >= 1000)
        {
            // Spend 1000 gold on a level.
            gold = (short)(gold - 1000);
            level++;
        }
    }
    
    /**
     * This method is used to add a new card to the player's hand.
     * @param newCard The new card being added to the player's hand.
     */
    public void addCardToHand(Card newCard)
    {
        hand.addCard(newCard);
    }
    
    /**
     * This method is used to discard a card from a particular index of the 
     * hand array.
     * @param index The index of the card to be discarded.
     * @return The discarded card.
     */
    public Card discardOrPlayCardFromHand(byte index)
    {
        return hand.discardOrPlayCard(index);
    }
    
    /**
     * This method gets the limit to the number of cards the player can have 
     * before the end of their turn.
     * @return The limit to the number of cards the player can have before the
     * end of their turn.
     */
    public byte getHandLimit()
    {
        return hand.getLimit();
    }
    
    /**
     * This method increases the hand limit to 6 in the presence of a dwarf 
     * card.
     */
    public void addDwarfLimitToHand()
    {
        hand.addDwarfLimit();
    }
    
    /**
     * This method resets the hand limit to 5 with the removal of a dwarf card.
     */
    public void removeDwarfLimitFromHand()
    {
        hand.removeDwarfLimit();
    }
    
    /**
     * This method gets a card at a specified index of the hand array,
     * @param index The index of the card we're getting.
     * @return The card we're getting.
     */
    public Card getCardFromHand(byte index)
    {
        return hand.getCard(index);
    }
    
    /**
     * This method gets the number of cards in the player's hand.
     * @return The number of cards in the player's hand.
     */
    public byte getNumOfCardsInHand()
    {
        return hand.getCount();
    }
    
    /**
     * This method adds a new card to the player's played cards.
     * @param newCard The new card.
     */
    public void addCardToPlayedCards(Card newCard)
    {
        playedCards.addCard(newCard);
    }
    
    /**
     * This method discards a card at a particular index of the played cards
     * array.
     * @param index The index of the card to be discarded.
     * @return The discarded card.
     */
    public Card discardCardFromPlayedCards(byte index)
    {
        return playedCards.discardCard(index);
    }
    
    /**
     * This method gets a card at a specific index of the played cards array.
     * @param index The index of the card we're getting.
     * @return The card we're getting.
     */
    public Card getCardFromPlayedCards(byte index)
    {
        return playedCards.getCard(index);
    }
    
    /**
     * This method gets the number of cards in the player's played cards.
     * @return The number of cards in the player's played cards.
     */
    public byte getNumOfCardsInPlayedCards()
    {
        return playedCards.getCount();
    }
    
    /**
     * This method checks if the player has headgear.
     * @return True if they have headgear, false if they don't.
     */
    public boolean checkIfPlayerHasHeadgear()
    {
        return hasHeadgear;
    }
    
    /**
     * This method checks if the player has armor.
     * @return True if they have armor, false if they don't.
     */
    public boolean checkIfPlayerHasArmor()
    {
        return hasArmor;
    }
    
    /**
     * This method checks if the player has footgear.
     * @return True if they have footgear, false if they don't.
     */
    public boolean checkIfPlayerHasFootgear()
    {
        return hasFootgear;
    }
    
    /**
     * This method checks if the player has a race.
     * @return True if they have a race, false if they don't.
     */
    public boolean checkIfPlayerHasRace()
    {
        return hasRace;
    }
    
    /**
     * This method check if the player has a class.
     * @return True if they have a class, false if they don't.
     */
    public boolean checkIfPlayerHasClass()
    {
        return hasClass;
    }
    
} // End of Player class.
