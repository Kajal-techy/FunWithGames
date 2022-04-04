package com.priceline.chutes;

import com.priceline.chutes.board.Board;
import com.priceline.chutes.chutes_and_ladders_game.ChutesAndLaddersGame;
import com.priceline.chutes.chutes_and_ladders_game.DiceBoardGame;
import com.priceline.chutes.dice.SixDice;
import com.priceline.chutes.player.Player;
import com.priceline.chutes.player.repository.ConsoleGamePlayerRepositoryImpl;
import com.priceline.chutes.player.repository.GamePlayerRepository;

import java.util.List;

public class FunWithGames {

    public static void main(String[] args) {
        try {
            GamePlayerRepository playerRepo = new ConsoleGamePlayerRepositoryImpl();
            List<Player> players = playerRepo.getPlayers();

            System.out.println(">>>>>>>>>>>>>>>>>>>>  START GAME <<<<<<<<<<<<<<<<<<<<<<<<");
            DiceBoardGame diceBoardGame = new ChutesAndLaddersGame(players, new Board(), new SixDice());
            Player winner = diceBoardGame.playGame();
            System.out.println(">>>>>>>>>>>>>>>>>>>>  The winner is: " + winner.getName() + "  <<<<<<<<<<<<<<<<<<<<<<<<");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
