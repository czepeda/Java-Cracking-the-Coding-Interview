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
public enum Suit {

    Club(0), Diamond(1), Heart(2), Spade(3);
    private int value;

    private Suit(int v) {
        value = v;

    }

    public int getValue() {
        return value;
    }

    public static Suit getSuitFromValue(int value) {
        switch (value) {
            case 0:
                return Suit.Club;
            case 1:
                return Suit.Diamond;
            case 2:
                return Suit.Heart;
            case 3:
                return Suit.Spade;
            default:
                return null;
        }
    }
}
