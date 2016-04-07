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

public class BlackJackHand extends Hand<BlackJackCard> {

    public int score() {
        ArrayList<Integer> scores = possibleScores();
        int maxUnder = Integer.MIN_VALUE;
        int minOver = Integer.MAX_VALUE;

        for (Integer score : scores) {
            if (score > 21 && score < minOver) {
                minOver = score;
            } else if (score <= 21 && score > maxUnder) {
                maxUnder = score;
            }
        }

        return maxUnder == Integer.MIN_VALUE ? minOver : maxUnder;

    }

    private ArrayList<Integer> possibleScores() {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        if (cards.size() == 0) {
            return scores;
        }

        for (BlackJackCard card : cards) {
            addCardToScoreList(card, scores);
        }
        return scores;

    }

    private void addCardToScoreList(BlackJackCard card, ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            scores.add(0);
        }

        int length = scores.size();

        for (int i = 0; i < length; i++) {
            int score = scores.get(i);
            scores.set(i, score + card.minValue());
            if (card.minValue() != card.maxValue()) {
                scores.add(score + card.maxValue());
            }
        }

    }

    public boolean busted() {

        return score() > 21;

    }

    public boolean is21() {
        return score() == 21;
    }

    public boolean isBlackJack() {
        if (cards.size() != 2) {
            return false;
        }

        BlackJackCard first = cards.get(0);
        BlackJackCard second = cards.get(1);

        return (first.isAce() && second.isFaceCard()) | (first.isFaceCard() && second.isAce());
    }
}
