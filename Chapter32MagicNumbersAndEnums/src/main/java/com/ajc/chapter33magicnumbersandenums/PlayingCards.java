/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33magicnumbersandenums;

import java.util.Random;

public class PlayingCards {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        CardSuits cardSuits;
        
        int randomNumber = random.nextInt();
        
    }
    
    public enum CardSuits {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    
    public enum CardRanks {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }    
    
}
