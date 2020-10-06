package Statistics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Deck.Card;



/**
 *
 * @author David Hoefs
 */
public class Hand {
    public  Card[] playerHand;
    public int blueCount = 0,redCount = 0,yellowCount = 0,greenCount= 0,specialCount = 0;
    public Hand(Card[] inputHand ){
        this.playerHand = inputHand;
    }
    
    // insertion sort for sorting hand
    
    public  void sortHand(){
       boolean sameColor = false;
        for(int i = 0;i<playerHand.length - 1;i++){
            for(int k = i+1;k>0;k--){
                final Card card = getNextCard(k);
                final Card card2 = getNextCard(k - 1);
                if(card.color == card2.color){
                    sameColor = true;
                }
                if(card.color != card2.color ){
                    swapCards(k,k-1);
                    sameColor = false;
                    
                    
                }
                else if(card.number < card2.number && sameColor){
                    swapCards(k,k-1);
                }else{
                    break;
                }
                
            }
        }
    }
    
    // swap method for insertion sort
    private void swapCards(int index,int index2){
        Card tempCard = playerHand[index];
        Card tempCard2 = playerHand[index2];
        playerHand[index] = tempCard2;
        playerHand[index2] = tempCard;
    }
    
    // returns the card at the input index
    private  Card getNextCard(int index){
        
        return this.playerHand[index];
    }
    public void getColorCount(){
        
        for(int i = 0;i<playerHand.length;i++){
            if(playerHand[i].color.toString() == "blue"){
                blueCount++;
                
            }
            else if(playerHand[i].color.toString() == "green"){
                greenCount++;
                
            }
            else if(playerHand[i].color.toString() == "red"){
                redCount++;
            }
            else if(playerHand[i].color.toString() == "yellow"){
                yellowCount++;
            }else{
                specialCount++;
            }
        }
        System.out.println("Blue Count: " + blueCount);
        System.out.println("Red Count: " + redCount);
        System.out.println("Green Count: " + greenCount);
        System.out.println("Yellow Count: " + yellowCount);
        System.out.println("Special Count: " + specialCount);
        
            
    }
}
