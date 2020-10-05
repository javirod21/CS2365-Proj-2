
import Deck.Card;
import Deck.Deck;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int decks = 0;
        while(decks < 1 || decks > 3) {
            System.out.println("How many decks do you want to use? [1-3] ");
            String d = reader.readLine();
            decks = Integer.parseInt(d);
        }
        
        String together = "";
        if(decks > 1) {
            while(!"n".equals(together) && !"y".equals(together)) {
                System.out.println("Do you want to shuffle the decks together? [Y/N] ");
                together = reader.readLine().toLowerCase();
            }
        } else
            together = "y";
        
        String include_action = "";
        while(!"n".equals(include_action) && !"y".equals(include_action)) {
            System.out.println("Do you want to include action cards? [Y/N] ");
            include_action = reader.readLine().toLowerCase();
        }
        
        String[] colors = {"blue", "yellow", "red", "green", "none"};
        String[] special = {"Skip", "Draw 2", "Reverse", "Wild", "Wild Draw 4", "none"};
        int[] number = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10};
        
        Deck UNODeck = new Deck();
        
        tempDeckInitializer(UNODeck, colors, special, number);
    }
    
    public static void tempDeckInitializer(Deck deck, String[] colors, String[] special, int[] number) {
        /**********************************************************************/
        //Hard coded to initialize deck 
        for(int i = 0; i < 108; i++) {
            if (i >= 0 && i < 19)//blue nums
                deck.addCard(colors[0], special[5], number[i]);
            else if (i >= 19 && i < 22){//blue specials
                deck.addCard(colors[0], special[i - 19], number[19]);
                deck.addCard(colors[0], special[i - 19], number[19]);
            } else if (i >= 25 && i < 44)//yellow nums
                deck.addCard(colors[1], special[5], number[i - 25]);
            else if (i >= 44 && i < 47) {//yellow specials
                deck.addCard(colors[1], special[i - 44], number[19]);
                deck.addCard(colors[1], special[i - 44], number[19]);
            } else if (i >= 50 && i < 69)//red nums
                deck.addCard(colors[2], special[5], number[i - 50]);
            else if (i >= 69 && i < 72) {//red specials
                deck.addCard(colors[2], special[i - 69], number[19]);
                deck.addCard(colors[2], special[i - 69], number[19]);
            } else if (i >= 75 && i < 94)//green nums
                deck.addCard(colors[3], special[5], number[i - 75]);
            else if (i >= 94 && i < 97) {//green specials
                deck.addCard(colors[3], special[i - 94], number[19]);
                deck.addCard(colors[3], special[i - 94], number[19]);
            } else if(i >= 100 && i < 104){//wild and +4
                deck.addCard(colors[4], special[3], number[19]);
                deck.addCard(colors[4], special[4], number[19]);
            }
        }
        
        for (int i = 0; i < 108; i++){
            Card currCard = deck.drawCard(); //save the top card and pop it
            System.out.println("Color: " + currCard.color + " | Special: " + currCard.special + " | Number: " + currCard.number + " | No. " + Integer.toString(i + 1));
        /**********************************************************************/
        }
    }
}
