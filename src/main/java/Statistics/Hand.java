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
    // array of Card objects - represents the players hand of 7 cards
    public  Card[] playerHand;
    // int counters to count the number of cards the player has
    public int blueCount = 0,redCount = 0,yellowCount = 0,greenCount= 0,specialCount = 0;
    // String to assign workout to color
    public String blueWorkout,greenWorkout,yellowWorkout,redWorkout;
    
    // Constructor which initializes the player hand
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
    
    // returns the count of each color card
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
        System.out.println("WORKOUT DETAILS: ");
        System.out.println("Blue Count: " + blueCount + " " + this.blueWorkout);
        System.out.println("Red Count: " + redCount+ " " + this.redWorkout);
        System.out.println("Green Count: " + greenCount+ " " + this.greenWorkout);
        System.out.println("Yellow Count: " + yellowCount+ " " + this.yellowWorkout);
        System.out.println("Special Count: " + specialCount);
        System.out.println("-------------------------------------------------------");
        
            
    }
    // assigns workout to colors
    public void configureWorkout(String blueWorkout,String greenWorkout,String redWorkout,String yellowWorkout){
         this.blueWorkout = blueWorkout;
         this.greenWorkout = greenWorkout;
         this.redWorkout = redWorkout;
         this.yellowWorkout = yellowWorkout;
         for(int i = 0;i<playerHand.length;i++){
             
         }
    }
}
