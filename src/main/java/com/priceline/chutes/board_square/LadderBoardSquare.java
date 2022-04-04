package com.priceline.chutes.board_square;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LadderBoardSquare extends BoardSquare {

    public LadderBoardSquare(int numberSquaresToSkip) {
        this.squareBoardType = SquareBoardType.LADDER;
        this.numberSquaresToSkip = numberSquaresToSkip;
    }
}
