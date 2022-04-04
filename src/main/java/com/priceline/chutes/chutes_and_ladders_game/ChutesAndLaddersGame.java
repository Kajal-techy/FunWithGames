package com.priceline.chutes.chutes_and_ladders_game;

import com.priceline.chutes.board.Board;
import com.priceline.chutes.dice.Dice;
import com.priceline.chutes.player.Player;

import java.util.List;

public class ChutesAndLaddersGame extends DiceBoardGame {


    public ChutesAndLaddersGame(List<Player> players, Board board, Dice dice) {
        super(players, board, dice);
    }

    @Override
    public Player playGame() {
        while (true) {
            for (Player currentPlayer : players) {
                int spinResult = dice.throwDice();
                System.out.print("Player:" + currentPlayer.toString() + ", spin: " + spinResult);

                currentPlayer = board.movePlayer(currentPlayer, spinResult);
                System.out.println("");
                if (board.isWinner(currentPlayer)) {
                    return currentPlayer;
                }
            }
        }
    }
}
