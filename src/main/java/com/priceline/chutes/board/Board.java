package com.priceline.chutes.board;

import com.priceline.chutes.board_square.BoardSquare;
import com.priceline.chutes.board_square.ChuteBoardSquare;
import com.priceline.chutes.board_square.LadderBoardSquare;
import com.priceline.chutes.board_square.RegularBoardSquare;
import com.priceline.chutes.player.Player;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Map.entry;

// TODO : Interface for this with different implementation of Board100, Board200 etc
public class Board {

    // TODO: Can we make it configurable through configuration file
    int MAX_SQUARE = 100;

    // TODO: In future we can apply validation on square board if all the entries are valid
    List<BoardSquare> squares;

    // TODO: Separate interface for initializers eg
    // Interface: ChutesAndLadderInitializer
    // Implementations: HardcodedInitializerImpl, RandomInitializerImpl, ConfigurationInitializerImpl etc
    Map<Integer, BoardSquare> specialSquares = Map.ofEntries(
            entry(1, new LadderBoardSquare(37)),
            entry(4, new LadderBoardSquare(10)),
            entry(9, new LadderBoardSquare(22)),
            entry(16, new ChuteBoardSquare(10)),
            entry(21, new LadderBoardSquare(21)),
            entry(28, new LadderBoardSquare(56)),
            entry(36, new LadderBoardSquare(8)),
            entry(47, new ChuteBoardSquare(21)),
            entry(49, new ChuteBoardSquare(38)),
            entry(51, new LadderBoardSquare(16)),
            entry(56, new ChuteBoardSquare(3)),
            entry(62, new ChuteBoardSquare(43)),
            entry(64, new ChuteBoardSquare(4)),
            entry(71, new LadderBoardSquare(20)),
            entry(80, new LadderBoardSquare(20)),
            entry(87, new ChuteBoardSquare(63)),
            entry(93, new ChuteBoardSquare(20)),
            entry(95, new ChuteBoardSquare(20)),
            entry(98, new ChuteBoardSquare(20))
    );

    public Board() {
        squares = java.util.stream.IntStream.rangeClosed(1, 100)
                .mapToObj(i -> Optional
                        .ofNullable(specialSquares.get(i))
                        .orElseGet(RegularBoardSquare::new))
                .collect(Collectors.toList());
    }

    /**
     * Moves the player based on its position and spin-result
     * Leverages the board-square type of the new position and either goes up/down/stay-same based on
     * whether there was a ladder or chute or none.
     *
     * @return The player at its new position
     */
    public Player movePlayer(Player player, int spinResult) {
        int nextPosition = player.getPosition() + spinResult;
        if (nextPosition > MAX_SQUARE) {
            System.out.print(".. Outside Range, dont move");
            return player;
        }
        BoardSquare nextSquare = getSquareAtPosition(nextPosition);
        nextPosition += nextSquare.getNumberSquaresToSkip();
        System.out.print(" .. Next Position -> " + nextPosition);
        if (nextPosition <= MAX_SQUARE) {
            player.setPosition(nextPosition);
        }
        return player;
    }

    /**
     * Finds whether the player provided is the winner of the game based on player's position
     */
    public boolean isWinner(Player player) {
        return player.getPosition() == MAX_SQUARE;
    }

    private BoardSquare getSquareAtPosition(int i) {
        return squares.get(i - 1);
    }
}
