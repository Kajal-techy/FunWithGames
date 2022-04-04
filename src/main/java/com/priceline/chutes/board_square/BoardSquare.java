package com.priceline.chutes.board_square;

public abstract class BoardSquare {

    public SquareBoardType squareBoardType;
    public int numberSquaresToSkip = 0;

    public int getNumberSquaresToSkip() {
        if (squareBoardType != SquareBoardType.REGULAR) {
            System.out.print(".." + squareBoardType + " encountered");
        }
        return this.numberSquaresToSkip;
    }
}
