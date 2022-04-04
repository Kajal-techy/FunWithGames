package com.priceline.chutes.player.repository;

import com.priceline.chutes.exception.InvalidInputException;
import com.priceline.chutes.player.Player;

import java.util.List;

public interface GamePlayerRepository {
    List<Player> getPlayers() throws InvalidInputException;
}
