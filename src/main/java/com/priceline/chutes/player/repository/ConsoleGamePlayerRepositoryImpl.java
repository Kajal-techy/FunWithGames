package com.priceline.chutes.player.repository;

import com.priceline.chutes.exception.InvalidInputException;
import com.priceline.chutes.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleGamePlayerRepositoryImpl implements ChutesAndLadderPlayerRepository {

    @Override
    public List<Player> getPlayers() throws InvalidInputException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of player (between 2 - 4 ): ");
        int count = Integer.parseInt(scanner.nextLine());
        validateChutesAndLadderPlayerCount(count);

        return getPlayers(scanner, count);
    }

    private void validateChutesAndLadderPlayerCount(int count) throws InvalidInputException {
        if (count < MIN_PLAYERS) {
            throw new InvalidInputException("Number of players needs to be more than: " + MIN_PLAYERS);
        } else if (count > MAX_PLAYERS) {
            throw new InvalidInputException("Number of players needs to be more than: " + MAX_PLAYERS);
        }
    }

    private List<Player> getPlayers(Scanner scanner, int count) {
        System.out.println("Enter the names of " + count + " players: ");
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
        return players;
    }
}

