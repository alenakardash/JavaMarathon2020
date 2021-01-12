package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] match = new ChessPiece[8][8];

        match[0][0] = ChessPiece.ROOK_BLACK;
        match[0][5] = ChessPiece.ROOK_BLACK;
        match[0][6] = ChessPiece.KING_BLACK;
        match[1][1] = ChessPiece.ROOK_WHITE;
        match[1][4] = ChessPiece.PAWN_BLACK;
        match[1][5] = ChessPiece.PAWN_BLACK;
        match[1][7] = ChessPiece.PAWN_BLACK;

        match[2][0] = ChessPiece.PAWN_BLACK;
        match[2][2] = ChessPiece.KNIGHT_BLACK;
        match[2][6] = ChessPiece.PAWN_BLACK;

        match[3][0] = ChessPiece.QUEEN_BLACK;
        match[3][3] = ChessPiece.BISHOP_WHITE;

        match[4][3] = ChessPiece.BISHOP_BLACK;
        match[4][4] = ChessPiece.PAWN_WHITE;

        match[5][4] = ChessPiece.BISHOP_WHITE;
        match[5][5] = ChessPiece.PAWN_WHITE;

        match[6][0] = ChessPiece.PAWN_WHITE;
        match[6][3] = ChessPiece.QUEEN_WHITE;
        match[6][5] = ChessPiece.PAWN_WHITE;
        match[6][7] = ChessPiece.PAWN_WHITE;

        match[7][5] = ChessPiece.ROOK_WHITE;
        match[7][6] = ChessPiece.KING_WHITE;

        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < match[i].length; j++) {
                if (match[i][j] == null) {
                    match[i][j] = ChessPiece.EMPTY;
                }
            }
        }

        ChessBoard board = new ChessBoard(match);

        board.print();

    }
}
