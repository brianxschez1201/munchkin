package munchkin;

import cards.Card;

/**
 * This class simulates the player's played cards within the game of Munchkin.
 * @author Brian Sanchez
 */
public class PlayedCards 
{
    //__________________________________________________________________________
    // INSTANCE VARIABLES...
    
    // The player's played cards simulated by an array of type Card.
    private Card[] playedCardsArray;
    
    // A count of the number of played cards.
    private byte count;
    
    //__________________________________________________________________________
    // CONSTRUCTOR...
    
    /**
     * This method constructs a new PlayedCards object; played cards are
     * simulated by an array of type Card with an initial size of 6 (since all
     * players start with 6 cards so therefore the max amount of cards that one
     * can possibly play at the beginning is 6) and a played cards count of 0
     * since there are 0 played cards before any cards are played.
     */
    public PlayedCards()
    {
        playedCardsArray = new Card[6];
        count = 0;
    }
    
    /**
     * This method adds a new card to the player's played cards.
     * @param newCard The new card.
     */
    public void addCard(Card newCard)
    {
        // If the played cards array is full...
        if(count == playedCardsArray.length)
        {
            // Create a new played cards array that is resized to +1 and make
            // it the new played cards array, transferring over all elements.
            Card[] resizedPlayedCards = new Card[playedCardsArray.length + 1];
            
            for(byte i = 0; i < count; i++)
            {
                resizedPlayedCards[i] = playedCardsArray[i];
            }
            
            playedCardsArray = resizedPlayedCards;
        }
        
        // Add the new card to the played cards array.
        playedCardsArray[count] = newCard;
        
        // Increment the count.
        count++;
        
    } // End of addCard method.
    
    /**a
     * This method discards a card at a particular index of the played cards 
     * array.
     * @param index The index of the card to be discarded.
     * @return The discarded card.
     */
    public Card discardCard(byte index)
    {
        // Save the card to be discarded.
        Card cardToBeDiscarded = playedCardsArray[index];
        
        // Move all cards over 1 index to take the place of the discarded card.
        for(byte i = 0; i <= count; i++)
        {
            playedCardsArray[i] = playedCardsArray[i + 1];
        }
        
        // Decrement the count;
        count--;
        
        // Return the card to be discarded.
        return cardToBeDiscarded;
        
    } // End of discardCard method.
    
    /**
     * This method gets a card at a specified index of the played cards array.
     * @param index The index of the card we're getting.
     * @return The card we're getting.
     */
    public Card getCard(byte index)
    {
        return playedCardsArray[index];
    }
    
    /**
     * This method gets the count of the number of played cards the player has.
     * @return The count of the number of played cards the player has.
     */
    public byte getCount()
    {
        return count;
    } 
    
} // End of PlayedCards class.
