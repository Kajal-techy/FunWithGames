package com.priceline.chutes.board_square;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChuteBoardSquare extends BoardSquare {

    public ChuteBoardSquare(int numberSquaresToSkip) {
        this.squareBoardType = SquareBoardType.CHUTE;
        this.numberSquaresToSkip = -1 * numberSquaresToSkip;
    }
}
