package day17;

public class ChessBoard {
    private ChessPiece[][] figurePositions;

    public ChessBoard(ChessPiece[][] figurePositions) {
        this.figurePositions = figurePositions;
    }

    public ChessPiece[][] getFigurePositions() {
        return figurePositions;
    }

    public void print() {
        for (int i = 0; i < getFigurePositions().length; i++) {
            for (int j = 0; j < getFigurePositions()[i].length; j++) {
                System.out.print(getFigurePositions()[i][j] + "");
            }
            System.out.println("");
        }
    }
}