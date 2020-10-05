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
public class GameStatistics {
    public Card[] playerHand;
    public int blueCount = 0,redCount = 0,yellowCount = 0,greenCount= 0;
    public GameStatistics(Card[] inputHand ){
        this.playerHand = inputHand;
    }
    
    public void getColorCount(){
        
        for(int i = 0;i<playerHand.length;i++){
            if(playerHand[i].color == "BLUE"){
                blueCount++;
                
            }
            else if(playerHand[i].color == "GREEN"){
                greenCount++;
                
            }
            else if(playerHand[i].color == "RED"){
                redCount++;
            }
            else if(playerHand[i].color == "YELLOW"){
                yellowCount++;
            }
        }
        System.out.println("Blue Count: " + blueCount);
        System.out.println("Red Count: " + redCount);
        System.out.println("Green Count: " + greenCount);
        System.out.println("Yellow Count: " + yellowCount);
            
    }
}
