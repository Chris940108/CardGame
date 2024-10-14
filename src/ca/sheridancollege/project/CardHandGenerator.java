/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 *
 * @author primo
 */
public class CardHandGenerator {
    
    public static Card[] generateHand(int numCards){
        
        Card[] hand = new Card[numCards];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++){
            
            int numValues = Card.Value.values().length;
            Card.Value value = Card.Value.values()[random.nextInt(numValues)];
            
            int numSuits = Card.Suit.values().length;
            Card.Suit suit = Card.Suit.values()[random.nextInt(numSuits)];
            
            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }
    
}
