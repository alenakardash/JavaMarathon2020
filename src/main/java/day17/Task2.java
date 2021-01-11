package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] match = new ChessPiece[8][8];

        match[0][0] = ChessPiece.ROOK_BLACK;
        match[0][1] = ChessPiece.EMPTY;
        match[0][2] = ChessPiece.EMPTY;
        match[0][3] = ChessPiece.EMPTY;
        match[0][4] = ChessPiece.EMPTY;
        match[0][5] = ChessPiece.ROOK_BLACK;
        match[0][6] = ChessPiece.KING_BLACK;
        match[0][7] = ChessPiece.EMPTY;

        match[1][0] = ChessPiece.EMPTY;
        match[1][1] = ChessPiece.ROOK_WHITE;
        match[1][2] = ChessPiece.EMPTY;
        match[1][3] = ChessPiece.EMPTY;
        match[1][4] = ChessPiece.PAWN_BLACK;
        match[1][5] = ChessPiece.PAWN_BLACK;
        match[1][6] = ChessPiece.EMPTY;
        match[1][7] = ChessPiece.PAWN_BLACK;

        match[2][0] = ChessPiece.PAWN_BLACK;
        match[2][1] = ChessPiece.EMPTY;
        match[2][2] = ChessPiece.KNIGHT_BLACK;
        match[2][3] = ChessPiece.EMPTY;
        match[2][4] = ChessPiece.EMPTY;
        match[2][5] = ChessPiece.EMPTY;
        match[2][6] = ChessPiece.PAWN_BLACK;
        match[2][7] = ChessPiece.EMPTY;

        match[3][0] = ChessPiece.QUEEN_BLACK;
        match[3][1] = ChessPiece.EMPTY;
        match[3][2] = ChessPiece.EMPTY;
        match[3][3] = ChessPiece.BISHOP_WHITE;
        match[3][4] = ChessPiece.EMPTY;
        match[3][5] = ChessPiece.EMPTY;
        match[3][6] = ChessPiece.EMPTY;
        match[3][7] = ChessPiece.EMPTY;

        match[4][0] = ChessPiece.EMPTY;
        match[4][1] = ChessPiece.EMPTY;
        match[4][2] = ChessPiece.EMPTY;
        match[4][3] = ChessPiece.BISHOP_BLACK;
        match[4][4] = ChessPiece.PAWN_WHITE;
        match[4][5] = ChessPiece.EMPTY;
        match[4][6] = ChessPiece.EMPTY;
        match[4][7] = ChessPiece.EMPTY;

        match[5][0] = ChessPiece.EMPTY;
        match[5][1] = ChessPiece.EMPTY;
        match[5][2] = ChessPiece.EMPTY;
        match[5][3] = ChessPiece.EMPTY;
        match[5][4] = ChessPiece.BISHOP_WHITE;
        match[5][5] = ChessPiece.PAWN_WHITE;
        match[5][6] = ChessPiece.EMPTY;
        match[5][7] = ChessPiece.EMPTY;

        match[6][0] = ChessPiece.PAWN_WHITE;
        match[6][1] = ChessPiece.EMPTY;
        match[6][2] = ChessPiece.EMPTY;
        match[6][3] = ChessPiece.QUEEN_WHITE;
        match[6][4] = ChessPiece.EMPTY;
        match[6][5] = ChessPiece.PAWN_WHITE;
        match[6][6] = ChessPiece.EMPTY;
        match[6][7] = ChessPiece.PAWN_WHITE;

        match[7][0] = ChessPiece.EMPTY;
        match[7][1] = ChessPiece.EMPTY;
        match[7][2] = ChessPiece.EMPTY;
        match[7][3] = ChessPiece.EMPTY;
        match[7][4] = ChessPiece.EMPTY;
        match[7][5] = ChessPiece.ROOK_WHITE;
        match[7][6] = ChessPiece.KING_WHITE;
        match[7][7] = ChessPiece.EMPTY;

        ChessBoard board = new ChessBoard(match);

        board.print();

    }
}
