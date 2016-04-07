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
import java.util.ArrayList;

public class Hand<T extends Card> {

    protected ArrayList<T> cards = new ArrayList<T>();

    public int score() {
        int score = 0;

        for (T card : cards) {
            score += card.value();
        }
        return score;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }

    }
}
