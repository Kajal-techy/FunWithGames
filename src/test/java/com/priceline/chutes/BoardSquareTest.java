package com.priceline.chutes;

import com.priceline.chutes.board_square.BoardSquare;
import com.priceline.chutes.board_square.ChuteBoardSquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardSquareTest {

    @Test
    public void aChuteShouldSkipSquaresReversed(){
        BoardSquare square = new ChuteBoardSquare(10);
        assertTrue(square.getNumberSquaresToSkip() < 0);
    }
}
