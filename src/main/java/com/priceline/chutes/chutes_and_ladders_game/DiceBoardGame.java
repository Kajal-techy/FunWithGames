package com.priceline.chutes.chutes_and_ladders_game;

import com.priceline.chutes.board.Board;
import com.priceline.chutes.dice.Dice;
import com.priceline.chutes.player.Player;

import java.util.List;

abstract public class DiceBoardGame {
    protected List<Player> players;
    protected Board board;
    protected Dice dice;

    public DiceBoardGame(List<Player> players, Board board, Dice dice) {
        this.players = players;
        this.board = board;
        this.dice = dice;
    }

    abstract public Player playGame();
}
