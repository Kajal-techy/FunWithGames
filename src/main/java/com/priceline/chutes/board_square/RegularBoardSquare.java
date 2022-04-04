package com.priceline.chutes.board_square;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RegularBoardSquare extends BoardSquare {

    public RegularBoardSquare() {
        this.squareBoardType = SquareBoardType.REGULAR;
        this.numberSquaresToSkip = 0;
    }
}