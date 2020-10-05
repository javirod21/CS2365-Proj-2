/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deck;

/**
 *
 * @author Javier
 */
public class Deck {
    private Card[] deck;
    private int index;
    
    public Deck() {
        this.index = 0;
        this.deck = new Card[108];
    }
    
    private Card topCard() {
        if (index == 0) {
            System.out.print("Error: Decks is empty, cannot look at top card.");
            return null;
        }
        return deck[index - 1];
    }
    
    public Card drawCard() {
        if (index == 0) {
            System.out.print("Error: Deck is empty, cannot draw card.");
            return null;
        }
        
        Card myCard = topCard();
        this.index--;
        this.deck[index] = null;
        return myCard;
    }
    
    public void addCard(String color, String special, int number) {
        if (index == 108) {
            System.out.print("Error: Deck is full, cannot add card");
            return;
        }
        
        this.deck[index] = new Card(color, special, number);
        this.index++;
    }
}
