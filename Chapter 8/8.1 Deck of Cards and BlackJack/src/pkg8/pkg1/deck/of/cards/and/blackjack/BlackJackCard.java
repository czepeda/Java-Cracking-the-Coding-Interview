/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg1.deck.of.cards.and.blackjack;

/**
 *
 * @author czepeda
 */
public class BlackJackCard extends Card {

    public BlackJackCard(int c, Suit s) {
        super(c, s);

    }

    public int value() {
        if (isAce()) {
            return 1;
        } else if (faceValue >= 11 && faceValue <= 13) {
            return 10;
        } else {
            return faceValue;
        }

    }

    public int minValue() {
        if (isAce()) {
            return 1;
        } else {
            return value();
        }

    }

    public int maxValue() {
        if (isAce()) {
            return 11;
        } else {
            return value();
        }
    }

    public boolean isAce() {
        return faceValue == 1;
    }

    public boolean isFaceCard() {
        return faceValue >= 11 && faceValue <= 13;
    }
}
