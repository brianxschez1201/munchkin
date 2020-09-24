package munchkin;

import cards.Card;

/**
 * This class simulates a player's hand within the game of Munchkin.
 * @author Brian Sanchez
 */
public class Hand 
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The player's hand simulated by an array of type Card.
    private Card[] handArray;
    
    // The limit to the number of cards a player can have in their hand before
    // the end of their turn.
    private byte limit;
    
    // A count of the number of cards in the player's hand.
    private byte count;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a new Hand object; the hand is simulated by an
     * array of type Card with an initial size of 6 (since all players start
     * with 6 cards, a hand limit of 5 (since players must have 6 cards before
     * the end of their turn), and a hand count of 0 since the hand is empty
     * before cards are dealt.
     */
    public Hand()
    {
        handArray = new Card[6];
        limit = 5;
        count = 0;
    }
    
    //__________________________________________________________________________
    // METHODS...
    
    /**
     * This method is used to add a new card to the player's hand.
     * @param newCard The new card to be added to the player's hand.
     */
    public void addCard(Card newCard)
    {
        // If hand array is full...
        if(count == handArray.length)
        {
            // Create a new hand array that is resized to +1 and make that the
            // new hand array, transferring over all elements.
            Card[] resizedHand = new Card[handArray.length + 1];
            
            for(byte i = 0; i < count; i++)
            {
                resizedHand[i] = handArray[i];
            }
            
            handArray = resizedHand;
        }
        
        // Add the new card to the hand array.
        handArray[count] = newCard;
        
        // Increment the count.
        count++;
        
    } // End of addCard method.
    
    /**
     * This method is used to discard or play a card from the player's hand.
     * @param index The index of the card to be discarded/played.
     * @return The discarded/played card.
     */
    public Card discardOrPlayCard(byte index)
    {
        // Save the card to be discarded.
        Card cardToBeDiscarded = handArray[index];
        
        // Move all cards over 1 index to take the place of the discarded card.
        for(byte i = index; i <= count; i++)
        {
            handArray[i] = handArray[i + 1];
        }
        
        // Decrement the count.
        count--;
        
        // Return the card to be discarded.
        return cardToBeDiscarded;
        
    } // End of discardCard method.
    
    /**
     * This method gets the limit to the number of cards the player can have
     * before the end of their turn.
     * @return The limit to the number of cards the player can have before the
     * end of their turn.
     */
    public byte getLimit()
    {
        return limit;
    }
    
    /**
     * This method increases the hand limit to 6 in the presence of a dwarf
     * card.
     */
    public void addDwarfLimit()
    {
        limit = 6;
    }
    
    /**
     * This method resets the hand limit to 5 with the removal of a dwarf card.
     */
    public void removeDwarfLimit()
    {
        limit = 5;
    }
    
    /**
     * This method gets a count of the number of cards in the hand.
     * @return A count of the number of cards in the hand.
     */
    public byte getCount()
    {
        return count;
    }
    
    /**
     * This method gets a card at a specified index of the hand array.
     * @param index The index of the card we're getting.
     * @return The card we're getting.
     */
    public Card getCard(byte index)
    {
        return handArray[index];
    }
     
} // End of Hand class.
