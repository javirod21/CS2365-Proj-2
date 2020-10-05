package Deck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class Card {
    public String color;
    public String special;
    public int number;
    
    public Card(String c, String s, int n){
        this.color = c;
        this.special = s;
        this.number = n;
    }
}
